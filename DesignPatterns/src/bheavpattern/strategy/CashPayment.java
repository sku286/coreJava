package bheavpattern.strategy;

public class CashPayment implements PaymentStrategy {

	@Override
	public String pay(double amt, String description) {
		
		
		String msg ="Your Payment of Inr."+ amt +" By Cash"+description+"Received";
        StringBuffer buffer = new StringBuffer();
		
		double discount=10;
		double total = amt-discount;
		
		buffer.append("Discount of rs."+discount+" Is given");
		buffer.append("Net Total=Rs."+total);
		
		return buffer.toString();
		
	}
	

}
