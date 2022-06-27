package com.careerit.cj.day12;

public class AccountManager {

		public static void main(String[] args) {
			Account acc1 = new Account("SB-1234567890","Krish",56000);
			Account acc2 = new Account("SB-1234567891","Manoj",96000);
			acc1.deposit(4000);
			
			acc1.showBalance();
			acc2.showBalance();
			
		}
}
