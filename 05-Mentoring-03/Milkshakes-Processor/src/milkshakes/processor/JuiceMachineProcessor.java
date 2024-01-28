package milkshakes.processor;

import java.util.PriorityQueue;
import java.util.Queue;

public class JuiceMachineProcessor {

	private Order[] orders;
	Queue<Order> ordersPriorityQueue;	
	Result result;
	
	public JuiceMachineProcessor(Order[] orders) {
		
		this.orders = orders;
		
		this.result = new Result();
	}
	
	public void process() {
		
		addOrdersToPriorityQueue();
		
		boolean exitCondition = false;
		
		while (!ordersPriorityQueue.isEmpty()) {
			
			Order order1 = ordersPriorityQueue.poll();
			Order order2 = ordersPriorityQueue.poll();
			
			int quantity1 = order1.getQuantity();
			int quantity2 = order2.getQuantity();
			
			System.out.printf("Quantity 1 : %d, Quantity 2 : %d",
				quantity1, quantity2);
			System.out.println();
			
			if (quantity1 > 0 && quantity2 > 0) {
				
				// Two Orders can be processed in 1 second
				
				System.out.println("Two Orders Process");
				
				result.incrementTime(1);
			
				order1.decrementQuantity(1);
				order2.decrementQuantity(1);
			}else {
				
				// Process Single Order
				
				if (order1.getQuantity() > 0) {
					
					if (order2.getQuantity() == 0) {

						// Order1					
						
						result.incrementTime(
							order1.getQuantity());	
						exitCondition = true;
					}
					
				}else if (order2.getQuantity() > 0) {
					
					if (order1.getQuantity() == 0) {

						// Order2	
						result.incrementTime(
								order2.getQuantity());
						exitCondition = true;
						
					}
					
				}
			}			
			
			
			if (quantity1 == 0 && quantity2 == 0) {
				
				exitCondition = true;
			}else {
				
				ordersPriorityQueue.add(order1);
				ordersPriorityQueue.add(order2);				
			}
			
			if (exitCondition) {
				break;
			}
			
		}
	}
	
	
	void addOrdersToPriorityQueue() {
				
		OrderBasedOnHighestQuantityComparator 
			comparator = new OrderBasedOnHighestQuantityComparator();
	
		ordersPriorityQueue = new PriorityQueue<Order>(comparator);		
	
		for (Order anOrder : orders) {
			
			ordersPriorityQueue.add(anOrder);
		}
	}
	
	public Result getResult() {
		
		return result;
	}
}
