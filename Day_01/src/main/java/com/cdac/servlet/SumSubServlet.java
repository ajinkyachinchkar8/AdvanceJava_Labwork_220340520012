package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumSubServlet")
public class SumSubServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 double a = Integer.parseInt(request.getParameter("num1"));
		 double b = Integer.parseInt(request.getParameter("num2"));
		 String str = request.getParameter("b1");
         double res=0;
         if(str.equals("+")) {
        	 res = a + b;
         }
         else if(str.equals("-")) {
        	 res = a - b;
         }
         else if(str.equals("*")) {
        	 res = a * b;
         }
         else {
        	 res = a / b;
         }
         
         
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
        out.write(" <h1>result is " +res+ " </h1> ");
		out.write("</body></html>");
	
	

	}
}

