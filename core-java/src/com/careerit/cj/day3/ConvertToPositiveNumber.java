package com.careerit.cj.day3;

import java.util.Scanner;

/*
 * Age as input, if entered age is -ve number convert to positive and increment age 1 
 * and display.
 */
public class ConvertToPositiveNumber {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age :");
			int age = sc.nextInt();
			if(age < 0) {
				age = Math.abs(age);
			}
			age++;
			System.out.println("Current age is :"+age);
			sc.close();
			
		}
}
