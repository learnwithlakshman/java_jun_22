package com.careerit.cj.coursestats.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int sum = 0;
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value num1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter the value num2: ");
			int num2 = sc.nextInt();
			sum = num1 / num2;
			System.out.println("Result is :" + sum);
		} catch (ArithmeticException | InputMismatchException  e) {
			System.out.println("Value of num2 can't be zero " + e);
		}catch (Exception e) {
			System.out.println("Please check your inputs");
			e.printStackTrace();
		}finally {
			sum = sum + 1;
			System.out.println(sum);
		}
		File file = new File("names.txt");
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;
			try {
				while ((line = br.readLine()) != null) {
					System.out.println(line.substring(0, 3).toUpperCase());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Closing of the resources");
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Main ends");
	}

}
