package crea.pattern.factory;
/**
 * 
 * @author sku286
 *  Subclass -I (Product-I)
 */

public class HousingLoan extends LoanAccount {

	public HousingLoan(int rateOfIntrest) {
		super(rateOfIntrest);
		
	}

	@Override
	public double calculateEmi(int loanAmount, int tenure) {
		
		return loanAmount*getRateOfIntrest()*tenure;
	}

}
