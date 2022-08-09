package com.careerit.cbook.controller;

import java.io.IOException;
import java.util.List;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.service.ContactService;
import com.careerit.cbook.service.ContactServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ContactService contactService = new ContactServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Contact> list = contactService.getContacts();
		req.setAttribute("contacts", list);
		RequestDispatcher rd = req.getRequestDispatcher("homepage.jsp");
		rd.forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
