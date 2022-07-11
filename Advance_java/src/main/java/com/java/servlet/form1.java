package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/form2.servlet")
public class form1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		version1
//		int num1=Integer.parseInt(request.getParameter("firstNum"));
//		int num2=Integer.parseInt(request.getParameter("secondNum"));
//		int sum=num1+num2;
//		int dif=num1-num2;
//		response.setContentType("text/html");
//		PrintWriter out =response.getWriter();
//		
//		out.write("<html><body>");
//		out.write("<h1>Addition is: " + sum + "</h1>");
//		out.write("</body></html>");
		
//		version2
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		int num1=Integer.parseInt(request.getParameter("firstNum"));
		int num2=Integer.parseInt(request.getParameter("secondNum"));
		int result=0;
		
		String opt=request.getParameter("operation");
		if(opt.equals("+")) {
			result=num1+num2;
		}
		else if(opt.equals("-")){
			result=num1-num2;
		}
		out.write("<html><body>");
		out.write("<h1>Output is: " + result + "</h1>");
		out.write("</body></html>");
	}
}
