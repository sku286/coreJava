package com.training.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Customerlist
 */
public class Customerlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	ArrayList<String> list=new ArrayList<String>();

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customerlist() {
        super();
        // TODO Auto-generated constructor stub
        list.add("Aman");
    	list.add("Ramesh");
    	list.add("Suresh");
    	list.add("Rohan");
    	list.add("Abhiraj");
    	list.add("Anup");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//HttpServletRequest request1 = (HttpServletRequest)pageContext.getRequest();
		request.setAttribute("names", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ShowCustomer.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
