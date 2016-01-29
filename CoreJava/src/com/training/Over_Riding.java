package com.training;

public class Over_Riding {

	public final static void main(String[] args) {
		// TODO Auto-generated method stub

		LifeInsurance ins1 = new LifeInsurance(101,"Ramesh","ahjs",4563);
		LifeInsurance ins2 = new LifeInsurance(101,"Ramesh","ahjs",4563);
		System.out.println(ins1.equals(ins2));
		
		LifeInsurance ins3=ins1;
		System.out.println(ins1.equals(ins3));
		
		String s=new String("hello");
		System.out.println(ins1.equals(s));
		
		LifeInsurance ins4=null;
		System.out.println(ins1.equals(ins4));
	
	}

}
