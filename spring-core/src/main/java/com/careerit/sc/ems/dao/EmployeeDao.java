package com.careerit.sc.ems.dao;

import com.careerit.sc.ems.domain.Employee;

import java.util.List;

public interface EmployeeDao {
    public Employee insertEmployee(Employee employee);
    public Employee selectEmployee(Long id);
    public List<Employee> selectEmployees();
    public List<Employee> search(String str);
    public boolean deleteEmployee(Long id);
    public Employee updateEmployee(Employee employee);
}
