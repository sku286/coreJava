package com.training;

public class ExceptionHandling_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			String name = null;
			String age = "forty";
			System.out.println(name.length());
			int age2 = Integer.parseInt(age);
			System.out.println(++age2);
			
		}
		catch (NumberFormatException | NullPointerException e){
			if(e instanceof  NumberFormatException)
			{
			System.out.println(e.getMessage()+"Age should be integer");
			}
			else
			{
				System.out.println(e.getMessage()+"\n name should not be null");
			}
		}

	}

}
