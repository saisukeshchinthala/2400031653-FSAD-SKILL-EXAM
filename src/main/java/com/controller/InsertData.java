package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.model.StudentManager;

@WebServlet("/InsertData")
public class InsertData extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	    String sname = request.getParameter("t2");
	    double smarks = Double.parseDouble(request.getParameter("t3"));

	    Student s1 = new Student();
	    s1.setSname(sname);
	    s1.setSmarks(smarks);

	    try {
	        StudentManager sm = new StudentManager();
	        String ack = sm.insertData(s1);
	        response.setContentType("text/html");
	        PrintWriter pw = response.getWriter();
	        pw.print(ack);

	    } catch (Exception e) {
	        e.printStackTrace();
	        response.getWriter().print("Error: " + e.getMessage());
	    }
	}


	
	

}
