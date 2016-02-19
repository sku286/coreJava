package crea.pattern.proxy;

public class Client {
	
	public int callProxy(CalculateBean sub)
	{
		return sub.request(50);
	}


	public static void main(String[] args) {
		
		CalculateBeanProxy pxy = new CalculateBeanProxy();
		Client  c1 = new Client();
		System.out.println(c1.callProxy(pxy));
	}
}
