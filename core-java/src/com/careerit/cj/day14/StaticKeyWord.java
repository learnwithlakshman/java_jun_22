package com.careerit.cj.day14;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.System.out;
import static java.time.LocalDateTime.now;

public class StaticKeyWord {
	
		static {
			System.out.println("Static Block -1");
		}

		public static void main(String[] args) {
		
			out.println(sqrt(16));
			out.println(pow(2, 3));
			out.println(now());
		}
		static {
			System.out.println("Static Block -2");
		}
		static class Inner{
			
		}
}

// Blocks
// Variables
// Inner 
// Methods
// Imports