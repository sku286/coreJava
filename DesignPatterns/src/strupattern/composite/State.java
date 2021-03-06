package strupattern.composite;

import java.util.ArrayList;
import java.util.List;

public class State  implements Profitable{

	private String stateName;
	private List<Profitable> statestores;
	
	
	public State(String stateName) {
		super();
		this.stateName = stateName;
		statestores = new ArrayList<Profitable>();
	}

	@Override
	public double getProfit() {

		double profit=0;
	     for(Profitable obj:statestores)
	     {
	    	 profit+=obj.getProfit();
	     }
			return profit;
		
	}

	@Override
	public void addLeaf(Profitable child) {

     if(child instanceof City)
    	 statestores.add(child);
		
	}

	@Override
	public void removeLeaf(Profitable child) {
		// TODO Auto-generated method stub
		
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

}
