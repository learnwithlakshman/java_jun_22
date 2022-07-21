package com.careerit.ems;

import com.careerit.ems.dao.EmployeeDao;
import com.careerit.ems.dao.EmployeeDaoImpl;
import com.careerit.ems.domain.Address;
import com.careerit.ems.domain.Employee;

public class Manager {

		public static void main(String[] args) {
			
				EmployeeDao empDao = new EmployeeDaoImpl();
				
				Employee emp =new Employee();
				Address address = new Address();
				address.setCity("Bangalore");
				address.setState("KA");
				address.setCountry("IND");
				
				emp.setEname("Krish");
				emp.setSalary(75000);
				emp.setAddress(address);
				
				empDao.insertEmployee(emp);
		}
}
