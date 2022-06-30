package com.careerit.cj.day16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {

    private static List<Player> players;
    private static Long playerId = 1001L;
    private static Long teamId = 2001L;
    private static List<Team> teams;

    static {
        teams = new ArrayList<>();
        try {
            List<String> list = Files.readAllLines(Path.of("team.csv"));
            for (int i = 1; i < list.size(); i++) {
                String[] data = list.get(i).split(",");
                String teamCode = data[0];
                String teamName = data[1];
                Team team = new Team(getNewTeamId(), teamName,teamCode);
                teams.add(team);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static {
        players = new ArrayList<>();
        try {
            List<String> list = Files.readAllLines(Path.of("player_data.csv"));
            for (int i = 1; i < list.size(); i++) {
                String[] data = list.get(i).split(",");
                String name = data[0];
                String role = data[1];
                double amount = Double.parseDouble(data[2]);
                String country = data[3];
                String teamName = data[4];
                Player player = new Player(getNewPlayerId(), name, role, country, teamName, amount);
                players.add(player);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Long getNewPlayerId() {
        return playerId++;
    }

    private static Long getNewTeamId() {
        return teamId++;
    }

    public List<Team> getTeamDetails() {

        for (Team team : teams) {
            List<Player> playerList = getPlayersByTeam(team.getCode());
            team.addPlayers(playerList);
        }
        return teams;

    }

    private List<Player> getPlayersByTeam(String teamCode) {
        List<Player> filterList = new ArrayList<Player>();
        for (Player player : players) {
            if (player.getTeamCode().equals(teamCode)) {
                filterList.add(player);
            }
        }
        return filterList;
    }
}
