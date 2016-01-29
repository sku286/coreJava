package com.training;

public class InsuranceManager {
     
	public void printPremium(LifeInsurance[] policies){
		
		for(LifeInsurance ins: policies)
		{
			System.out.println(ins);
			System.out.println("Premium:="+ins.calculate());
			
		}
	}
}
