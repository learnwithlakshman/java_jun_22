package com.careerit.cbook.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashPrintServiceAttributeSet;

/**
 * Servlet implementation class AddColorsCartServlet
 */
public class AddColorsCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String color = request.getParameter("scolor");
			
			HttpSession session = request.getSession();
			if(session.getAttribute("cartitems")== null) {
				Set<String> set = new HashSet<>();
				set.add(color);
				session.setAttribute("cartitems", set);
			}else {
				Set<String> addeditems = (Set<String>) session.getAttribute("cartitems");
				addeditems.add(color);
				session.setAttribute("cartitems", addeditems);
			}
			response.sendRedirect("colorscart.jsp");
	}

	
}
