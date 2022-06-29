package com.careerit.cj.day15;

import java.util.Scanner;

public class PlayerManager {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the team name :");
			String teamName = sc.nextLine();
			PlayerService playerService = new PlayerService();
			playerService.showTeamStats(teamName);
			
			System.out.println("----- Max paid player(s) -----");
			playerService.showMaxPaidPlayers();
			sc.close();
	
	}
}
