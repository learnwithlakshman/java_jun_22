package com.careerit.cj.coursestats;

import java.util.List;

public interface CourseStatService {

	
		public List<Student> getStudentByQualification(String qualification);
		public Long getStudentCountByQualification(String qualification);
		public CountStatDto getCountStats();
		public List<String> getStudentNames();
		public List<StudentDto> getStudentProfile();
}
