package com.careerit.sc.di;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeDao {

    private List<Employee> employeeList;

    public EmployeeDao() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1001L, "Krish", 35000));
        employeeList.add(new Employee(1003L, "Manoj", 85000));
        employeeList.add(new Employee(1004L, "Charan", 45000));
        employeeList.add(new Employee(1005L, "Kiran", 75000));
    }

    public List<Employee> search(String str) {
        return employeeList.stream().filter(e -> e.getName().toLowerCase().contains(str.toLowerCase())).collect(Collectors.toList());
    }


}
