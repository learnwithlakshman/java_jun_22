package com.careerit.cj.day15;

public class Player {

	private String name;
	private String role;
	private double amount;
	private String country;
	private String teamName;

	public Player(String name, String role, double amount, String country, String teamName) {
		this.name = name;
		this.role = role;
		this.amount = amount;
		this.country = country;
		this.teamName = teamName;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public double getAmount() {
		return amount;
	}

	public String getCountry() {
		return country;
	}

	public String getTeamName() {
		return teamName;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", role=" + role + ", amount=" + amount + ", country=" + country + ", teamName="
				+ teamName + "]";
	}
	

}
