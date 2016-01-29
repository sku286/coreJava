package com.training;

public class LifeInsurance {
	private long policyNumber;
	private String policeHolderNmae;
	private String paymentMode;
	private double policyAmount;
	
	
	//static Block
	static{
		System.out.println("STATIC Block Called");
	}
	//Initilization Block
	{
		System.out.println("Initialization Block Called");
		}
	public LifeInsurance() {
		super();
		System.out.println("Constructor Called");
		// TODO Auto-generated constructor stub
	}
	
	public LifeInsurance(long policyNumber, String policeHolderNmae, String paymentMode, double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policeHolderNmae = policeHolderNmae;
		this.paymentMode = paymentMode;
		this.policyAmount = policyAmount;
	}

	public long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPoliceHolderNmae() {
		return policeHolderNmae;
	}
	public void setPoliceHolderNmae(String policeHolderNmae) {
		this.policeHolderNmae = policeHolderNmae;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}
	public double calculate()
	{
	  return this.policyAmount *.10;	
	}
	
	//public int calculate();
	
	//overload method
	public double calculate(double policyAmt)
	{
	  double amount=policyAmt*.10;
	  double discount=amount*.05;
	  double netAmount=amount-discount;
	  return netAmount;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getPolicyNumber()+":"+this.policeHolderNmae;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		long code= this.policyNumber + 7*policyNumber;
		return (int)code;
	}

	@Override
	public boolean equals(Object obj) {
		//checking for identity
		if(this==obj) return true;
		//Cautious
		if(obj==null) return false;
		//checking the type of object
	    if(this.getClass()!=obj.getClass()) return false;
	    //casting
	    LifeInsurance ins = (LifeInsurance)obj;
	    return policyNumber==ins.policyNumber && policeHolderNmae.equals(ins.policeHolderNmae);
	}
}
