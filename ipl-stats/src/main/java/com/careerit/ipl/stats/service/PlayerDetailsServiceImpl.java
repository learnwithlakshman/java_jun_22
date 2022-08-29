package com.careerit.ipl.stats.service;
import com.careerit.ipl.stats.domain.PlayerDetails;
import com.careerit.ipl.stats.repository.PlayerDetailsRepo;
import com.opencsv.CSVReader;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PlayerDetailsServiceImpl implements PlayerDetailsService {

    @Autowired
    private PlayerDetailsRepo playerDetailsRepo;
    @Override
    public List<PlayerDetails> importPlayer(MultipartFile multipartFile) {
        List<PlayerDetails> playerDetailsList=new ArrayList<>();
        try {
            File convFile = new File(System.getProperty("java.io.tmpdir")+"/"+multipartFile.getName());
            multipartFile.transferTo(convFile);
            List<String[]> list = readAllLines(Paths.get(convFile.toURI()));
            log.info("The file :{} has {} players",multipartFile.getName(),list.size()-1);
            playerDetailsList  =list.stream().skip(1).map(arr->{
                return convertToPlayerDetails(arr);
            }).collect(Collectors.toList());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        List<PlayerDetails> savedList = playerDetailsRepo.saveAll(playerDetailsList);
        log.info("Total {} players are added",savedList.size());
        return savedList;
    }

    private PlayerDetails convertToPlayerDetails(String[] arr) {
        int count = 0;
        String name = StringUtils.trim(arr[count++]);
        String teamLabel =  StringUtils.trim(arr[count++]);
        String role =  StringUtils.trim(arr[count++]);
        double amount =  Double.parseDouble(StringUtils.trim(arr[count++]))*1000000;
        String country =  StringUtils.trim(arr[count++]);

        PlayerDetails playerDetails = new PlayerDetails();
        playerDetails.setName(name);
        playerDetails.setAmount(amount);
        playerDetails.setCountry(country);
        playerDetails.setRole(role);
        playerDetails.setTeamLabel(teamLabel);
        return playerDetails;

    }

    private List<String[]> readAllLines(Path filePath) throws Exception {
        try (Reader reader = Files.newBufferedReader(filePath)) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                return csvReader.readAll();
            }
        }
    }
}
