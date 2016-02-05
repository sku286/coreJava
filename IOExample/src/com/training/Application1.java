package com.training;

import java.io.File;

public class Application1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookManager obj = new BookManager();
		Book[] obj1 = new Book[3];
		obj1[0] = new Book("ram","gyan","hd",45);
		obj1[1] = new Book("shyam","ds","tv",145);
		obj1[2] = new Book("renu","df","dfa",245);	
		System.out.println(obj.addBooks(obj1));
		//System.out.println("hjgds");
		obj.printBooks(new File("abc.txt"));
		
		

	}

}
