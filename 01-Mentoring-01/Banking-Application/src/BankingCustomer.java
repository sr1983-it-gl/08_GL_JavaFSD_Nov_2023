import java.util.Scanner;

public class BankingCustomer {

	String customerName;
	String accountNo;
	String password;
	double balance;
	
	
	public BankingCustomer(String customerName, String accountNo, String password) {
		
		this.customerName = customerName;
		this.accountNo = accountNo;
		this.password = password;		
		balance = 5000;		
	}
	
	public double checkBalance() {
		
		System.out.println("Checking the balance details....");
		
		return balance;
	}	
	
	public void deposit() {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the amount you want to deposit");
		double userEnteredDepositAmount = userInput.nextDouble();
		
		if (userEnteredDepositAmount > 0) {
			
			
			balance = balance + userEnteredDepositAmount;
			System.out.println("Deposit operation is successful");
			System.out.println("Updated account balance is " + balance);
			
		}else {
						
			System.out.println("Deposit amount cannot be negative " 
					+ userEnteredDepositAmount);
			System.out.println("Deposit operation - CANCELLED");
		}		
	}
}
