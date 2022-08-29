package com.careerit.ipl.stats.repository;

import com.careerit.ipl.stats.domain.PlayerDetails;
import com.careerit.ipl.stats.dto.RoleCountAmountDto;
import com.careerit.ipl.stats.dto.TeamRoleCountAmountDto;
import com.careerit.ipl.stats.dto.TeamsAmountDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerDetailsRepo extends JpaRepository<PlayerDetails,Long> {
    List<PlayerDetails> findByTeamLabel(String teamLabel);

    @Query(value = "select new com.careerit.ipl.stats.dto.TeamRoleCountAmountDto(teamLabel,role,count(role),sum(amount)) from PlayerDetails where teamLabel=:teamLabel group by teamLabel,role")
    List<TeamRoleCountAmountDto> findTeamRoleAmount(@Param("teamLabel") String teamLabel);
    @Query(value = "select new com.careerit.ipl.stats.dto.TeamRoleCountAmountDto(teamLabel,role,count(role),sum(amount)) from PlayerDetails  group by teamLabel,role")
    List<TeamRoleCountAmountDto> findTeamRoleAmount();

    @Query(value = "select new com.careerit.ipl.stats.dto.TeamsAmountDto(teamLabel,sum(amount)) from PlayerDetails group by teamLabel")
    List<TeamsAmountDto> findAmountSpentByTeams();
    @Query(value = "select new com.careerit.ipl.stats.dto.RoleCountAmountDto(role,count(*),sum(amount)) from PlayerDetails group by role")
    List<RoleCountAmountDto> findRoleAmountAndCountOfTeams();
    @Query(value = "select distinct(teamLabel) from PlayerDetails")
    List<String> findTeamLabels();
}

