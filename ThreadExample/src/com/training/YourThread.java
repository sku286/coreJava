package com.training;

public class YourThread implements Runnable {
	double i=100;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i <= 10; i++) 
		{
		 System.out.println( calculate());;	
		}
	}
	public double calculate(){
		
		//double i=100;
		 return ++i;
	}

}
