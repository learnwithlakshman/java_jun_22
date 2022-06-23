package com.careerit.cj.day11;

public class StringOperations {

		public static void main(String[] args) {
			
				String data = "1001-ABC-2500,1001-ABC-3500,1002-LMN-1500,1002-LMN-2500";
				
				double total=0;
				
				String[] arr = data.split(",");
				for(String ele:arr) {
					String amount = ele.split("-")[2];
					total += Double.parseDouble(amount);
				}
				System.out.println("Total amount :"+total);
				
		}
}
