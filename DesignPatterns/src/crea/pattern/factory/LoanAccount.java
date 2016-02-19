package crea.pattern.factory;
/**
 * 
 * @author sku286
 * Super Type - Super Class
 */

public abstract class LoanAccount {
	
	private int rateOfIntrest;
	
	

	public LoanAccount(int rateOfIntrest) {
		super();
		this.rateOfIntrest = rateOfIntrest;
	}

	public abstract double calculateEmi(int loanAmount , int tenure);

	public int getRateOfIntrest() {
		return rateOfIntrest;
	}

	

}
