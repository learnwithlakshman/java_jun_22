package com.careerit.sc.ems.service;

import com.careerit.sc.ems.domain.Employee;
import com.careerit.sc.ems.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Primary
@Slf4j
public class EmpServiceV1Impl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(Long empno) {
        Optional<Employee> optEmployee = employeeRepository.findById(empno);
        if(optEmployee.isPresent()){
            log.info("Employee found wiht id:{}",empno);
            return optEmployee.get();
        }
        log.info("Employee is not found for given id :{}",empno);
        throw new IllegalArgumentException("Given employee number is not found");
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
        log.info("Total employee count is :{}",employeeList.size());
        return employeeList;
    }

    @Override
    public List<Employee> search(String str) {
        List<Employee> employeeList = employeeRepository.findByNameLike("%"+str+"%");
        log.info("Total employee count is :{} for given search string :{}",employeeList.size(),str);
        return employeeList;
    }

    @Override
    public boolean deleteEmployee(Long empno) {
       Employee emp = getEmployee(empno);
       employeeRepository.delete(emp);
       return true;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
            return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> addEmployees(List<Employee> employeeList) {
        List<Employee> savedList = employeeRepository.saveAll(employeeList);
        log.info("Total {} employees are added",savedList.size());
        return savedList;
    }

    @Override
    public List<Employee> importEmployees(File file) {
        try {
           List<String> lines= Files.readAllLines(file.toPath());
           List<Employee> empList= lines.stream().skip(1).map(line->{
               Employee employee = new Employee();
               String[] arr = line.split(",");
               employee.setName(arr[0]);
               employee.setSalary(Double.parseDouble(arr[1]));
               return employee;
           }).collect(Collectors.toList());
          return employeeRepository.saveAll(empList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public File exportEmployees() {
        List<Employee> list = employeeRepository.findAll();
        String tempDirectory = System.getProperty("java.io.tmpdir");
        File file = new File(tempDirectory+"employee.csv");
        try {
            file.createNewFile();
            String heading = "Empno,Name,Salary";
            BufferedWriter br = new BufferedWriter(new FileWriter(file));
            br.write(heading+"\n");
            for(Employee emp:list){
                String data = String.format("%s,%s,%s",emp.getEmpno(),emp.getName(),emp.getSalary());
                br.write(data+"\n");
            }
            br.flush();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }
}
