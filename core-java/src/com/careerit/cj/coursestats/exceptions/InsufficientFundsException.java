package com.careerit.cj.coursestats.exceptions;

public class InsufficientFundsException extends RuntimeException {

		public String message;
		
		public InsufficientFundsException() {
			this.message = "Plese check balance, you don't have enough funds";
		}
		public InsufficientFundsException(String message) {
			this.message = message;
		}
		@Override
		public String toString() {
			return "InsufficientFundsException [message=" + message + "]";
		}
		
		
}
