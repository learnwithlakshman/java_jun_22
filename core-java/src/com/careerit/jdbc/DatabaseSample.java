package com.careerit.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseSample {
	
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = DbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery("select name,role,country,amount from player_details order by name");
			while (rs.next()) {
				System.out.println("Name    :"+rs.getString("name"));
				System.out.println("Role    :"+rs.getString("role"));
				System.out.println("Country :"+rs.getString("country"));
				System.out.println("Amount  :"+rs.getDouble("amount"));
				System.out.println("*".repeat(50));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtil.close(rs, st, con);
		}
	}
}
