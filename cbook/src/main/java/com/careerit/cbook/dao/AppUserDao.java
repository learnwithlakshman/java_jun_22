package com.careerit.cbook.dao;

import com.careerit.cbook.domain.AppUser;

public interface AppUserDao {

		AppUser login(String username,String password);
}
