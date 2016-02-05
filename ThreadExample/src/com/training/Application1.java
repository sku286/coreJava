package com.training;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		YourThread obj = new YourThread();
		Thread th1 = new Thread(obj,"Ram1");
		
		Thread th2 = new Thread(obj,"Ram2");
		
		Thread th3 = new Thread(obj,"Ram3");

		th1.start();
		th2.start();
		th3.start();
	}

}
