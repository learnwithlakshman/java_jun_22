package com.careerit.cj.day4;

import java.util.Scanner;

public class Results {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		System.out.println("Enter the subject_1 score:");
		int sub_1 = sc.nextInt();
		System.out.println("Enter the subject_2 score:");
		int sub_2 = sc.nextInt();
		System.out.println("Enter the subject_3 score:");
		int sub_3 = sc.nextInt();
		
		if(sub_1 >=35 && sub_2>=35 && sub_3 >=35) {
			System.out.println("Hello "+name+", Congratulations....");
		}else {
			System.out.println("Sorry! better luck next time");
		}
		sc.close();
		
	}
}
