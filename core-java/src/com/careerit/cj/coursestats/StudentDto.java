package com.careerit.cj.coursestats;

public class StudentDto {

		private String name;
		private String qualification;
		private double score;
		
		public StudentDto(String name, String qualification, double score) {
			super();
			this.name = name;
			this.qualification = qualification;
			this.score = score;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public double getScore() {
			return score;
		}
		public void setScore(double score) {
			this.score = score;
		}
		
		
}
