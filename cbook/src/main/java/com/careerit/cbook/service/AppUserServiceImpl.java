package com.careerit.cbook.service;

import com.careerit.cbook.dao.AppUserDao;
import com.careerit.cbook.dao.AppUserDaoImpl;
import com.careerit.cbook.domain.AppUser;

public class AppUserServiceImpl implements AppUserService {

	private AppUserDao appUserDao = new AppUserDaoImpl();
	public AppUser login(String username, String password) {
		// Validation
		return appUserDao.login(username, password);
	}

}
