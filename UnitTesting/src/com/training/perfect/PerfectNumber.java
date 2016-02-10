package com.training.perfect;

public class PerfectNumber {
	
	private int number;
	private int number1,number2;
	
	
	public PerfectNumber() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PerfectNumber(int number) {
		super();
		this.number = number;
	}


	public PerfectNumber( int number1, int number2) {
		super();
		
		this.number1 = number1;
		this.number2 = number2;
	}

    
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getNumber1() {
		return number1;
	}


	public void setNumber1(int number1) {
		this.number1 = number1;
	}


	public int getNumber2() {
		return number2;
	}


	public void setNumber2(int number2) {
		this.number2 = number2;
	}


	public boolean isPerfectNumber(int number){
		int s=0,i;
		for(i=1;i<=number/2;i++)
			if((number%i)==0)
			   s+=i;
		
		if(s==number)
		   return true;
		else
			return false;
	}
	/*public boolean isPerfectNumber(int number1,int number2){
		int s,i,j;
		for(j=number1;j<=number2;)
		{
			s=0;
			
		for(i=1;i<=j/2;i++)
			if((j%i)==0)
			   s+=i;
		if(s==j)
		   return true;
		else
			return false;
		}
		return false;
	}*/
	

}

