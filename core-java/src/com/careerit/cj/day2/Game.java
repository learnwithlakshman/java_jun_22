package com.careerit.cj.day2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

	public static void main(String[] args) {
		int gnum =  ThreadLocalRandom.current().nextInt(1, 7);
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess number 1-6 only :");
		int num = sc.nextInt();
		if(num == gnum) {
			System.out.println("Congratulations.....");
		}else {
			System.out.println("Sorry! try again....");
		}
		sc.close();
	}
}
