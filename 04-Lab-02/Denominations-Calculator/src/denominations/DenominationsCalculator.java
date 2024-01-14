package denominations;

import java.util.Scanner;

public class DenominationsCalculator {

	Integer[] denominations;
	Integer paymentAmount;	
	Scanner input;
	
	public DenominationsCalculator() {
		
		input = new Scanner(System.in);
	}
	
	void collectDenominations(){
		
		System.out.println("Denominations : ");
		
		System.out.println("Enter the Size / No of Denominations ");
		
		Integer denominationsSize = input.nextInt();
		
		denominations = new Integer[denominationsSize];
		
		for (int index = 0; index < denominationsSize; index ++) {
			
			
			System.out.printf("Denomination Value : %d / %d", 
					(index + 1), denominationsSize);
			System.out.println();
			
			denominations[index] = input.nextInt();
		}
	}
	
	void collectPaymentAmount() {
				
		System.out.println("Payment Amount : ");
		
		paymentAmount = input.nextInt();		
	}	
}
