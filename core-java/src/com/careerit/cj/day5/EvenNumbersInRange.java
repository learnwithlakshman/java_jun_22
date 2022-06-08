package com.careerit.cj.day5;

import java.util.Scanner;

public class EvenNumbersInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lb value : ");
		int lb = sc.nextInt();
		System.out.println("Enter the ub value : ");
		int ub = sc.nextInt();

		for (int i = lb + 1; i < ub; i++) {
			if(i % 2 == 0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
	}
}
