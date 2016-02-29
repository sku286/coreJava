package com.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class GreetingServlet
 */
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	Logger log =Logger.getLogger(this.getClass().getName());
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GreetingServlet() {
        super();
        // TODO Auto-generated constructor stub
        log.info("==Constructor Called==");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("Vendor - Request Object:"+request.getClass().toString());
		log.info("Vendor Response Object:"+request.getClass().toString());
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		String role=request.getParameter("role");
		
	
		out.println("<h1 style='text-align:centre'>Welcome to Servlet Programming</h1>");
		out.println("welcome:"+role +":"+user);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
