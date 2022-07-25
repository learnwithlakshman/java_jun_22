package com.careerit.ems;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.careerit.ems.dao.EmployeeDao;
import com.careerit.ems.dao.EmployeeDaoImpl;
import com.careerit.ems.domain.Employee;

public class Manager {

	public static void main(String[] args) {

		List<String> names = List.of("Krish", "Manoj", "Charan", "Kiran");
		
		
		EmployeeDao obj = new EmployeeDaoImpl();
		obj.selectAllEmployees().forEach(emp->{
			System.out.println(emp);
		});
		writeDataToExcel(obj.selectAllEmployees());
		
	}

	public static void writeDataToExcel(List<Employee> list) {
		final String WORKBOOK_NAME = "emp.xlsx";
		if (!Files.exists(Paths.get(WORKBOOK_NAME))) {
			try (FileOutputStream fos = new FileOutputStream(new File("emp.xlsx"))) {
				Workbook workbook = new XSSFWorkbook();
				Sheet sheet = workbook.createSheet("emp_details");
				int rowcount = 0;
				Row row = sheet.createRow(rowcount++);
				Object[] colHeading = { "Empno","Name","Salary","City","State","Country"};
				int i = 0;
				for (Object obj : colHeading) {
					Cell cell = row.createCell(i++);
					cell.setCellValue((String) obj);
				}

				for (Employee emp : list) {
					i = 0;
					row = sheet.createRow(rowcount++);
					Cell cell = row.createCell(i++);
					cell.setCellValue(emp.getEmpno());
					cell = row.createCell(i++);
					cell.setCellValue(emp.getEname());
     				cell = row.createCell(i++);
					cell.setCellValue(emp.getSalary());
					cell = row.createCell(i++);
					cell.setCellValue(emp.getAddress().getCity());
					cell = row.createCell(i++);
					cell.setCellValue(emp.getAddress().getState());
					cell = row.createCell(i++);
					cell.setCellValue(emp.getAddress().getCountry());
				}

				workbook.write(fos);
				System.out.println("Work book is created successfully with name :" + WORKBOOK_NAME);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else

		{
			System.out.println("File already exists with the name :" + WORKBOOK_NAME);
		}
	}
	
	
}
