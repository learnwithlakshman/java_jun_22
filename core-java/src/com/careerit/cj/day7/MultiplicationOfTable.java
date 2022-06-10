package com.careerit.cj.day7;

import java.util.Scanner;

public class MultiplicationOfTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value :");
		int n = sc.nextInt();
		int i = 1;
		while(i<=10) {
			System.out.println(n +" * "+i+" = "+(n*i));
			i++;
		}
		sc.close();
	}
}
