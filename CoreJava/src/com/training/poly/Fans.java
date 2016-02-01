package com.training.poly;

public class Fans extends ChennaiRental{

	float price;
	
		

	public Fans(int serial_number, int lending_peroid, int no_of_item, float price) {
		super(serial_number, lending_peroid,no_of_item);
		//this.no_of_fans = no_of_fans;
		this.price = price;
	}


	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("Serial No.:"+serial_number);
		System.out.println("Type:"+"Fan");
		System.out.println("No of Fans."+no_of_item);
		System.out.println("Price per piece:"+price);
		System.out.println("Total of fans:"+(price*no_of_item*lending_peroid));
		
	}
	

	
	

}
