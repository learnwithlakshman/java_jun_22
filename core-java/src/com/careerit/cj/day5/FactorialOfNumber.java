package com.careerit.cj.day5;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int fact = 1;

		for (int i = 2; i <= num; i++) {
			fact *= i;
		}
		
		System.out.println("Factorial of :"+num+" is :"+fact);
		sc.close();
	}
}
