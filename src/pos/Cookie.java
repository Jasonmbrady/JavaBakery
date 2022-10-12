package pos;

public class Cookie extends BakedGood implements Purchasable{
	private boolean isLarge;
	
	public Cookie(String name, String description, double price, boolean isLarge) {
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
		this.isLarge = isLarge;
	}

//	public Purchasable getThis() {
//		return this;
//	}
	
	public boolean isLarge() {
		return isLarge;
	}

	public void setLarge(boolean isLarge) {
		this.isLarge = isLarge;
	}
	
	
}
