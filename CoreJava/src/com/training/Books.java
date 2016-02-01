package com.training;

public class Books extends Media{
	
	private int no_of_pages;
	
	
	public Books(String title, String author, float rating, int no_of_pages) {
		super(title, author, rating);
		this.no_of_pages = no_of_pages;
	}


	public void display()
	{
		super.display();
		System.out.println("no.of.pages:"+no_of_pages);
	}
	
	
	

}
