package com.training;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class BookManager {
	
	public String addBooks(Book[] bks) 
	{
		try {
            PrintWriter out = new PrintWriter(new FileWriter("abc.txt",true)); 
            for(Book bk:bks) 
              {
            	out.println(bk);
               }
            out.close();
            } 
			catch (FileNotFoundException e){ 
				e.printStackTrace();
			} 
			catch (IOException e) 
		    {
				e.printStackTrace();
			}
		
		return "book added";
		
	}
	
	public void printBooks(File filename)
	{
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line=null;
			try 
			{
				while(( line=br.readLine()) !=null) {
				System.out.println(line); }
			} 
			catch (IOException e) {
			e.printStackTrace();
			} 
			} 
			catch (FileNotFoundException e) {
			e.printStackTrace(); 
			}

		
	}

}
