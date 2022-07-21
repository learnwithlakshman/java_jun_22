package com.careerit.ems.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

		private Long empno;
		private String ename;
		private double salary;
		private Address address;
		
}
