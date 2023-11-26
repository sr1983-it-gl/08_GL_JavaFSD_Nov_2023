import java.util.Scanner;

public class IndianBank {
	
	Scanner userInput = new Scanner(System.in);
	BankingCustomer bankingCustomerObj;
	
	public IndianBank() {
		
		BankingUtils bankingUtils = new BankingUtils();
		this.bankingCustomerObj 
			= bankingUtils.getBankingCustomerObject();		
	}
	
	public void displayWelcomePage() {
		
		System.out.println("Welcome to Indian Bank !");
		
	}
	
	public boolean performLogin() {
						
		System.out.println("Enter the bank account number");		
		String userSuppliedBankAccountNo = 
				userInput.nextLine();
		
		
		System.out.println("Enter the passsword");
		String userSuppliedPassword = userInput.nextLine();
		
		
		// Validation should happen
		// [bankAccountNo / password]
		// 1 customer object
		
		
		if (userSuppliedBankAccountNo.equals(bankingCustomerObj.accountNo)
				&& 
				
			userSuppliedPassword.equals(bankingCustomerObj.password)) {
			
			// Validation success
			
			System.out.println("Credentials match. You are now logged in...");
			
			displayBankFunctionalities();
			
			return true;
		}else {
			
			// Validation Failure
			
			System.out.println("Credentials dont match. Check the supplied credentials");
			return false;
		}		
	}
	
	
	void displayBankFunctionalities() {
		
		System.out.println("Bank offers the following functionalities");
		
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Transfer");
		
		System.out.println("----------------------------");
		System.out.println("5. Logout");
		
		System.out.println("What is that you want to do?");
		System.out.println("Enter option - 1 / 2 / 3 / 4 / 5");
		
		int userSelectedOption = userInput.nextInt();
		
		
		switch (userSelectedOption) {
		
			case 1: {
				
				double balanceAmount = bankingCustomerObj.checkBalance();				
				System.out.println(
					bankingCustomerObj.customerName + 
					", your balance amount is " + balanceAmount);				
				break;
			}
			
			case 2: {
				
				bankingCustomerObj.deposit();
				break;
			}
			
			case 3: {
				
				//
				System.out.println("Withdraw Operation");				
				break;
			}
			
			case 4: {
				
				//
				System.out.println("Transfer Operation");				
				break;
			}
			
			case 5: {
				
				//
				System.out.println("Logout Operation");
				
				break;
			}
			
			default : {
				
				System.out.println("Invalid option selected");
				System.out.println("Valid selections are 1/2/3/4/5");
			}
			
		}		
	}
}
