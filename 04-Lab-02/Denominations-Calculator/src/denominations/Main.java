package denominations;

public class Main {

	public static void main(String[] args) {
		
		DenominationsCalculator calculator
			= new DenominationsCalculator();
		
//		calculator.collectDenominations();
//		calculator.collectPaymentAmount();

		// Example-02
//		calculator.denominations = 
//			new Integer[]{60, 5, 12, 78, 25};
//		calculator.paymentAmount = 128;

		
		// Example-03
//		calculator.denominations = 
//			new Integer[]{12, 5, 123, 18};
//		calculator.paymentAmount = 158;

		
		// Example-05
		calculator.denominations = 
			new Integer[]{12, 5, 123, 18};
		calculator.paymentAmount = 160;
		
		calculator.calculate();
	}
}
