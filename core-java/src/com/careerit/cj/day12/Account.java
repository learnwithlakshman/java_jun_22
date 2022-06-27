package com.careerit.cj.day12;

public class Account {

	private String accNumber;
	private String name;
	private double balance;

	public Account(String accNumber, String name, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("After withdraw of " + amount + " account has balance :" + balance);
		} else {
			System.out.println("Dear " + name + " you don't have sufficient funds");
		}
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("After deposit of " + amount + " account has balance :" + balance);
	}

	public void showBalance() {
		System.out.println("Account " + accNumber + " has balance :" + balance);
	}
	
	public void showAccountInfo() {
		System.out.println("Account number :"+accNumber);
		System.out.println("Name           :"+name);
		System.out.println("Balance        :"+balance);
	}
}
