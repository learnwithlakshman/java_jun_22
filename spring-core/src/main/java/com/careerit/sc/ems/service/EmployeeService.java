package com.careerit.sc.ems.service;

import com.careerit.sc.ems.domain.Employee;

import java.io.File;
import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee);

    public Employee getEmployee(Long id);

    public List<Employee> getEmployees();

    public List<Employee> search(String str);

    public boolean deleteEmployee(Long id);

    public Employee updateEmployee(Employee employee);

    public List<Employee> addEmployees(List<Employee> employeeList);

    public List<Employee> importEmployees(File file);
    public File exportEmployees();
}
