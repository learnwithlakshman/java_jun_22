package com.careerit.sc.ems.service;

import com.careerit.sc.ems.dao.EmployeeDao;
import com.careerit.sc.ems.dao.EmployeeDaoImpl;
import com.careerit.sc.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee addEmployee(Employee employee) {
        Assert.notNull(employee,"Employee object can't be null");
        Assert.hasText(employee.getName(),"Employee name can't be empty or null");
        Assert.notNull(employee.getSalary(),"Employee salary can't be empty or null");
        return employeeDao.insertEmployee(employee);
    }

    @Override
    public Employee getEmployee(Long id) {
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeDao.selectEmployees();
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
        return employeeDao.updateEmployee(employee);
    }
}
