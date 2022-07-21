package com.careerit.ems.service;

import java.util.List;

import com.careerit.ems.domain.Employee;
import com.careerit.ems.util.FileType;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee);
	public Employee getEmployee(Long empno);
	public List<Employee> search(String str);
	public List<Employee> selectAllEmployees();
	public boolean deleteEmployee(Long empno);
	public Employee updateEmployee(Employee employee);
	public void downloadEmpDetails(FileType fileType);
}
