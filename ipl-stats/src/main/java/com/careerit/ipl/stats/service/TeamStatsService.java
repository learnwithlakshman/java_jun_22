package com.careerit.ipl.stats.service;

import com.careerit.ipl.stats.domain.PlayerDetails;
import com.careerit.ipl.stats.dto.RoleCountAmountDto;
import com.careerit.ipl.stats.dto.TeamRoleCountAmountDto;
import com.careerit.ipl.stats.dto.TeamsAmountDto;


import java.util.List;

public interface TeamStatsService {

        public List<PlayerDetails> getPlayers(String teamLabel);
        public List<TeamRoleCountAmountDto> getRoleAmount(String teamLabel);
        public List<TeamsAmountDto> getAmountSpentByTeams();
        public List<RoleCountAmountDto> getRoleAmountAndCountOfTeams();

        List<String> getTeamLabels();
}
