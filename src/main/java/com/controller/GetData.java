package com.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.StudentManager;


@WebServlet("/GetData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetData() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List.<Student> list;
		try
		{
			response.setContentType("textr/html");
			PrintWriter pw=response.getWriter();
		StudentManager sm=new StudentManager();
		list=sm.getData();
		request.setAttribute("slist", lsit);
		RequestDispatcher rd=request.getRequestDispatcher("read.jsp");
		rd.forward(request, response);
		}
		catch (Exception e)
		{
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
