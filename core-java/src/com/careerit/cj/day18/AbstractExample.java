package com.careerit.cj.day18;

abstract class NumberOperations{
	
		public boolean isPrime() {
			
			return false;
		}
		public abstract int[] generatePrime(int lb,int ub);
		
		public int primeCount(int lb,int ub) {
			
			return 10;
		}
}

class NumberOperationsImpl extends NumberOperations{

	@Override
	public int[] generatePrime(int lb, int ub) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class AbstractExample {

}
