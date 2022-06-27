package com.careerit.cj.day13;

class Student{
	
		private int regno;
		private String name;
		private int std;
		
		public Student(int regno,String name,int std) {
			this.regno = regno;
			this.name = name;
			this.std = std;
		}
		public void show() {
			System.out.println("Regno :"+regno+" Name :"+name+" Std :"+std);
		}
}
public class ConstructorExample {

		public static void main(String[] args) {
			Student s1 = new Student(1001,"Krish",5);
			Student s2 = new Student(1002,"Manoj",8);
			
			s1.show();
			s2.show();
		}
		
}
