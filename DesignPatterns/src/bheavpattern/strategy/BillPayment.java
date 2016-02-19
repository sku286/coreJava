package bheavpattern.strategy;

public class BillPayment implements PaymentStrategy{

	PaymentStrategy pty;
	public BillPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PaymentStrategy getPty() {
		return pty;
	}


	public void setPty(PaymentStrategy pty) {
		this.pty = pty;
	}


	public BillPayment(PaymentStrategy pty) {
		super();
		this.pty = pty;
	}

	
	public String makePayment(double amount,String description)
	{
		return pty.pay(amount, description);
	}


	@Override
	public String pay(double amt, String description) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
