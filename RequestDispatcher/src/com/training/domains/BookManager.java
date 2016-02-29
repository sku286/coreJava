package com.training.domains;
import java.util.*;

import com.training.entity.Book;

public class BookManager {

	private HashMap<Long, Book> booklist;
	


	
		
		

	
	public BookManager() {
		super();
		booklist  = new HashMap<Long, Book>();
		Book obj1 =new Book(101, "java", "abc", 450);
		Book obj2 =new Book(102, "physics", "einstein", 900);
		booklist.put((long) 1,obj1);
		booklist.put((long) 2,obj2);
	}
	public HashMap<Long, Book> getAllBooks()
	 {

		return booklist;
	 }
	public Book findBookById(long id)
	{
		Book bk = null;
		Iterator it = booklist.entrySet().iterator();
		while(it.hasNext())
		{
			  Map.Entry pair = (Map.Entry)it.next();
			  if((long)pair.getKey()==id)
				  bk = (Book) pair.getValue();
				  
	    }
		return bk;

	}
	
}
