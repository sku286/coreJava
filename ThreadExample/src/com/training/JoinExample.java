package com.training;

import java.io.IOException;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread()  {

			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("reading");
				try {
					System.in.read();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Finished reading");
			}
			
		};
		System.out.println("starting");
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		System.out.println("Main Finished");
	}

}
