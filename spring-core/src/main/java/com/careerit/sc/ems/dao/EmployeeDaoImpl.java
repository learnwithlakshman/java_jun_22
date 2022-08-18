package com.careerit.sc.ems.dao;

import com.careerit.sc.ems.domain.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@Slf4j
public class EmployeeDaoImpl implements EmployeeDao {

    private List<Employee> employeeList;

    public EmployeeDaoImpl() {
        employeeList = new ArrayList<>();
        employeeList.add(new Employee(1001L, "Krish", 35000));
        employeeList.add(new Employee(1003L, "Manoj", 85000));
        employeeList.add(new Employee(1004L, "Charan", 45000));
        employeeList.add(new Employee(1005L, "Kiran", 75000));
    }


    @Override
    public Employee insertEmployee(Employee employee) {
        employeeList.add(employee);
        return employee;
    }
    @Override
    public Employee selectEmployee(Long id) {
        return null;
    }

    @Override
    public List<Employee> selectEmployees() {
        log.info("Total employees count is: {}",employeeList.size());
        return employeeList;
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
         int index = getIndexOf(employee);
        if(index != -1){
            employeeList.set(index,employee);
        }else{
            log.info("Employee with id :{} is not found"+employee.getEmpno());
        }
        return employee;
    }
    private int getIndexOf(Employee employee){
        for(int i=0;i<employeeList.size();i++){
            if(employee.getEmpno().longValue()==employeeList.get(i).getEmpno().longValue()){
                return i;
            }
        }
        return -1;
    }

}
