package com.careerit.cj.day11;

public class PlayerData {
	public static void main(String[] args) {
		String data = "Shubman Gill,Batsman,80000000,India,GT\r\n"
				+ "Sai Sudarshan,Batsman,2000000,India,GT\r\n"
				+ "Abhinav Sadarangani,Batsman,26000000,India,GT\r\n"
				+ "Jason Roy,Batsman,20000000,England,GT\r\n"
				+ "David Miller,Batsman,30000000,South Africa,GT\r\n"
				+ "Matthew Wade,WK-Batsman,24000000,Australia,GT\r\n"
				+ "Wriddhiman Saha,WK-Batsman,19000000,India,GT\r\n"
				+ "Rashid Khan,Bowler,150000000,Afghanistan,GT\r\n"
				+ "Varun Aaron,Bowler,5000000,India,GT\r\n"
				+ "Darshan Nalkande,Bowler,2000000,India,GT\r\n"
				+ "Yash Dayal,Bowler,32000000,India,GT\r\n"
				+ "Pradeep Sangwan,Bowler,2000000,India,GT\r\n"
				+ "Alzarri Joseph,Bowler,24000000,West Indies,GT\r\n"
				+ "R Sai Kishore,Bowler,30000000,India,GT\r\n"
				+ "Noor Ahmad,Bowler,3000000,Afghanistan,GT\r\n"
				+ "Lockie Ferguson,Bowler,100000000,New Zealand,GT\r\n"
				+ "Mohammed Shami,Bowler,62500000,India,GT\r\n"
				+ "Hardik Pandya,All-rounder,150000000,India,GT\r\n"
				+ "Dominic Drakes,All-rounder,11000000,West Indies,GT\r\n"
				+ "Vijay Shankar,All-rounder,14000000,India,GT\r\n"
				+ "Jayant Yadav,All-rounder,17000000,India,GT\r\n"
				+ "Gurkeerat Singh Mann,All-rounder,5000000,India,GT\r\n"
				+ "Rahul Tewatia,All-rounder,90000000,India,GT";
		
				String[] arr = data.split("\\n");
				for(String ele:arr) {
					ele=ele.trim();
					String[] subArr = ele.split(",");
					System.out.println(subArr[0]+" "+subArr[2]);
				}
	}

		
}
