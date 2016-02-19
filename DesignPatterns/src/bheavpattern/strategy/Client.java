package bheavpattern.strategy;

public class Client {
	public static void main(String[] args) {
		
	
	BillPayment bill =new BillPayment();
	
	bill.setPty(new CardPayment());
	System.out.println("Card Payment:"+bill.makePayment(5000, "Card "));
	
	bill.setPty(new CashPayment());
	System.out.println("Card Payment:"+bill.makePayment(5000, "Cash "));
	
	}

}
