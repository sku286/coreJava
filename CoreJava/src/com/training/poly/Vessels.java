package com.training.poly;

public class Vessels extends ChennaiRental{
	//public int no_of_vessels;
	float price;
	

	public Vessels(int serial_number, int lending_peroid, int no_of_item, float price) {
		super(serial_number, lending_peroid,no_of_item);
		//this.no_of_vessels = no_of_vessels;
		this.price = price;
	}


	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		System.out.println("Serial No.:"+serial_number);
		System.out.println("Type:"+"Air Conditioner");
		System.out.println("No of Air conditioner:"+no_of_item);
		System.out.println("Price per piece:"+price);
		System.out.println("Total of Air_conditioner:"+(price*no_of_item*lending_peroid));
		
	}

}
