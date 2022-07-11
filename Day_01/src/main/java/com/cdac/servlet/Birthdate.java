package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/version2")
public class Birthdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("date");
		
		LocalDate now =LocalDate.now();
		
		LocalDate Birthdate = LocalDate.parse(str);
		
		Period p = Period.between(now, Birthdate);
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Age : " + p.getYears()+" years " + p.getMonths()+" months "+p.getDays()+" days"+"</h1>");
		out.write("</body></html>");
	}

	
	

}
