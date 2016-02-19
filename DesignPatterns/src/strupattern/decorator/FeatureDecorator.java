package strupattern.decorator;
/**
 * 
 * @author sku286
 *  Decorator
 */

public abstract class FeatureDecorator extends BankAccount {

	
	private BankAccount account;
	
	public FeatureDecorator(BankAccount account) {
		super();
		this.account = account;
	}

	/*@Override
	public double balanceToMaintain() {
		
		return 0;
	}*/

}
