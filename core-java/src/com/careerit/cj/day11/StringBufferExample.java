package com.careerit.cj.day11;

public class StringBufferExample {

		public static void main(String[] args) {
			
			StringBuilder sb = new StringBuilder("core java");
			sb.append(" learning is fun!");
			System.out.println(sb);
			String name = "1234521";
			/*
			 * String rname =""; for(int i=name.length()-1;i>=0;i--) {
			 * rname+=name.charAt(i); } System.out.println(rname);
			 */
			String rname=new StringBuilder(name).reverse().toString();
			System.out.println(rname);
		}
}
