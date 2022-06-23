package com.careerit.cj.day11;

import java.util.Scanner;

public class PalindromeCheck {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string :");
			String data = sc.nextLine();
			if(isPalindrome(data)) {
				System.out.println(data+" is palindrome");
			}else {
				System.out.println(data+"Not a palindrome");
			}
			sc.close();
				
		}
		
		public static boolean isPalindrome(String str) {
			boolean flag = true;
			
			for(int i=0,j=str.length()-1;i<=j;i++,j--) {
				if(str.charAt(i)!=str.charAt(j)) {
					flag=false;
					break;
				}
			}
			return flag;
		}
		
		public static boolean palindrome(String str) {
			return new StringBuilder(str).reverse().toString().equals(str);
		}
}
