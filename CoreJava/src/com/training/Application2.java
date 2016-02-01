package com.training;

import java.util.Scanner;

public class Application2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the  media Type \n 1. Book\n 2.Peroidicals \n 3.Dvds \n )");
		int num = sc.nextInt();
		Books[] book = new Books[2];
		Periodicals[] peroid = new Periodicals[2];
		DVDs[] dvd = new DVDs[2];
		
		book[0]=new Books("Wings of Fire","A p J kalam", 5, 150);
		book[1]=new Books("Godhan","Premchand", 6, 100);
		peroid[0] = new Periodicals("abc", "xyz", 2, "ancient india");
		peroid[1] = new Periodicals("abc vol2", "xyz", 3, "medival india");
		 dvd[0] = new DVDs("airlift", "xyz",7 ,120 ,12 );
		 dvd[1] = new DVDs("wazer", "xyz1", 6, 150, 10);
	
		switch(num)
		{
		case 1:	
			for (Books n : book)
			 n.display();
			break;
		case 2:	
			for (Periodicals n : peroid)
			n.display();
			
			break;
		case 3:
			
			for (DVDs n : dvd)
			  n.display();
			break;
		
		default:
			System.out.println("Enter correct choice:");
			break;
		
	  }
	}

}
