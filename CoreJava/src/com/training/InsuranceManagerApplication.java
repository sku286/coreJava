package com.training;

public class InsuranceManagerApplication {
	
	public static void main(String[] args){
		
		LifeInsurance ins1 = new LifeInsurance(101, "Ramesh","QTR", 45000);
		LifeInsurance ins2 = new LifeInsurance(102, "SUresh","QTR", 62450);
		LifeInsurance ins3 = new LifeInsurance(103, "Ramit","QTR", 455000);
		LifeInsurance ins4 = new LifeInsurance(104, "Raju","QTR", 96000);
		
		LifeInsurance[] list = new LifeInsurance[4];
		list[0] = ins1;
		list[1] = ins2;
		list[2] = ins3;
		list[3] = ins4;
		
		InsuranceManager obj = new InsuranceManager();
		obj.printPremium(list);
	}

}
