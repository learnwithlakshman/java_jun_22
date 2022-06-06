package com.careerit.cj.day3;

import java.util.Scanner;

/*
 *  Bill_amount = ? 
 *  Discount = ?   > 1000 -> 10%
 *  Net_amount = ?
 */
public class DiscountCalc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount :");
		float billAmount = sc.nextFloat();
		float discount = 0;

		if (billAmount > 1000) {
			discount = billAmount * 0.1f;
		}
		float netAmount = billAmount - discount;
		System.out.println("Bill amount     :"+billAmount);
		System.out.println("Discount amount :"+discount);
		System.out.println("Net amount      :"+netAmount);
		sc.close();
	}
}
