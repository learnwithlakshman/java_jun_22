package com.careerit.sc.ems.controller;

import com.careerit.sc.ems.domain.Employee;
import com.careerit.sc.ems.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    @GetMapping("/search")
    public List<Employee> search(@RequestParam("str") String str){
        List<Employee> searchList = employeeService.search(str);
        return searchList;
    }
    @GetMapping("/empdetails/{empno}")
    public Employee getEmployee(@PathVariable Long empno){
        Employee employee = employeeService.getEmployee(empno);
        return employee;
    }
    @DeleteMapping("/{empno}")
    public String deleteEmployee(@PathVariable Long empno){
        boolean flag = employeeService.deleteEmployee(empno);
        if(flag){
            return "Employee is deleted with id:"+empno;
        }else{
            return "Employee is not found with the given id:"+empno;
        }
    }
    @PostMapping("/addall")
    public List<Employee> addEmployees(@RequestBody List<Employee> empList){
        return employeeService.addEmployees(empList);
    }
    // Add feature to export and import (csv)
    @GetMapping("/export")
    public ResponseEntity<?> exportEmployees() throws IOException {
        File file=employeeService.exportEmployees();
        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(Path.of(file.getPath())));
        return ResponseEntity.ok()
                 .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=\"" + file.getName() + "\"")
                .contentLength(file.length())
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }

    @PostMapping("/import")
    public List<Employee> importEmployees(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        File file = new File(System.getProperty("java.io.tmpdir")+"/"+multipartFile.getName());
        multipartFile.transferTo(file);
        return employeeService.importEmployees(file);
    }

}
