package com.careerit.cj.day9;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SearchElements {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = ThreadLocalRandom.current().nextInt(1, 21);
		}
		if(search(arr, 8,11,15)) {
			System.out.println("Found all three values");
		}else {
			System.out.println("Missing one of the values");
		}
		System.out.println(Arrays.toString(arr));
	}

	public static boolean search(int[] arr, int ele1, int ele2, int ele3) {

		if (search(arr, ele1) && search(arr, ele2) && search(arr, ele3)) {
			return true;
		}
		return false;

	}

	public static boolean search(int[] arr, int ele) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return true;
			}
		}
		return false;
	}
}
