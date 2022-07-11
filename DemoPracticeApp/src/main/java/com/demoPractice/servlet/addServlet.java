package com.demoPractice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addServlet")
public class addServlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int i=Integer.parseInt(request.getParameter("num1"));
			int j=Integer.parseInt(request.getParameter("num1"));
			int k=i+j;
			k=k*k;
			
//			PrintWriter out=response.getWriter();
//			out.println("in addServlet");
//			out.println("result is"+k);
	
			//Req dispatcher and Redirect
			
		/*	request.setAttribute("k", k);
			RequestDispatcher rd=request.getRequestDispatcher("/Sq");
			rd.forward(request, response);
		*/
			
		//	response.sendRedirect("Sq?k="+k); //url rewriting
			
		/*	HttpSession session=request.getSession();
			session.setAttribute("k", k);
			response.sendRedirect("Sq");
		*/
			
		/**	
			Cookie cookie=new Cookie("k", k+"");
			response.addCookie(cookie);
			
			response.sendRedirect("Sq");
			*/
			
			

	}

	
	

}
