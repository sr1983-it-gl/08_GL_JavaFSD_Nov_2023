package denominations;

import java.util.Arrays;
import java.util.Collections;
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
	
	
	public void calculate() {
		
		// Sorting
//		Collections.sort(null, null);
		
		// Loop - while
		
			// 0 -> AllDenominations
			
			// noOfDenominations -> [
		
			// if (noOfDenominations != 0} {
				
			/// Valid Denomination
				
			// Pending / BalanceAmount
		
			// Pending / BalanceAmount == 0
				// break
		
//		Collections.sor
		Arrays.sort(denominations, Collections.reverseOrder());
		
		System.out.println("After sorting...");
		System.out.println(Arrays.toString(denominations));
	}
}
