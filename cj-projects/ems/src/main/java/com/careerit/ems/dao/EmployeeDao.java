package com.careerit.ems.dao;

import java.util.List;

import com.careerit.ems.domain.Employee;

public interface EmployeeDao {

		public Employee insertEmployee(Employee employee);
		public Employee selectEmployee(Long empno);
		public List<Employee> search(String str);
		public List<Employee> selectAllEmployees();
		public boolean deleteEmployee(Long empno);
		public Employee updateEmployee(Employee employee);
		
		
}
