package crea.pattern.proxy;

public class CalculateBeanProxy implements CalculateBean {
	
	private CalculateBean real;

@Override
public int request(int pri) {
	real = new CalculateBeanImpl();
	//real.request();
	return real.request(pri);
}


}
