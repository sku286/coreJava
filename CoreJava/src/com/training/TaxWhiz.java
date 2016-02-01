package com.training;

public class TaxWhiz {
	
	private double current_tax_rate;
	
	public TaxWhiz(double d) {
		super();
		this.current_tax_rate = d;
	}

	public  double calcTax(double purchase)
	{
		return purchase*current_tax_rate;
	}

}
