package com.careerit.cj.day17;

public class Employee {

		private int empno;
		private String name;
		private double salary;
		
		public Employee(int empno, String name, double salary) {
			super();
			this.empno = empno;
			this.name = name;
			this.salary = salary;
		}
			
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
}
