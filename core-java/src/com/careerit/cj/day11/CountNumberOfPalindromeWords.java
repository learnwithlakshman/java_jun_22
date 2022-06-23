package com.careerit.cj.day11;

public class CountNumberOfPalindromeWords {

	public static void main(String[] args) {
		String data = "1221 MOM dad Liril John Krish";
		System.out.println(palindromeCount(data));
	}

	// Hint data may contains multiple words and words are separated by space
	public static int palindromeCount(String data) {
		String[] arr = data.split(" ");
		int count = 0;
		for (String ele : arr) {
			if (palindrome(ele)) {
				System.out.println(ele);
				count++;
			}
		}
		return count;
	}

	private static boolean palindrome(String str) {
		return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
	}

}

