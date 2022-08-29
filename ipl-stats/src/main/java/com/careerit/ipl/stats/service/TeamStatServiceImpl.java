package com.careerit.ipl.stats.service;

import com.careerit.ipl.stats.domain.PlayerDetails;
import com.careerit.ipl.stats.dto.RoleCountAmountDto;
import com.careerit.ipl.stats.dto.TeamRoleCountAmountDto;
import com.careerit.ipl.stats.dto.TeamsAmountDto;
import com.careerit.ipl.stats.repository.PlayerDetailsRepo;
import com.careerit.ipl.stats.service.exception.TeamNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class TeamStatServiceImpl implements  TeamStatsService {
    @Autowired
    private PlayerDetailsRepo playerDetailsRepo;

    @Override
    public List<PlayerDetails> getPlayers(String teamLabel) {
       List<PlayerDetails> playerList=playerDetailsRepo.findByTeamLabel(teamLabel);
       if(CollectionUtils.isNotEmpty(playerList)){
           log.info("Team {} has total {} players",teamLabel,playerList.size());
           return playerList;
       }
       log.info("Team {} has no players or team label is not found",teamLabel);
        String message = String.format("Team label %s is not found",teamLabel);
        throw new TeamNotFoundException(message);

    }

    @Override
    public List<TeamRoleCountAmountDto> getRoleAmount(String teamLabel) {
        List<TeamRoleCountAmountDto> teamRoleAmountDtoList = playerDetailsRepo.findTeamRoleAmount(teamLabel);
        log.info("Team {} has {} roles",teamLabel,teamRoleAmountDtoList.size());
        return teamRoleAmountDtoList;
    }

    @Override
    public List<TeamsAmountDto> getAmountSpentByTeams() {
        List<TeamsAmountDto> list=playerDetailsRepo.findAmountSpentByTeams();
        return list;
    }

    @Override
    public List<RoleCountAmountDto> getRoleAmountAndCountOfTeams() {
        List<RoleCountAmountDto> list=playerDetailsRepo.findRoleAmountAndCountOfTeams();
        return list;
    }

    @Override
    public List<String> getTeamLabels() {
        return playerDetailsRepo.findTeamLabels();
    }


}
