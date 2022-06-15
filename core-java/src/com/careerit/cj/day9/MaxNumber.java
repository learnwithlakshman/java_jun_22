package com.careerit.cj.day9;

import java.util.Scanner;

public class MaxNumber {

		public static void main(String[] args) {
			
			int[] arr = new int[5];
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the subject " + (i + 1) + " score:");
				arr[i] = sc.nextInt();
			}
			int max = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.println("Max score :"+max);
			sc.close();
		}
}
