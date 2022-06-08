package com.careerit.cj.day5;

import java.util.Scanner;

public class FirstNEvenNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int N = sc.nextInt();

		for (int i = 2; i <= N; i = i + 2) {
			System.out.println(i);
		}
		sc.close();

	}
}
