package crea.pattern.protype;

public class Employee implements Cloneable {

	private int employeeId;
	private String employeename;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int employeeId, String employeename) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
	}



	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeename=" + employeename + "]";
	}

	


	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeename() {
		return employeename;
	}



	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	
}
