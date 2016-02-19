package bheavpattern.observer;

public class Client {
public static void main(String[] args) {
	

	MealOrder order = new MealOrder();
	order.addObserver(new Waiter());
	order.setStatus("Accepted");
	
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	order.setStatus("Completed");
	
}

}