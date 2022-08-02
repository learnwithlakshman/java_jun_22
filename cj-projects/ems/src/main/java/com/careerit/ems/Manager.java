package com.careerit.ems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Manager {

	public static void main(String[] args) throws IOException {

		Collection<String> colHeading = Arrays.asList(new String[]{ "Empno","Name","Salary"});
		Collection<List<Object>> rows = new ArrayList<List<Object>>();
	
		rows.add(List.of(1001, "Krish", 35000));
		rows.add(List.of(1002, "Charan", 95000));
		rows.add(List.of(1003, "Manoj", 55000));
		ExcelReportUtil obj = new ExcelReportUtil();
		obj.createExcel(colHeading, rows);
	}
			
	
}
