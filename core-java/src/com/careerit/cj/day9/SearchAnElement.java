package com.careerit.cj.day9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SearchAnElement {

		public static void main(String[] args) {
			
			int[] arr = new int[6];
			
			for(int i=0;i<arr.length;i++) {
				arr[i] = ThreadLocalRandom.current().nextInt(1, 21);
			}
			
			System.out.println("Guess a number in range (1-20) :");
			Scanner sc = new Scanner(System.in);
			int gnum = sc.nextInt();
			
			boolean flag = false;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i] == gnum) {
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("Congratulation.... you guessed number");
			}else {
				System.out.println("Sorry! try again...");
				System.out.println(Arrays.toString(arr));
			}
			sc.close();
			
		}
}
