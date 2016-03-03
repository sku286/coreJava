package com.training.beans;

import java.io.Serializable;
import java.util.logging.*;

public class Customer implements Serializable {

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	
	Logger log=Logger.getLogger(this.getClass().getName());
	private int customerid;
	private String customerName;
	private String email_id;
	private long handPhone;


	public Customer() {
		super();
		log.info("Customer initalized");
		// TODO Auto-generated constructor stub
	}


	public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public long getHandPhone() {
		return handPhone;
	}


	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
		
	
	public String getinfo(){
		
		return "Message from bean";
	}



}
