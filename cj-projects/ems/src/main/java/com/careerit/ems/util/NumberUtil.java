package com.careerit.ems.util;

public class NumberUtil {

	public boolean isPrime(int num) {
		if (num <= 0 || (num % 2 == 0 && num != 2)) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
}
