package strupattern.adapter;

public class Client {
	
	public static void main(String[] args) {
		
		bankAccountAdapter adaptor = new bankAccountAdapter(7000, new LifeInsurance(10000));
		double totalDue=adaptor.findTotalDue();
		System.out.println("total Due:"+totalDue);
	}

}
