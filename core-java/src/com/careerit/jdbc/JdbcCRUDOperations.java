package com.careerit.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcCRUDOperations {

	public static void main(String[] args) {
			
			//createTable();
		   // insertRow("One+",83500,10);
		showData();
	}
	
	private static void createTable() {
		String query="CREATE TABLE product(pid SERIAL PRIMARY KEY,name VARCHAR(100),price FLOAT,discount FLOAT)";
		Connection con = null;
		Statement st = null;
		try {
			con=DbUtil.getConnection();
			st = con.createStatement();
			st.execute(query);
		}catch (Exception e) {
			System.out.println("While creating table :"+e);
		}finally {
			DbUtil.close(st, con);
		}
		
	}
	private static void insertRow(String name,float price, float discount) {
		String query="INSERT INTO product(name,price,discount) VALUES(?,?,?)";
		Connection con = null;
		PreparedStatement st = null;
		try {
			con=DbUtil.getConnection();
			st = con.prepareStatement(query);
			st.setString(1, name);
			st.setFloat(2, price);
			st.setFloat(3, discount);
			int count = st.executeUpdate();
			System.out.println("Total "+count+" products are added");
		}catch (Exception e) {
			System.out.println("While insert data into table :"+e);
			e.printStackTrace();
		}finally {
			DbUtil.close(st, con);
		}
	}
	private static void updateRow() {
		
	}
	private static void deleteRow() {
		
	}
	private static void showData() {
		// id,name,price,discount,net_price
		String query = "select pid,name,price,discount as discount,price-(price*discount/100) as net_price from product";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con=DbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt("pid"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getDouble("price"));
				System.out.println(rs.getDouble("discount")+"%");
				System.out.println(rs.getDouble("net_price"));
				System.out.println("--------------------------");
			}
		}catch (Exception e) {
			System.out.println("While insert data into table :"+e);
			e.printStackTrace();
		}finally {
			DbUtil.close(rs,st, con);
		}
	}
	
}
