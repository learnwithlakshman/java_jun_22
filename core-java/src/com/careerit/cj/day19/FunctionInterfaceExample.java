package com.careerit.cj.day19;

// Functional Interface

interface Sample{
	boolean isValid();
}

// Marker interface
interface EmptyInterface{
	
}

@FunctionalInterface
interface Java8Interface{
	
	private int primeCount() {
		return 0;
	}
	default boolean isEven(int num) {
		return false;
	}
	public static boolean isOdd(int num) {
		return false;
	}
	public boolean isPrime(int num);
	
}

interface One{
	void m1();
}
interface Two{
	void m1();
	void m2();
}
interface Three{
	void m3();
}

interface Four extends One,Two,Three{
	
}

class Five implements One,Two,Three,Four{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class FunctionInterfaceExample {

}
