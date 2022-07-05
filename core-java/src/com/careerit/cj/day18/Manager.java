package com.careerit.cj.day18;

class One{
	int a = 100;
    public void m1() {
		System.out.println("One class m1 method");
	}
}
class Two extends One{
	int a = 999;
	public void m1() {
		System.out.println("This new impl of m1 method in two");
	}
	public void m2() {
		System.out.println("Two class m2 method");
	}
}

class Three extends Two{
	public void m3() {
		System.out.println("Two class m3 method");
	}
}
public class Manager {
		public static void main(String[] args) {
			One obj1 = new Three();
			obj1.m1();
			System.out.println(obj1.a);
		}
}
