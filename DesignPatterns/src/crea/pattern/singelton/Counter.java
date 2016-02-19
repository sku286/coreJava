package crea.pattern.singelton;

public class Counter {
	
	private static Counter count;
	
	private int val=100;
	
	public int getVal() {
		return val++;
	}
	public void setVal(int val) {
		this.val = val;
	}
	private Counter(){
		
	}
     public synchronized static Counter getInstance(){
    	 if(count==null)
    		 count=new Counter();
		return count;
    	 
     }
}
