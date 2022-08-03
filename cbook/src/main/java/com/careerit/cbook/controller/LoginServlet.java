package com.careerit.cbook.controller;

import java.io.IOException;

import com.careerit.cbook.domain.AppUser;
import com.careerit.cbook.service.AppUserService;
import com.careerit.cbook.service.AppUserServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AppUserService appUserService = new AppUserServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		try {
			AppUser appUser = appUserService.login(username, password);
			HttpSession session = req.getSession();
			session.setAttribute("appuser", appUser);
			resp.sendRedirect("homepage.jsp");
		} catch (Exception e) {
			resp.sendRedirect("login.jsp?message=" + e.getMessage());
		}

	}
}
