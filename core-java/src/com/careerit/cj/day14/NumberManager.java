package com.careerit.cj.day14;

import static com.careerit.cj.day7.NumberOperations.isPalindrome;
import static com.careerit.cj.day7.NumberOperations.reverse;
import static com.careerit.cj.day7.NumberOperations.sumOfDigits;

public class NumberManager {

		public static void main(String[] args) {
			
			int empno = Integer.parseInt(args[0]);
			String name = args[1];
			int age = Integer.parseInt(args[2]);
			String city = args[3];
			
			System.out.println(isPalindrome(389));
			System.out.println(reverse(389));
			System.out.println(sumOfDigits(389));
		}
}
