package com.careerit.sc.ems.service;

import com.careerit.sc.ems.domain.Employee;
import com.careerit.sc.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class EmpServiceV1Impl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(Long id) {
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> search(String str) {
        return null;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        return false;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }
}
