package com.training;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		double purchase;
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Purchase Amount:");
		purchase = sc.nextDouble();
		TaxWhiz obj = new TaxWhiz(.14);
		System.out.println("Calculated Tax:"+obj.calcTax(purchase));
		
		
        sc.close();
  
	}

}
