package com.training;

import com.training.myexceptions.RangeCheckException;

public class Customer {
private int cutomerid;
private String customername;
private String email_id;
private long handPhone;


public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

//Declare Rule
public Customer(int cutomerid, String customername, String email_id, long handPhone) throws RangeCheckException  {
	super();
	this.cutomerid = cutomerid;
	this.customername = customername;
	this.email_id = email_id;
	if(handPhone>99999999L && handPhone<10000000000L)
	{
		throw new RangeCheckException(handPhone);
	}
	else
	{
	this.handPhone = handPhone;
	}
}
public int getCutomerid() {
	return cutomerid;
}
public void setCutomerid(int cutomerid) {
	this.cutomerid = cutomerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
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
//Handle Rule
public void setHandPhone(long handPhone) {
	if(handPhone<999999999L)
	{
		try {
			throw new RangeCheckException(handPhone);
		} 
		catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	else
	{
	this.handPhone = handPhone;
	}
}
public String showcustomer() {
	String cust= cutomerid + ";" + customername + ":" + email_id  + ":" + handPhone;
return cust;
	
}


}
