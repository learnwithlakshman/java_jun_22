package com.careerit.cj.day15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PlayerService {

	private static List<Player> players;

	static {
		players = new ArrayList<Player>();
		try {
			List<String> list = Files.readAllLines(Path.of("player_data.csv"));
			for (int i = 1; i < list.size(); i++) {
				String[] data = list.get(i).split(",");
				String name = data[0];
				String role = data[1];
				double amount = Double.parseDouble(data[2]);
				String country = data[3];
				String teamName = data[4];
				Player player = new Player(name, role, amount, country, teamName);
				players.add(player);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void showTeamStats(String teamName) {

		List<Player> filterList = new ArrayList<Player>();
		for (Player player : players) {
			if (player.getTeamName().equals(teamName)) {
				filterList.add(player);
			}
		}

		if (filterList.size() == 0) {
			System.out.println("The team :" + teamName + " has no players");
		} else {
			double sum = 0;
			double max = filterList.get(0).getAmount();
			double min = filterList.get(0).getAmount();
			for (Player player : filterList) {
				if (max < player.getAmount()) {
					max = player.getAmount();
				}
				if (min > player.getAmount()) {
					min = player.getAmount();
				}
				sum += player.getAmount();
			}

			System.out.println("Team name    :" + teamName);
			System.out.println("Total amount :" + sum);
			System.out.println("Player count :" + filterList.size());
			System.out.println("Max amount   :" + max);
			System.out.println("Min amount   :" + min);
		}

	}
	public void showMaxPaidPlayers(String teamName) {
		
	}
	public void showMaxPaidPlayers(String teamName,String role) {
		
	}
	public void showRoleStats(String teamName) {
		
	    
	}
	public void showMaxPaidPlayers() {
		double max = getMaxAmount();
		for(Player player:players) {
			if(max == player.getAmount()) {
				System.out.println(player);
			}
		}
		
	}

	private double getMaxAmount() {
		double max = players.get(0).getAmount();
		for(Player player:players) {
			if(max < player.getAmount()) {
				max = player.getAmount();
			}
		}
		return max;
	}

}
