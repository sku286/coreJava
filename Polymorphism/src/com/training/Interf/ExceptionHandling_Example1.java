package com.training.Interf;

public class ExceptionHandling_Example1 {
	
	public static void main(String[] args) {
		
		String name = null;
		int length=0;
		try
		{
		System.out.println(args[0]);
		System.out.println(name.length());
		//int length=name.length();
		length=name.length();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("use Run Config-To Enter Command Line Argument");
		}
		catch(NullPointerException e)
		{
			System.out.println("Check Attribute name-it may be null");
		}
		
		System.out.println(length);
	}

}
