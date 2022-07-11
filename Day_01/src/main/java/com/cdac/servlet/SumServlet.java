package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        int a = Integer.parseInt(request.getParameter("num1"));
        int b = Integer.parseInt(request.getParameter("num2"));
     
       
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write(" <h1>Sum is " +(a+b)+ " </h1> ");
	
		out.write("</body></html>");
	

	}
}
