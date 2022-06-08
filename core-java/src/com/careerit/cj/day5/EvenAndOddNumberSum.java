package com.careerit.cj.day5;

import java.util.Scanner;

public class EvenAndOddNumberSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int esum = 0;
		int osum = 0;
		for (int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				esum += i;
			}else {
				osum += i;
			}
		}
		System.out.println("Even sum :"+esum);
		System.out.println("Odd sum  :"+osum);
	}
}
