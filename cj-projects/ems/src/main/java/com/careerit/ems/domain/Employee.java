package com.careerit.ems.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

		private Long empno;
		private String ename;
		private double salary;
		private Address address;
		
}
