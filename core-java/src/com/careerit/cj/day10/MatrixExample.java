package com.careerit.cj.day10;

public class MatrixExample {

		public static void main(String[] args) {
			
			int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
			//Sum of all the elements
			
			int sum =0;
			/*
			 * for(int[] subArr:arr) { for(int ele:subArr) { sum=sum+ele; } }
			 */
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					sum = sum + arr[i][j];
				}
			}
			System.out.println(sum);
			
			// Max,Min element in the 
			
			// Check identity matrix 
			
			
		}
}
