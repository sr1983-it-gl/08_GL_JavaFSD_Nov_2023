
public class BankingUtils {

//	BankingCustomer[] getAllBankingCustomerObjects() {
//
//		BankingCustomer[] bankingCustomers 
//			= new BankingCustomer[5];
//
//		BankingCustomer john 
//			= new BankingCustomer("135792461", "john_123");
//
//		BankingCustomer monisha 
//			= new BankingCustomer("135792462", "monisha_123");
//
//		BankingCustomer shankar 
//			= new BankingCustomer("135792463", "shankar_123");
//
//		BankingCustomer sweta 
//			= new BankingCustomer("135792464", "sweta_123");
//
//		BankingCustomer navin 
//			= new BankingCustomer("135792465", "navin_123");
//	}

	public BankingCustomer getBankingCustomerObject(){
		
		BankingCustomer john 
			= new BankingCustomer("John", "123456789", "john_123");

		return john;
	}
	
}
