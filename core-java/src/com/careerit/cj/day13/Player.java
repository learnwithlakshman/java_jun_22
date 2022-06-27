package com.careerit.cj.day13;

public class Player {

		
		public Player(int num1,int num2,int num3) {
			System.out.println(num1+" "+num2+" "+num3);
		}
		public Player(int num1,int num2){
			this(num1,num2,30);
		}
		public Player(int num1) {
			this(num1,10);
		}
		
		
		
		public static void main(String[] args) {
			Player p1 = new Player(10);
			Player p2 = new Player(10,20);
			
			
		}
}
