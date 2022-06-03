package com.careerit.cj.day2;

import java.util.Scanner;

/*
 * Program to read 2 integer as input from user and swap those values.
 */
public class SwappingTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2: ");
		int num2 = sc.nextInt();

		System.out.println("Before swap num1 :" + num1 + " and num2 : " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After swap num1 :" + num1 + " and num2 : " + num2);
		sc.close();
	}
}
