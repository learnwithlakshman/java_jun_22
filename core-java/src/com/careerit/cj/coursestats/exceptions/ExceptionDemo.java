package com.careerit.cj.coursestats.exceptions;

import java.util.Scanner;

public class ExceptionDemo {

		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the name: ");
				String name = sc.nextLine();
				String shortName="";
				if(name.length() >=3)
					shortName = name.substring(0,3);
				else
					shortName = name;
				System.out.println("Name :"+shortName.toUpperCase());
				sc.close();
				
		}
}
