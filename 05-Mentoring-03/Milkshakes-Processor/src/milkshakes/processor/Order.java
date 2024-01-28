package milkshakes.processor;

public class Order {

	private String milkshakeType;
	private int quantity;
	
	public Order(String milkshakeType, int quantity) {
		
		this.milkshakeType = milkshakeType;
		this.quantity = quantity;
	}
	
	public String getMilkshakeType() {
		return milkshakeType;
	}
	public void setMilkshakeType(String milkshakeType) {
		this.milkshakeType = milkshakeType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void decrementQuantity(int quantityValue) {
		
		this.quantity = this.quantity - quantityValue;
	}
	
	public String toString() {
		
		return String.format("[%s, %d]", milkshakeType, quantity);
	}
}
