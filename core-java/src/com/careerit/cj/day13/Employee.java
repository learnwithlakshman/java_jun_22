package com.careerit.cj.day13;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class Employee {

		private int empno;
		private String name;
		private double salary;
		
		public Employee(int empno,String name,double salary) {
			this.empno = empno;
			this.name = name;
			this.salary = salary;
		}
		public Employee(String name,double salary) {
			this(ThreadLocalRandom.current().nextInt(1001, 10000),name,salary);
		}
		public void showDetails() {
			System.out.println("Empno  :"+empno);
			System.out.println("Name   :"+name);
			System.out.println("Salary :"+salary);
		}
		
		// Constructor overloading 
		/*
		 * 1. No of parameters
		 * 2. Order of the parameters
		 * 3. Type of the parameters 
		 */
}
