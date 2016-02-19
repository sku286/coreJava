package crea.pattern.factory;

public class Client {
	public static void main(String[] args) {
		
		LoanAccount loan1 = LoanFactory.getInstance();
		System.out.println("personal Loan EMI="+ loan1.calculateEmi(200000, 3));
		System.out.println("Rate of intrest="+loan1.getRateOfIntrest());
		
		
		LoanAccount loan2 = LoanFactory.getInstance(LoanType.HousingLoan);
		System.out.println("Housing loan Emi="+loan2.calculateEmi(500000, 5));
		System.out.println("rate of intrest="+loan2.getRateOfIntrest());
	}

}
