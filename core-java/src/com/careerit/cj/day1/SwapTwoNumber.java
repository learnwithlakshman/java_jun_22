package com.careerit.cj.day1;

public class SwapTwoNumber {

		public static void main(String[] args) {
			int num1 = 10;
			int num2 = 20;
			System.out.println("Before swap num1 = "+num1+" and num2 = "+num2);
			int temp = num1;
			num1 = num2;
			num2 = temp;
			System.out.println("After swap num1 = "+num1+" and num2 = "+num2);
		}
}
