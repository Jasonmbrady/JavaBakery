package pos;

public class Tea implements Purchasable{
	private String name;
	private String size;
	private String flavor;
	private double price;
	
	public Tea() {}
	public Tea(String name, String size, String flavor, double price) {
		this.name=name;
		this.size=size;
		this.flavor=flavor;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
