package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/form2.java")
public class form2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int day=Integer.parseInt(request.getParameter("day"));
		int month=Integer.parseInt(request.getParameter("month"));
		int year=Integer.parseInt(request.getParameter("year"));
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(year,month,day);
		Period period = Period.between(birthday, today);
		
		//version 1
//		out.write("<html><body>");
//		out.write("<h1>You are " + period.getYears() +" years old");
//		out.write("</body></html>");
//		
		//version 2
		out.write("<html><body>");
		out.write("<h1>You are " + period.getYears() +" years "+period.getMonths()+" months "+period.getDays()+" days old");
		out.write("</body></html>");
		
	}
}
