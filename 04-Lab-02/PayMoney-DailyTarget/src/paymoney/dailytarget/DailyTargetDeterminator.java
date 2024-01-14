package paymoney.dailytarget;

import java.util.Arrays;
import java.util.Scanner;

public class DailyTargetDeterminator {

//	int a;
	
	// 20, 30, 50, 80
	Integer[] transactionsList;
//	int[] transactionsList;
	
	// 125
	Integer[] dailyTargets;
	
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
		
//		dailyTarget = input.nextInt();
		
		// Update the input to 'dailyTarget'
	}

	void collectDailyTargets() {
		
		
		System.out.println("Daily Targets");
		
		System.out.println("Enter the Total No Of Daily Targets that need to be verified");
		Integer totalNoOfDailyTargets = input.nextInt();		
		
		this.dailyTargets = new Integer[totalNoOfDailyTargets];
		
		for (int index = 0; index < totalNoOfDailyTargets; index ++) {
			
			System.out.printf("Daily Target : %d / %d",
					(index + 1), totalNoOfDailyTargets);
			System.out.println();
			
			this.dailyTargets[index] = input.nextInt();			
		}		
	}
	
	
	void determine() {
		
		for (int index = 0; index < dailyTargets.length; index ++) {
			
			System.out.println("----------------------------------------");
			
			Integer dailyTarget = dailyTargets[index];			
			
			System.out.printf("Performing Check for the TransactionsList %s and for the Daily Target %d",
				Arrays.toString(transactionsList), dailyTarget);
			System.out.println();
			
			determine(dailyTarget);			
		}
	}
	
	void determine(Integer dailyTarget) {						
		
		boolean dailyTargetAchieved = false;
		Integer overallSumOfTransactionValues = 0;
		int transactionInstancesCounter = 0;
		
		for (int index = 0; index < transactionsList.length; index ++) {
			
			
			transactionInstancesCounter ++;
			
			Integer trasactionValue = transactionsList[index];
			
			overallSumOfTransactionValues =
					overallSumOfTransactionValues + trasactionValue;
			
			if (overallSumOfTransactionValues >= dailyTarget) {
				
				dailyTargetAchieved = true;
				break;
			}
		}
		
		if (dailyTargetAchieved) {
			System.out.println("Daily Target is achieved");
			System.out.printf("Achieved after %d Instances",
				transactionInstancesCounter);
			System.out.println();
			
		}else {
			System.out.println("Daily Target NOT achieved");
		}
		
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
