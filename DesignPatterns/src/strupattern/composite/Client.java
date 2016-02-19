package strupattern.composite;

public class Client {
	
	public static void main(String[] args) {
		
		Store obj1 = new Store(1000, "A");
		Store obj2 = new Store(5000, "B");
		Store obj3 = new Store(10000, "C");
		
		City delhi = new City("Delhi");
		delhi.addLeaf(obj1);
		delhi.addLeaf(obj2);
		delhi.addLeaf(obj3);
		System.out.println("Total Collection of "+delhi.getCityName()+"="+delhi.getProfit());
		
		Store obj11 = new Store(4000, "A");
		Store obj12 = new Store(5000, "B");
		Store obj13 = new Store(10000, "C");
		
		City up = new City("NCR");
		up.addLeaf(obj11);
		up.addLeaf(obj12);
		up.addLeaf(obj13);
		System.out.println("Total Collection of "+up.getCityName()+"=:"+up.getProfit());
		System.out.println("================================");
		
		State central = new State("Central");
		central.addLeaf(delhi);
		central.addLeaf(up);
		System.out.println("Total Collection of  "+central.getStateName()+"="+central.getProfit());
	}

}
