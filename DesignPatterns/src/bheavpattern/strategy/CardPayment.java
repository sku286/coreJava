package bheavpattern.strategy;

public class CardPayment implements PaymentStrategy{

	@Override
	public String pay(double amt, String description) {


		String msg ="Your Payment of Inr."+ amt +" By Card"+description+"Received";
		StringBuffer buffer = new StringBuffer();
		
		double processFee=amt*0.012;
		double total = amt+processFee;
		
		buffer.append("Processing fee of rs."+processFee+" Is chargebale");
		buffer.append("Net Total=Rs."+total);
		
		return buffer.toString();
	}

}
