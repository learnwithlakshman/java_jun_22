package com.careerit.ipl.stats.controller;

import com.careerit.ipl.stats.domain.PlayerDetails;
import com.careerit.ipl.stats.dto.RoleCountAmountDto;
import com.careerit.ipl.stats.dto.TeamRoleCountAmountDto;
import com.careerit.ipl.stats.dto.TeamsAmountDto;
import com.careerit.ipl.stats.service.TeamStatsService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/team/stats")
public class TeamStatsController {

    @Autowired
    private TeamStatsService teamStatsService;

    @GetMapping("/{teamlabel}/players")
    public ResponseEntity<List<PlayerDetails>> getPlayers(@PathVariable("teamlabel") String teamLabel ){
        return ResponseEntity.ok(teamStatsService.getPlayers(teamLabel));
    }

    @GetMapping("/{teamlabel}/teamamount")
    public ResponseEntity<List<TeamRoleCountAmountDto>> getRoleAndAmount(@PathVariable("teamlabel") String teamLabel){
        return ResponseEntity.ok(teamStatsService.getRoleAmount(teamLabel));
    }
    @GetMapping("/amounts")
    public ResponseEntity<List<TeamsAmountDto>> getTeamsAmountDetails(){
            return ResponseEntity.ok(teamStatsService.getAmountSpentByTeams());
    }
    @GetMapping("/roles")
    public ResponseEntity<List<RoleCountAmountDto>> getTeamsRoleCountAndAmountDetails(){
        return ResponseEntity.ok(teamStatsService.getRoleAmountAndCountOfTeams());
    }

    @GetMapping("/labels")
    public ResponseEntity<List<String>> getTeamLabels(){
        return  ResponseEntity.ok(teamStatsService.getTeamLabels());
    }

}
