package com.careerit.cj.day9;

import java.util.Scanner;

public class ArrayExampleOne {

	public static void main(String[] args) {

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the subject " + (i + 1) + " score:");
			arr[i] = sc.nextInt();
		}
		// find total, average
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		float avg = total / (float) arr.length;
		System.out.println("Total score   :" + total);
		System.out.println("Average score :" + avg);
		sc.close();

	}
}
