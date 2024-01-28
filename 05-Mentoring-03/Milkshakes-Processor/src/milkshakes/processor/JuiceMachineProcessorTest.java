package milkshakes.processor;

public class JuiceMachineProcessorTest {

	public static void main(String[] args) {
		
		// Test 1
		
		Order[] ordersTest1Data = new Order[] {
			
				new Order("Mango", 5),
				new Order("Orange", 4),
				new Order("Pineapple", 4),
				
		};
		
		
		
		// Test 2
		
		Order[] ordersTest2Data = new Order[] {
			
				new Order("Mango", 1),
				new Order("Orange", 4),
				new Order("Pineapple", 2),
				
		};		
		JuiceMachineProcessor processor 
			= new JuiceMachineProcessor(ordersTest2Data);
		
		processor.process();
		
		Result result = processor.getResult();
		System.out.println(result);
		
	}
}
