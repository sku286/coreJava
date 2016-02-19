package crea.pattern.singelton;

public class Client {
	
	public static void main(String[] args) {
		
		Counter coun1 = Counter.getInstance();
		System.out.println(coun1.hashCode());
		System.out.println(coun1.getVal());
		
		Counter coun2 = Counter.getInstance();
		System.out.println(coun2.hashCode());
		System.out.println(coun2.getVal());
		
		Counter coun3 = Counter.getInstance();
		System.out.println(coun3.hashCode());
		System.out.println(coun3.getVal());
	}

}
