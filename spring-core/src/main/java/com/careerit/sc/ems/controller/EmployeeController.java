package com.careerit.sc.ems.controller;

import com.careerit.sc.ems.domain.Employee;
import com.careerit.sc.ems.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/ems/")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addEmployee(employee);
        log.info("Employee is added with id {}",newEmployee.getEmpno());
        return newEmployee;
    }
    @GetMapping("/emplist")
    public List<Employee> getEmployees(){
        List<Employee> list = employeeService.getEmployees();
        return list;
    }
    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee updatedEmployee = employeeService.updateEmployee(employee);
        log.info("Employee is update with id {}",updatedEmployee.getEmpno());
        return updatedEmployee;
    }


}
