package com.careerit.cj.day6;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value :");
		int n = sc.nextInt();
		float sum = 1;
		for (int i = 2; i <= n; i++) {
			sum = sum + 1 / (float) factorial(i);
		}
		System.out.println("The sum is :" + sum);
		sc.close();
	}

	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}
