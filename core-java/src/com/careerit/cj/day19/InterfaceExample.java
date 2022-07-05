package com.careerit.cj.day19;

import java.util.Scanner;

interface Game{
		void start();
		void play();
		void stop();
}
class Bike implements Game{

	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" game is going start");
	}

	@Override
	public void play() {
		System.out.println("You are playing :"+this.getClass().getSimpleName()+" game please wear helmet");		
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" game is going stop");
		
	}
	
}
class Car implements Game{
	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" game is going start");
	}

	@Override
	public void play() {
		System.out.println("You are playing :"+this.getClass().getSimpleName()+" game please wear seat belt");		
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" game is going stop");
		
	}
	
}

public class InterfaceExample {

		public static void main(String[] args) {
			Game game = selectGame();
			game.start();
			game.play();
			game.stop();
		}

		private static Game selectGame() {
				System.out.println("1. Bike 2.Car ");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your choice :");
				int ch = sc.nextInt();
				sc.close();
				if(ch == 1) {
					return new Bike();
				}else if(ch == 2) {
					return new Car();
				}
				
				throw new IllegalArgumentException("Not a valid game type");
		}
}
