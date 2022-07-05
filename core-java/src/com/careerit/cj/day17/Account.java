package com.careerit.cj.day17;

public class Account extends Object {

		Long accNumber;
		String name;
		double balance;
		
		public Account(Long accNumber, String name, double balance) {
			this.accNumber = accNumber;
			this.name = name;
			this.balance = balance;
		}
		
		@Override
		public String toString() {
			return "Account [accNumber=" + accNumber + ", name=" + name + ", balance=" + balance + "]";
		}
		@Override
		public boolean equals(Object obj) {
			Account acc = (Account)obj;
			return this.accNumber.equals(acc.accNumber) && this.name.equals(acc.name);
		}

		public static void main(String[] args) {
			Account acc1 = new Account(1001L, "Krish", 45L);
			Account acc2 = new Account(1001L, "Krish", 45L);
						
			System.out.println(acc1 == acc2);
			System.out.println(acc1.equals(acc2));
			
			
		}
}

