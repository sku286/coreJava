package com.training;

import java.util.Scanner;

public class InsuranceApplication {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	LifeInsurance obj=new LifeInsurance();
	
	//Instance Variable has a default value
	System.out.println(obj.calculate());
	
	//Using Parameterized Constructor
	LifeInsurance obj1=new LifeInsurance(53455,"Ramesh","kuyd",5632);
	System.out.println(obj1.calculate());
	
	//Using Wrapper Class
	long policyNumber=Long.parseLong(args[0]);
	double policyAmount=Double.parseDouble(args[3]);
	
	//Command Line Arguments
	LifeInsurance obj2=new LifeInsurance(policyNumber,args[1],args[2],policyAmount);
	System.out.println(obj2.calculate());	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("EnterPolicy No.");
	long policyn01=sc.nextLong();
	
	System.out.println("Enter policy holder Name:");
	String name=sc.next();
	
	System.out.println("Enter Payment Mode");
	String pmode=sc.next();
	
	System.out.println("Enter premium Amount");
	double amount=sc.nextDouble();
	
    LifeInsurance obj3 = new LifeInsurance(policyn01, name, pmode, amount);
    System.out.println(obj3.calculate());
    System.out.println(obj3.calculate(amount));
    
    
    sc.close();
	}
}
