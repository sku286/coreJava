package com.training.Interf;

//import com.training.Interf.ShowRoom;

public class Application {
	

	public static void main(String[] args) {
		
		ShowRoom1 show1= new ShowRoom1();
		Automobiles polyAuto = null;
		int key=3;
		polyAuto = show1.getItem(key);
		if(polyAuto!=null)
		{
			show1.printQuote(polyAuto);
		}
		else
		{
			System.out.println("Invalid option ! Try Again");
		}
		//show1.printQuote(polyAuto);
		
	}

}
