package com.careerit.ems.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString
public class Address {
		
		private long   aid;
		private String city;
		private String state;
		private String country;
}
