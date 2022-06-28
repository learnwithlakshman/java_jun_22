package com.careerit.cj.day14;

public class NumberQuestions {
	
	private NumberQuestions() {
		
	}
	public static boolean isPrime(int num) {

		if ((num % 2 == 0 && num != 2) || num < 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		return sum;
	}
}
