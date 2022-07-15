package com.careerit.cj.coursestats.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args){
			System.out.println("Main Starts");
			File file = new File("names.txt");
			BufferedReader br=null;
			try {
				 br = new BufferedReader(new FileReader(file));
				String line = null;
				try {
					while((line=br.readLine())!=null) {
						System.out.println(line.substring(0,3).toUpperCase());
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				try {
					System.out.println("Closing of the resources");
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Main ends");
	}
	
	static int count = 0;
	public void withDraw(String accNumber,double amount) {
			
			if(count > 3) {
				throw new IllegalArgumentException("You have reached max transactions wait for 24 hours");
			}
	}
}
