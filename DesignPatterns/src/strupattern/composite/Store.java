package strupattern.composite;



public class Store  implements Profitable{
	
	private double profit;
	private String storeName;
	
	//private List<Profitable> profitlist;
	

	public Store(double profit, String storeName) {
		
		this.profit = profit;
		this.storeName = storeName;
		
	}




	@Override
	public double getProfit() {
		
		return this.profit;
	}

	@Override
	public void addLeaf(Profitable child) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub
		
	}

}
