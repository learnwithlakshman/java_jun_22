package com.careerit.cj.day5;

import java.util.Scanner;

public class RoomAllocation {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the student count :");
			int scount = sc.nextInt();
			System.out.println("Enter the room capacity :");
			int capacity = sc.nextInt();
			int reqRooms = 0;
			if(scount % capacity == 0) {
				reqRooms = scount / capacity;
			}else {
				reqRooms = (scount / capacity) + 1;
			}
			
			System.out.println("Total student count : "+scount);
			System.out.println("Room capacity       : "+capacity);
			System.out.println("Required rooms      : "+reqRooms);
			sc.close();
		}
		
}
