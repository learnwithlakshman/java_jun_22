package com.careerit.sc.config;

import com.careerit.sc.di.EmployeeDao;
import com.careerit.sc.di.EmployeeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AppConfiguration {

            @Bean
            public EmployeeDao employeeDao(){
                return new EmployeeDao();
            }
            @Bean
            public EmployeeService employeeService(){
                EmployeeService obj = new EmployeeService();
                obj.setEmployeeDao(employeeDao());
                return obj;
            }

}
