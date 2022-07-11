package com.demoPractice.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

	/**
	 * ServletConfig and ServletContext
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			out.println("Hi");
			
			/**
			 * to fetch the value name or phone, we need to use a special object.
			 *object of ServletContext 
			 */
			
			/**
			ServletContext ctx=getServletContext();
			String str=ctx.getInitParameter("name");//(getInitParameter)method which will give you value of an attribute which we specify in brackets
			out.println(str);
			*/
			
			//differetnt value for different servlet then go for  ServletConfig
			
			//same value for different servlet then go for ServletContext
			
			ServletConfig cfg=getServletConfig();
			String str=cfg.getInitParameter("name");
			out.println(str);
	}

}
