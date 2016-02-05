package com.training;

import java.io.Serializable;

public class Book implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	private String bookNumber;
	 private String bookName;
	 private String author;
	 private transient double price;
	public Book() {
		super();
		
		System.out.println("Book Initilization");
		
	}
	public Book(String bookNumber, String bookName, String author, double price) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	
	
	public String getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(String bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double  getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookNumber+":"+bookName+":"+price;
	}
	
	
	 
	 
	 

}
