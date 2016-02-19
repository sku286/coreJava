package crea.pattern.factory;
/**
 * 
 * @author sku286
 *  Subclass -2(Product-2)
 */

public class PersonalLoan extends LoanAccount {

	public PersonalLoan(int rateOfIntrest) {
		super(rateOfIntrest);
		
	}

	@Override
	public double calculateEmi(int loanAmount, int tenure) {
		
		return loanAmount*getRateOfIntrest()*tenure;
	}

	
}
