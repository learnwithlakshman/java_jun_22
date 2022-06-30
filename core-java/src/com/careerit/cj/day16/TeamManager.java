package com.careerit.cj.day16;

import java.util.List;

public class TeamManager {
    public static void main(String[] args) {
        
            TeamService teamService = new TeamService();
            Team team= teamService.getTeamByTeamCode("CSK");
            System.out.println(team.getName()+" has "+team.getPlayers().size()+" players");
            List<TeamAmount> teamAount = teamService.getAmountSpentByEachTeam();
            for(TeamAmount obj:teamAount){
                        
                    System.out.println(obj.getTeamCode());
                    System.out.println(obj.getTeamName());
                    System.out.println(obj.getTotalAmount());
            }
    }
}
