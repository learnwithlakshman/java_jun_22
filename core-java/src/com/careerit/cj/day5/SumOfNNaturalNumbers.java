package com.careerit.cj.day5;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :");
			int num = sc.nextInt();
			int sum = 0;
			for(int i=1;i<=num;i++) {
				sum += i;
			}
			System.out.println("The sum of first "+num+" natural number is :"+sum);
			sc.close();
		}
}
