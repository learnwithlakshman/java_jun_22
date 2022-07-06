package com.careerit.cj.day20;

public class TypeCastingAndAutoBoxingExample {

		public static void main(String[] args) {
			
				float price = 23.05f;
				
				int aprice = (int) price;
				
				int a = 10;
				float b = a;
				
				System.out.println(aprice);
				
				String ele = "1234";
				int val = Integer.parseInt(ele);
				Integer obj = val;
		}
}
