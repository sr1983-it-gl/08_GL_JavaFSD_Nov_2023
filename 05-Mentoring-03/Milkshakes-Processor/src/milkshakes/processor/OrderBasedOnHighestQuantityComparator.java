package milkshakes.processor;

import java.util.Comparator;

public class OrderBasedOnHighestQuantityComparator 
	implements Comparator<Order>{

	@Override
	public int compare(Order o1, Order o2) {
		
		// Descending Order
		
		if (o1.getQuantity() < o2.getQuantity()) {
			return +1;
		}else if (o1.getQuantity() > o2.getQuantity()) {
			return -1;
		}else {
			return 0;
		}
	}

}
