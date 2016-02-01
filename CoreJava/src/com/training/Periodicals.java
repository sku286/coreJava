package com.training;

public class Periodicals extends Media{
	
	private String subject;
	
	public Periodicals(String title, String author, float rating, String subject) {
		super(title, author, rating);
		this.subject = subject;
	}

	public void display()
	{
		super.display();
		System.out.println("Subject:"+subject);
		
	}
	
	

}
