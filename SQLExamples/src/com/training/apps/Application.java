package com.training.apps;

import java.util.List;

import com.training.daos.CustomerDAO;
import com.training.entity.Customer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(SqlConnection.getOracleConnection());
	    // Customer cust = new Customer(126, "ganesh","ganesh@gmail.com", 4563217);
		CustomerDAO dao= new CustomerDAO();
		//int rowAdded = dao.add(cust);
		//System.out.println(rowAdded + ":=Rows Added");
		/*Customer foundCustomer = dao.find(124);
		System.out.println(cust.showcustomer());*/
		/*List<Customer> foundCustomer = dao.findAll();
	    System.out.println(foundCustomer);*/
		System.out.println(dao.update(123));
	}

}
