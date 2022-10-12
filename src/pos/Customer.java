package pos;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Purchasable> cart = new ArrayList<Purchasable>();
	
	public Customer() {}
	public Customer(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Purchasable> getCart() {
		return cart;
	}
	public void addToCart(Purchasable item) {
		this.cart.add(item);
	}
	
}
