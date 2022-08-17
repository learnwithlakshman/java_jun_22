package com.careerit.sc.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> search(String str) {
        return employeeDao.search(str);
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }
}
