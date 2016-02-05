package com.training;

import com.training.domains.BookSerializer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookSerializer obj1 = new BookSerializer();
		Book obj = new Book("123", "Ram", "jhgsdh", 45);
		String message = obj1.Serializ(obj);
		
		
		if(message!=null)
		{
			System.out.println(message);
		}
		else
		{
			System.out.println("error");
		}
		
		Book bk= (Book)obj1.deSerialize();
		System.out.println(bk);
		System.out.println(bk.getPrice());
		

	}

}
