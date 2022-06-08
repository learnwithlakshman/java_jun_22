package com.careerit.cj.day5;

import java.util.Scanner;

public class NumberCheck {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number :");
			int num = sc.nextInt();
			
			if(num % 2 == 0 ) {
				if(num < 100) {
					num = num + 10;
				}else {
					num = num + 1;
				}
			}else {
				num = num * 10;
			}
			sc.close();
		}
}
