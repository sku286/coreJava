package strupattern.decorator;

public class SocialNetworkBanking extends BankAccount{

	BankAccount account;
	
   
	public SocialNetworkBanking(BankAccount account) {
		super();
		this.account = account;
	}
	
	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return account.balanceToMaintain()+10000;
	}

}
