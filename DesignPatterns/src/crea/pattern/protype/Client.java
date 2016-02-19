package crea.pattern.protype;

public class Client {

	public static void main(String[] args) {
		
		Employee org = new Employee(123,"ayush");
		Employee protoType=null;
		System.out.println("Original"+org);
	
		try {
			protoType = (Employee)org.clone();
			protoType.setEmployeename("MR."+org.getEmployeename());
		} 
		catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		System.out.println("original="+org);
		System.out.println("prototype="+protoType);

	}

}
