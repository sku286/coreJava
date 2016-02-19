package strupattern.decorator;
/**
 * 
 * @author sku286
 *
 */
public class SavingsAccount extends BankAccount {

	@Override
	public double balanceToMaintain() {
		
		return 1000.10;
	}

}
