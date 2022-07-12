package com.careerit.cj.day21;

public class AccountDto {
	private int id;
	private String name;
	private double loanAmount;
	private int loanTerm;
	private double interestRate;
	private double emiAmount;
	public AccountDto(int id, String name, double loanAmount, int loanTerm, double interestRate, double emiAmount) {
		this.id = id;
		this.name = name;
		this.loanAmount = loanAmount;
		this.loanTerm = loanTerm;
		this.interestRate = interestRate;
		this.emiAmount = emiAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	
	
}
