package com.careerit.cj.day21;

public class AccountInterestAmountDto {

		private String name;
		private double amount;
		private double totalInterest;
		private double interestAmount;
		
		public AccountInterestAmountDto(String name, double amount, double totalInterest, double interestAmount) {
			super();
			this.name = name;
			this.amount = amount;
			this.totalInterest = totalInterest;
			this.interestAmount = interestAmount;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public double getTotalInterest() {
			return totalInterest;
		}
		public void setTotalInterest(double totalInterest) {
			this.totalInterest = totalInterest;
		}
		public double getInterestAmount() {
			return interestAmount;
		}
		public void setInterestAmount(double interestAmount) {
			this.interestAmount = interestAmount;
		}
		
		
}
