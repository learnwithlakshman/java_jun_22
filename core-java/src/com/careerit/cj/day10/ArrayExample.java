package com.careerit.cj.day10;

import java.util.Arrays;

public class ArrayExample {

		public static void main(String[] args) {
			
			int[] input = new int[] {4, 6, 8, 9};
			int[] prime = filterPrimeNumbers(input);
			System.out.println(Arrays.toString(prime));
			
			
		}
		
		public static int[] filterPrimeNumbers(int[] arr) {
			int[] temp = new int[arr.length];
			int c=0;
			for(int ele:arr) {
				if(isPrime(ele)) {
					temp[c++] = ele;
				}
			}
			if(c==0) {
				return new int[] {};
			}else if(c==arr.length){
				return temp;
			}else {
				int[] primeArr = new int[c];
				System.arraycopy(temp, 0, primeArr, 0, c);
				return primeArr;
			}
			
		}
		
		public static boolean isPrime(int num) {

			if (num < 2) {
				return false;
			}
			if (num % 2 == 0 && num != 2) {
				return false;
			}

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;

		}
}
