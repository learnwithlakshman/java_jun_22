package com.careerit.cj.day20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GetPrimeNumbers {

		public static void main(String[] args) {
			String data = getElements();
			List<Integer> list = convertToList(data);
			
			List<Integer> evenList = getEvenNumbers(list);
			System.out.println(evenList);
			
			// Get all the even numbers
			// Get all the prime number
			// Get all the numbers which are divisible by 3 and 9 but not with 6
			// Get count of prime number
			
			
		}
		private static List<Integer> convertToList(String data){
			List<Integer> list = new ArrayList<Integer>();
			String[] arr = data.split(",");
			for(String ele:arr) {
				list.add(Integer.parseInt(ele));
			}
			return list;
		}
		private static List<Integer> getEvenNumbers(List<Integer> numList){
			List<Integer> list = new ArrayList<Integer>();
			for(Integer ele:numList) {
				if(ele % 2 == 0) {
					list.add(ele);
				}
			}
			return list;
		}
		
		private static String getElements() {
			StringBuilder sb = new StringBuilder();
			int count = 12;
			for(int i=1;i<=count;i++) {
				int num = ThreadLocalRandom.current().nextInt(1,100000);
				if(i==count) {
					sb.append(num);
				}else {
					sb.append(num+",");
				}
			}
			return sb.toString();
		}
}
