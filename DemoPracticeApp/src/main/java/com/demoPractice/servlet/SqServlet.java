package com.demoPractice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;

@WebServlet("/SqServlet")
public class SqServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int k =Integer.parseInt(request.getParameter("k"));
		
	/*	HttpSession session=request.getSession();
		int k=(int)session.getAttribute("k");
		PrintWriter out =response.getWriter();
		out.println("in SqServlet");
		out.println(k);
	*/
		/*
		int k=0;
		Cookie cookies[]=request.getCookies();
		*/
		
		
	}

}
