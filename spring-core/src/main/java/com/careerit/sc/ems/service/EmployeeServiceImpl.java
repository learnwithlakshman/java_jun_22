package com.careerit.sc.ems.service;

import com.careerit.sc.ems.dao.EmployeeDao;
import com.careerit.sc.ems.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.io.File;
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
    public Employee getEmployee(Long empno) {
        return employeeDao.selectEmployee(empno);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeDao.selectEmployees();
    }

    @Override
    public List<Employee> search(String str) {
        Assert.hasText(str,"Search string can't be empty or null");
        return employeeDao.search(str);
    }

    @Override
    public boolean deleteEmployee(Long empno) {
        return employeeDao.deleteEmployee(empno);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public List<Employee> addEmployees(List<Employee> employeeList) {
        return null;
    }

    @Override
    public List<Employee> importEmployees(File file) {
        return null;
    }

    @Override
    public File exportEmployees() {
        return null;
    }
}
