package ecommerce_example;

public interface IECommerceService {

	void purchaseProduct(String name, int quantity);
	
	void cancelOrder(int orderId);
	
	void makePayment(int orderId);
	
}
