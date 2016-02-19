package com.training;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CustomerApplication {
public static void main(String[] args) {
	
	Logger log = Logger.getLogger("MyFirstLog");
	BasicConfigurator.configure();
	
	Customer cust1 = new Customer();
	log.info("Main method call");
	cust1.setCutomerid(101);
	cust1.setCustomername("Vaibhav");
	cust1.setEmail_id("vaibhavraj256@gmail.com");
	cust1.setHandPhone(8754552);
	log.info("values are set");
	System.out.println(cust1.showcustomer());
	
	log.info("done bye");
	//Customer cust2=new Customer(102, "Ramesh", "ramesh@gmail.com", 87545068);
    //System.out.println(cust2.showcustomer());	
}
}
