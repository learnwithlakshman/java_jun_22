package com.careerit.cbook.controller;

import java.io.IOException;
import java.util.logging.Logger;

import com.careerit.cbook.domain.AppUser;
import com.careerit.cbook.service.AppUserService;
import com.careerit.cbook.service.AppUserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AppUserService appUserService = new AppUserServiceImpl();
	
	private Logger log = Logger.getLogger(LoginServlet.class.getName());
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		try {
			log.info("User name "+username);
			AppUser appUser = appUserService.login(username, password);
			HttpSession session = req.getSession();
			session.setAttribute("appuser", appUser);
			resp.sendRedirect("homepage");
		} catch (Exception e) {
			resp.sendRedirect("login.jsp?message=" + e.getMessage());
		}

	}
}
