package crea.pattern.factory;
/**
 * 
 * @author sku286
 *  factory Class with a static method to create instance of Subclass
 */
public class LoanFactory {
	
	public static LoanAccount getInstance(){
		
		return getLoanAccount(LoanType.PersonalLoan);

		
	}
public static LoanAccount getInstance(LoanType type){
		
		return getLoanAccount(type);

		
	}

	public static LoanAccount getLoanAccount(LoanType type){
		 LoanAccount account=null;
		switch(type)
		{
		case PersonalLoan:
			account =  new PersonalLoan(12);
			break;
		case HousingLoan:
			account = new HousingLoan(13);
			break;
		default:
			account =null;
		}
			return account; 
	  } 

		
}

