package com.careerit.sc.ems.service;

import com.careerit.sc.ems.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee addEmployee(Employee employee);

    public Employee getEmployee(Long id);

    public List<Employee> getEmployees();

    public List<Employee> search(String str);

    public boolean deleteEmployee(Long id);

    public Employee updateEmployee(Employee employee);
}
