package com.careerit.cj.day7;

public class NumberOperations {

	public static void main(String[] args) {

	}

	public static boolean isPalindrome(int num) {
		int rev = reverse(num);
		return rev == num;
	}

	public static boolean amstrong(int num) {
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}
		return sum == num;
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

	public static int reverse(int num) {
		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;
	}

	public static int sumOfDigitsUntilSumGetsSigngleDigit(int num) {

//		int sum = 0;
//		while (num > 9) {
//			while (num != 0) {
//				int r = num % 10;
//				sum = sum + r;
//				num = num / 10;
//			}
//			num = sum;
//		}
//		return sum;
		
		int sum = 0;
		while(num > 9) {
			sum = num / 10 + num % 10;
			num = sum;
		}
		return sum;
	}
}
