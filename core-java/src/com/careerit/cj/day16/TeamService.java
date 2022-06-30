package com.careerit.cj.day16;

import java.util.ArrayList;
import java.util.List;

public class TeamService {
  
    private List<Team> teamList;

    private FileReaderUtil fileReaderUtil = new FileReaderUtil();

    public TeamService(){
        teamList = fileReaderUtil.getTeamDetails();
    }
    public Team getTeamByTeamCode(String teamCode){
        for(Team team:teamList){
            if(team.getCode().equals(teamCode)){
                return team;
            }
        }
        return null;
    }
    public List<TeamAmount> getAmountSpentByEachTeam(){
        List<TeamAmount> teamAmountList = new ArrayList<>();
        System.out.println("Total team count "+teamList.size());
        for(Team team:teamList){
            String teamName=team.getName();
            String teamCode = team.getCode();
            double totalAmount = 0;
            for(Player player:team.getPlayers()){
                totalAmount+=player.getAmount();
            }
            TeamAmount obj = new TeamAmount(teamCode,teamName,totalAmount);
            teamAmountList.add(obj);
        }
        return teamAmountList;
    }
}
