package com.training;

public class CustomerApplication {
public static void main(String[] args) {
	Customer cust1 = new Customer();
	cust1.setCutomerid(101);
	cust1.setCustomername("Vaibhav");
	cust1.setEmail_id("vaibhavraj256@gmail.com");
	cust1.setHandPhone(8754552);
	System.out.println(cust1.showcustomer());
	
	//Customer cust2=new Customer(102, "Ramesh", "ramesh@gmail.com", 87545068);
    //System.out.println(cust2.showcustomer());	
}
}
