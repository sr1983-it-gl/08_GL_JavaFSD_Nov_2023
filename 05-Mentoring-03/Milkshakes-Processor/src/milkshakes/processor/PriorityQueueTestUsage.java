package milkshakes.processor;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTestUsage {

	public static void main(String[] args) {
		
		OrderBasedOnHighestQuantityComparator 
			comparator = new OrderBasedOnHighestQuantityComparator();
		
		Queue<Order> queue = new PriorityQueue<Order>(comparator);
		
		queue.add(new Order("Mango", 1));
		queue.add(new Order("Orange", 4));
		queue.add(new Order("Pineapple", 10));
		queue.add(new Order("Pineapple", 8));
		queue.add(new Order("Pineapple", 3));
		
		while (!queue.isEmpty()) {

			Order order = queue.poll();
			System.out.println(order);			
		}
		
	}
}
