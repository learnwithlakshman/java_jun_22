package com.careerit.jdbc.empstats;

public class EmployeeManagerDto {

		private int empno;
		private String name;
		private String mgrName;
		private String dname;
		private double salary;
		public EmployeeManagerDto(int empno, String name, String mgrName, String dname, double salary) {
			super();
			this.empno = empno;
			this.name = name;
			this.mgrName = mgrName;
			this.dname = dname;
			this.salary = salary;
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMgrName() {
			return mgrName;
		}
		public void setMgrName(String mgrName) {
			this.mgrName = mgrName;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
}
