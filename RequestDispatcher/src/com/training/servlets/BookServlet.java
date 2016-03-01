package com.training.servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.domains.BookManager;
import com.training.entity.Book;

/**
 * Servlet implementation class BookServlet
 */
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BookManager mgr = new BookManager();
		HashMap<Long,Book> bookList = null;
		
		String str=request.getParameter("bookid");
		//System.out.println(str.getClass());
		
		if(request.getParameter("bookid")!=null){
			bookList = new HashMap<Long,Book>();
			Book bookResult = mgr.findBookById(Long.parseLong(str));
			bookList.put((long)1, bookResult);
		}
		else{
			bookList = mgr.getAllBooks();
		}
		
		
		
		request.setAttribute("foundbooks", bookList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowBooks.jsp");
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
