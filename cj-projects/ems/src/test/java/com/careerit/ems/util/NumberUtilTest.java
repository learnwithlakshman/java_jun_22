package com.careerit.ems.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class NumberUtilTest {
		
		private static List<String> namesList;
		
		@BeforeAll
		public static void initData() {
			System.out.println("Before all method");
			namesList = new ArrayList<String>();
			for(String name:"Ram,Charan,Krish,Manoj".split(",")) {
				namesList.add(name);
			}
		}
		
		@AfterAll
		public static void emptyData() {
			System.out.println("After all method");
		}
	
		NumberUtil obj;
		@BeforeEach
		public void init() {
			obj = new NumberUtil();
			System.out.println("Start of test");
		}
	
		@AfterEach
		public void destory() {
			System.out.println("End of test");
		}
	
		@Test
		@Timeout(value = 2, unit = TimeUnit.MILLISECONDS)
		public void isPrimeWithPrime() {
			long stime = System.currentTimeMillis();
			boolean actual = obj.isPrime(199999);
			boolean expected = true;
			Assertions.assertEquals(expected, actual);
			long etime = System.currentTimeMillis();
			System.out.println(etime-stime);
		}
		
		@Test
		public void isPrimeWithNNumber() {
		
			boolean actual = obj.isPrime(-19);
			boolean expected = false;
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		public void isPrimeWithZero() {
			
			boolean actual = obj.isPrime(0);
			boolean expected = false;
			Assertions.assertEquals(expected, actual);
		}
		
		@DisplayName("Prime number test with 2")
		@Test
		public void isPrimeWithTwo() {
			
			boolean actual = obj.isPrime(2);
			boolean expected = true;
			Assertions.assertEquals(expected, actual);
		}
}
