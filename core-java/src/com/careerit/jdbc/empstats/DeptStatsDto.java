package com.careerit.jdbc.empstats;

public class DeptStatsDto {

		private String dname;
		private double totalAmount;
		private int empCount;
		public DeptStatsDto(String dname, double totalAmount, int empCount) {
			super();
			this.dname = dname;
			this.totalAmount = totalAmount;
			this.empCount = empCount;
		}
		public String getDname() {
			return dname;
		}
		public void setDname(String dname) {
			this.dname = dname;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public int getEmpCount() {
			return empCount;
		}
		public void setEmpCount(int empCount) {
			this.empCount = empCount;
		}
		
		
}
