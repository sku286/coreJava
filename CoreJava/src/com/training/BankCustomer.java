package com.training;

public class BankCustomer {
	
	String name;
	String Address;
	float salary;
	//String type_of_loan;
	float Eligible_loan_amount=0;
	float Intrest_rate=0;
	
	public BankCustomer(String name, String address, float salary, float eligible_loan_amount, float intrest_rate) {
		super();
		this.name = name;
		Address = address;
		this.salary = salary;
		Eligible_loan_amount = eligible_loan_amount;
		Intrest_rate = intrest_rate;
	}


	
	

}
