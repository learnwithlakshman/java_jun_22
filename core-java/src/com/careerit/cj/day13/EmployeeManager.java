package com.careerit.cj.day13;

public class EmployeeManager {

		public static void main(String[] args) {
			
			Employee emp1 = new Employee(1001,"Krish",25000);
			emp1.showDetails();
			
			Employee emp2 = new Employee("Manoj",45000);
			emp2.showDetails();
			
		}
}
