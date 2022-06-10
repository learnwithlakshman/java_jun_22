package com.careerit.cj.day7;

public class BreakAndContinue {

	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 100; i++) { System.out.println(i); if (i % 3 == 0 && i %
		 * 6 == 0) { break; } }
		 */

		for (int i = 1; i <= 20; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
