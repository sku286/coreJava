package com.training.myexceptions;
//Inheritance
//Checked Exception - Because extending Exception
public class RangeCheckException extends Exception {
	
	private long handPhone;
     
	
	//mandatory dependency
	public RangeCheckException(long handPhone) {
		super();
		this.handPhone = handPhone;
	}
//overloading super class method
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return  handPhone + "Should be 10 Digit Number";
	}
	

}
