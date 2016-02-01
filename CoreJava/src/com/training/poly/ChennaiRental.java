package com.training.poly;

public abstract class ChennaiRental {
	
	 public int serial_number;
	 int lending_peroid;
	 int no_of_item;
	 

	public ChennaiRental(int serial_number, int lending_peroid,int no_of_item) {
		super();
		this.serial_number = serial_number;
		this.lending_peroid = lending_peroid;
		this.no_of_item = no_of_item;
	}

	public abstract void dispaly();
	 	
}
