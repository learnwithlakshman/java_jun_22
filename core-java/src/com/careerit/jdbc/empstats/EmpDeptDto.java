package com.careerit.jdbc.empstats;

public class EmpDeptDto {
		private int empno;
		private String ename;
		private String job;
		private double sal;
		private String dname;
		private String location;
		public EmpDeptDto(int empno, String ename, String job, double sal, String dname, String location) {
			super();
			this.empno = empno;
			this.ename = ename;
			this.job = job;
			this.sal = sal;
			this.dname = dname;
			this.location = location;
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public double getSal() {
			return sal;
		}
		public void setSal(double sal) {
			this.sal = sal;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		
}
