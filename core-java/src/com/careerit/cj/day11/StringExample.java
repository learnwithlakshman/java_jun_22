package com.careerit.cj.day11;

public class StringExample {

		public static void main(String[] args) {
			
				String name1 = "Krish";
				//length field length()
				for(int i=0;i<name1.length();i++) {
					System.out.println(name1.charAt(i));
				}
				
				String uname = name1.toUpperCase();
				System.out.println(uname);
				
				for(int i=uname.length()-1;i>=0;i--) {
					System.out.println(uname.charAt(i));
				}
				
				String email = "char@gmail.com";
				
				// @,.
				if(email.indexOf('@') != -1 && email.indexOf('.') != -1) {
					System.out.println("Valid");
				}else {
					System.out.println("Not valid");
				}
				
				
				String data = "12345KRISH-23M";
				
				System.out.println(data.substring(2));
				System.out.println(data.substring(2,4));
				
				System.out.println(data.substring(5,data.indexOf('-')));
				
				String names = "Krish,Manoj,Charan,Jayesh,John";
				String[] arr = names.split(",");
				for(String name:arr) {
					System.out.println(name.toUpperCase().substring(0,3));
				}
		}
}
