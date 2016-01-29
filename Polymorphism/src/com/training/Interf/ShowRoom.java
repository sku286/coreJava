package com.training.Interf;
import com.training.Interf.Automobiles;

public class ShowRoom {
	
	public Automobiles getItem(int key)
	{
		switch(key){
		case 1:
			return new PassengerCar();
		case 2:
			return new LuxuryCar();
		case 3:
			return new SportsCar();
		default:
			return null;
		}
	}
	/**
	 * 
	 * @param polyAuto takes the Object of Automobiles 
	 * Method prints the quatotation of product selected
	 */
	public void printQuote(Automobiles polyAuto)
	
	{
	  System.out.println("----Quatation-----");
	  System.out.println("Model:="+polyAuto.getModel());
	  System.out.println("Price:="+polyAuto.getPrice());
	  System.out.println("Color:="+polyAuto.getColor());
	}

}
