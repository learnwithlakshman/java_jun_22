package com.careerit.cbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.careerit.cbook.domain.AppUser;
import com.careerit.cbook.util.DbUtil;

public class AppUserDaoImpl implements AppUserDao {

	private final String LOGIN_QUERY = "select id,user_name from app_user where user_name=? and password=?";

	public AppUser login(String username, String password) {
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		AppUser appUser = null;
	
		try {
			con = DbUtil.getConnection();
			pst = con.prepareStatement(LOGIN_QUERY);
			pst.setString(1, username);
			pst.setString(2, password);
			rs = pst.executeQuery();
			if (!rs.next()) {
				throw new IllegalArgumentException("Bad credentials, please check user name and password");
			}
			Long id = rs.getLong("id");
			String userName = rs.getString("user_name");
			appUser = new AppUser();
			appUser.setId(id);
			appUser.setUsername(userName);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.close(rs, pst, con);
		}
		return appUser;
	}
	
}
