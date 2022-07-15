package com.careerit.cj.coursestats.exceptions;

public class GameApplication {

		public static void main(String[] args) {
			
		}
		
		public static void guessNumber() throws MaxAttemptException {
			
				int count = 0;
				//Logic
				
				if(count == 3) {
					throw new MaxAttemptException("You have reached max attempts");
				}
			
				
		}
}
