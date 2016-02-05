package com.training.domains;
import java.io.*;

import com.training.Book;
public class BookSerializer {
	
	public String Serializ(Book obj)
	{
		String message = null;
		ObjectOutputStream out = null;
		try
		{
		 out = new ObjectOutputStream(new FileOutputStream(new File("Book.Ser")));
		 out.writeObject(obj);
		 message = "One Object Serialized-press F5 to view the file";
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try{
				out.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		return message;
	}
	
	public Object deSerialize() {
		
		Object obj = null;
		//Object in = null;
		//ObjectInputStream oin = null;
		
		try(
				ObjectInputStream oin = new ObjectInputStream(new FileInputStream(new File("Book.ser")));)
				{
				
			      obj = oin.readObject();
			      
				}
				catch(ClassNotFoundException | IOException e){
					e.printStackTrace();
				}
		
		
		return obj;
		
	}

}
