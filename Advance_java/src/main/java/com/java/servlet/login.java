package com.java.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.java")
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		boolean isValid = loginCheck(username, password);
		if(isValid) {
			response.sendRedirect("jdb1.html");
		} else {
			response.sendRedirect("login.html");
		}
	}

	private boolean loginCheck(String username, String password) {
		// TODO Auto-generated method stub
		if(username.equals("dhiraj") && password.equals("1234"))
			return true;
		return false;
	}
	
}
