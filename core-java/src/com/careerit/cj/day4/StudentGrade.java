package com.careerit.cj.day4;

import java.util.Scanner;

public class StudentGrade {

		// Score 1-10 - 8-10 'A' 6-7 'B' 4-5 'C' <4 'D'
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the score (1-10) only ");
			int score = sc.nextInt();
			
			if(score >=8 && score <=10) {
				System.out.println("A");
			}else if(score >=6 && score <=7) {
				System.out.println("B");
			}else if(score >=4 && score <=5) {
				System.out.println("C");
			}else {
				System.out.println("D");
			}
			sc.close();
		}
}
