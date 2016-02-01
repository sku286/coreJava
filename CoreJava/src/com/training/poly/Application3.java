package com.training.poly;

import java.util.Scanner;

public class Application3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int ld,items,num;
		
		//Fans[] f1 = new Fans[5];
		//AirConditioner[] a1 = new AirConditioner[3];
		//Vessels[] v1 = new Vessels[6];
		while(true)
		{
			System.out.println("Enter the Choice:");
			System.out.println("1.Fans \n 2.Air Conditioner \n 3.Vessels \n 4.Exit:");
			 num = sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("lending time");
			 ld = sc.nextInt();
			System.out.println("no. of items:");
			 items =sc.nextInt();
		    Fans f1 = new Fans(101,ld,items, 100);
			f1.dispaly();
			break;
		case 2:
			System.out.println("lending time");
			 ld = sc.nextInt();
			System.out.println("no. of items:");
			 items =sc.nextInt();
			AirConditioner a1 = new AirConditioner(102,ld,items, 500);
			a1.dispaly();
			break;
		case 3:
			System.out.println("lending time");
			ld = sc.nextInt();
			System.out.println("no. of items:");
		    items =sc.nextInt();
			Vessels v1 = new Vessels(103,ld,items, 30);
			v1.dispaly();
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Wrong choice");
			break;
			
		}
	
	 }	
			

	}

}
