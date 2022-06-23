package com.careerit.cj.day11;

public class StringSubString {

		public static void main(String[] args) {
			printSubString("corejava", 5);
		}
		
		public static void printSubString(String str,int size) {
				for(int i=0;i<=str.length()-size;i++) {
					System.out.println(str.substring(i,i+size));
				}
		}
}

