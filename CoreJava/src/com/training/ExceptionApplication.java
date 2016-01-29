package com.training;

import com.training.myexceptions.RangeCheckException;

public class ExceptionApplication  {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		
		try {
			Customer customer=new Customer(101, "Ramesh", "ramesh@gmail.com", 875450686);
		} catch (RangeCheckException e) {
			 //TODO Auto-generated catch block'
			
			//throw new Exception();
			
			System.out.println(e.getMessage());
			throw new Exception();
			
		}
		finally 
		{
			System.out.println("inside finally");
		}
        
		System.out.println("Bye");
	}

}
