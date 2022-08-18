package com.careerit.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource("classpath:/config/employee-bean.xml")
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);

		/*ConfigurableApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);
		EmployeeService empService = context.getBean(EmployeeService.class);
		List<Employee> employeeList = empService.search("a");
		if(employeeList.isEmpty()){
			System.out.println("No contacts found");
		}else{
			employeeList.forEach(e->{
				System.out.println(e);
			});
		}*/
	}

}
