package com.careerit.ipl.stats.controller;

import com.careerit.ipl.stats.domain.PlayerDetails;
import com.careerit.ipl.stats.service.PlayerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/player/")
public class PlayerDetailsController {

    @Autowired
    private PlayerDetailsService playerDetailsService;

    @PostMapping("/upload")
    public List<PlayerDetails> imporPlayer(@RequestParam("file") MultipartFile multipartFile){
        return playerDetailsService.importPlayer(multipartFile);
    }
}
