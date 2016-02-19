package strupattern.decorator;

public class Client {
	public static void main(String[] args) {
		
		BankAccount acc2 =new SavingsAccount() ;
		System.out.println("Saving Account minimum balance="+acc2.balanceToMaintain());
			
	    BankAccount acc= new OnlineBanking(new SavingsAccount());
	    System.out.println("Online Account minimum balance="+acc.balanceToMaintain());
	
	    BankAccount acc1=new SocialNetworkBanking(new OnlineBanking(new SavingsAccount()));
	    System.out.println("SocialNetwork Account minimum balance="+acc1.balanceToMaintain());
	
	}

}
