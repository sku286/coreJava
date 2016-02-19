package strupattern.adapter;
/**
 * 
 * @author sku286
 *  Adapter
 */
public class bankAccountAdapter extends BankAccount {
	
	private LifeInsurance insurance;

	public bankAccountAdapter(double principle, LifeInsurance insurance) {
		super(principle);
		this.insurance = insurance;
	}

	public double findTotalDue(){
		
		double isDue=insurance.calculatePremium();
		double bankDue=calculate();
		double totalDue=isDue+bankDue;
		return totalDue;
	}
	

}
