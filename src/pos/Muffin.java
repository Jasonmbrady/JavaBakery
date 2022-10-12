package pos;

public class Muffin extends BakedGood implements Purchasable{
	private boolean hasFrosting;
	
	public Muffin(String name, String description, double price, boolean hasFrosting) {
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
		this.hasFrosting = hasFrosting;
	}

//	public Purchasable getThis() {
//		return this;
//	}
	public boolean isHasFrosting() {
		return hasFrosting;
	}

	public void setHasFrosting(boolean hasFrosting) {
		this.hasFrosting = hasFrosting;
	}
	
}
