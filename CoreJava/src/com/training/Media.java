package com.training;

public class Media {
	
	private String title;
	private String author;
	private float rating;
	private String subject;
	/*Scanner sc = new Scanner(System.in);
	public void details()
	{
		System.out.println("Enter the Title:");
		title = sc.next();
		System.out.println("Enter the Author/Director");
		author =sc.next();
		System.out.println("Enter the rating");
		rating =sc.nextInt();
	}*/
	public Media(String title, String author, float rating) {
		super();
		this.title = title;
		this.author = author;
		this.rating = rating;
		
	}
	public void display()
	{
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Rating"+rating);
		//System.out.println("Subject:"+subject);
	}
	
	
	

}
