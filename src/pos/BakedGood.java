package pos;

public abstract class BakedGood {
	private String name;
	private String description;
	private double price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void bake() {
		System.out.println(String.format("%s is baking!", name));
	}
	
}
