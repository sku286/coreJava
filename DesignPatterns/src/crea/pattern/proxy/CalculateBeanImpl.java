package crea.pattern.proxy;

public class CalculateBeanImpl implements CalculateBean {

	@Override
	public int request(int pri) {
		 
		return pri*2;
		
	}

	
}
