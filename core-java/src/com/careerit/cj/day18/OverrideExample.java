package com.careerit.cj.day18;

class Account {

	public Integer withDraw(double amount)throws RuntimeException {
		return 10;
	}

}

class Savings extends Account {

}

class Current extends Account {

	@Override
	public Integer withDraw(double amount){

		return 20;
	}
}

public class OverrideExample {

	public static void main(String[] args) {

		Account obj = new Current();
	}
}




