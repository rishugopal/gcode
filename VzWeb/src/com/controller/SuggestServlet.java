package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SuggestServlet")
public class SuggestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SuggestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
    	response.getWriter().append("Served at: ").append(request.getContextPath());
    	
    	System.out.println("servlet");
    	try
    	{
    		response.setContentType("text/html;charset=UTF-8");
    		PrintWriter out=response.getWriter();
    		
    		String field_name=request.getParameter("name");
    		System.out.println(field_name);
    		//call the method that gives link for the respective field
    		String link="youtube link fetch by .properties file";
    		out.println(link);
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
