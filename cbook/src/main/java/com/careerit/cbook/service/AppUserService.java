package com.careerit.cbook.service;

import com.careerit.cbook.domain.AppUser;

public interface AppUserService {

		AppUser login(String username,String password);
}
