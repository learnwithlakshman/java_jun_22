package com.careerit.cj.day11;

public class ImmutableStringExample {

		public static void main(String[] args) {
			
				String s1 = "Core";
				String s2 = "Core";
				s1.concat(" Java");
				System.out.println(s1);
				System.out.println(s1.concat(" Java"));
		}
}
