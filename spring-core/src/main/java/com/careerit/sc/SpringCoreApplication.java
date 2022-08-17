package com.careerit.sc;

import com.careerit.sc.di.Employee;
import com.careerit.sc.di.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

@SpringBootApplication
//@ImportResource("classpath:/config/employee-bean.xml")
public class SpringCoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
		EmployeeService empService = context.getBean(EmployeeService.class);
		List<Employee> employeeList = empService.search("a");
		if(employeeList.isEmpty()){
			System.out.println("No contacts found");
		}else{
			employeeList.forEach(e->{
				System.out.println(e);
			});
		}
	}

}
