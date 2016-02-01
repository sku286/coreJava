package com.training;

public class DVDs extends Media{
	
	 private float running_time;
	 private int lending_length;
	 
	public DVDs(String title, String author, float rating, float running_time, int lending_length) {
		super(title, author, rating);
		this.running_time = running_time;
		this.lending_length = lending_length;
	}
	 public void display()
		{
			super.display();
			System.out.println("Running Time:"+running_time);
			System.out.println("Lending Time:"+lending_length);
			
		}

}
