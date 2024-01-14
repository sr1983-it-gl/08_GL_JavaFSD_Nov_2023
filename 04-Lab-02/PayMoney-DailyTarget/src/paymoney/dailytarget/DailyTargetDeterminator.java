package paymoney.dailytarget;

import java.util.Scanner;

public class DailyTargetDeterminator {

//	int a;
	
	// 20, 30, 50, 80
	Integer[] transactionsList;
//	int[] transactionsList;
	
	// 125
	Integer dailyTarget;
	
	Scanner input;
	
	public DailyTargetDeterminator() {
		
		input = new Scanner(System.in);
	}
	
	void collectTransactionValues(){
		
		System.out.println("Transactions List: ");
		
		System.out.println("Enter the Transactions-List Size");
		
		Integer transactionsListSize = input.nextInt();
		
		transactionsList = new Integer[transactionsListSize];
		
		for (int index = 0; index < transactionsListSize; index ++) {
			
			
			System.out.printf("Transaction Value : %d / %d", 
					(index + 1), transactionsListSize);
			System.out.println();
			
			transactionsList[index] = input.nextInt();
		}
		// Get scanner to get input
		
		// Size of transaction array [4]
		
		// Size - for loop 
		
			// Every value - update in trasactionsList
	}
	
	void collectDailyTarget() {
		
		// Use Scanner to collect the input
		
		System.out.println("Daily Target : ");
		
		dailyTarget = input.nextInt();
		
		// Update the input to 'dailyTarget'
	}
	
	
	void determine() {		
		
		/* overallTransactionSum
		 * int counter = 0;
		 * for (... )
		 * 		
		 * 		counter ++
		 * 		Retreive transactionnValue 
		 * 		
		 * 		overallTransactionSum = overallTransactionSum +
		 * 		transactionnValue
		 * 
		 * 		overallTransactionSum >= DailyTarget
		 * 			break;
		 * 		
		 * 		outcome -> true
		 * 			Success
		 * 			-> false
		 * 			Not achieved
		 *		
		 * 		
		 */
	}
}
