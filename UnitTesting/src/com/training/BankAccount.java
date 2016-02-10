package com.training;

public class BankAccount {
	
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(long accountNumber, String accountHolderName, double balance) throws NullPointerException {
		super();
		this.accountNumber = accountNumber;
		
		if(accountHolderName!=null)
		{
		   this.accountHolderName = accountHolderName;
		}
		else
		{
			throw new NullPointerException();
		}
		this.balance = balance;
	}
	
	
	


	public long getAccountNumber() {
		return accountNumber;
	}





	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}





	public String getAccountHolderName() {
		return accountHolderName;
	}





	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}





	public double getBalance() {
		return balance;
	}





	public void setBalance(double balance) {
		this.balance = balance;
	}





	public double deposit(double amountDeposited){			
		return this.balance+amountDeposited;

			
	}
   public double withdraw(double amountWithdraw){	
	   if(amountWithdraw <=0 )
		   throw new NullPointerException();
	   else
		return this.balance-amountWithdraw;
	}

}
