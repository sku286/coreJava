package com.training;

public class Application4 {
	public static void main(String[] args) {
	
		Converter obj = new Converter();
		double cel = obj.farenToCelsius(45.0);
		System.out.println("Celsius value of 45F="+cel);
		
		
		Double faren = null;
		double cel2=0.0;
		try 
		{	
	      cel2 = obj.farenToCelsius(faren);
		}
		catch(NullPointerException e)
		{
			System.out.println("Fraen is null");
			System.out.println(e.getMessage());
		}
		System.out.println("Celsius value of 45F="+ cel2);
	}

}
