package com.careerit.cj.day18;
class C0{
	int a = 1;
}
class C1 extends C0{
	int a = 100;
	public C1(String message) {
		super();
		System.out.println("c1");
	}
	public String m1() {
		return "Hello, ";
	}
}
class C2 extends C1{
	int a = 999;
	public C2() {
		super("hello");
		System.out.println("c2 "+super.a);
	}
	public String m1() {
		return "welcome to java world";
	}
	public void showGreetings() {
		String message = super.m1()+" "+this.m1();
		System.out.println(message);
	}
}

public class InheritanceExample {

		public static void main(String[] args) {
			
			
				C0 obj = getObject();
				
				if(obj instanceof C2) {
					C2 ob = (C2) obj;
					System.out.println(ob.m1());
					ob.showGreetings();
				}else if(obj instanceof C1) {
					C1 ob = (C1)obj;
					System.out.println(ob.m1());
				}
		}

		
		
		
		
		
		private static C0 getObject() {
			// TODO Auto-generated method stub
			return new C2();
		}
}
