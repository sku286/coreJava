package strupattern.adapter;

public class BankAccount {
	
	private double principle;

	public BankAccount(double principle) {
		super();
		this.principle =principle;
	}
	
	public double calculate()
	{
		return principle*.10;
	}

}
