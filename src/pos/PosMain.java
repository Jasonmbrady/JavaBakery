package pos;

public class PosMain {

	public static void main(String[] args) {
		Coffee smCoffee = new Coffee("Small Coffee", "Small", 1.99);
		Cookie chocChip = new Cookie("Chocolate Chiop Cookie", "Buttery cookie dough with semi-sweet and milk chocolate chips", 2.99, false);
		Muffin pumpkinMuffin = new Muffin("Pumpkin Muffin", "A soft pumpkin muffin with cream cheese frosting", 4.99, true);
		Customer jason = new Customer("Jason");
		Tea smLipton = new Tea("Lipton Tea", "Small", "Black Tea", 1.99);
		jason.addToCart(pumpkinMuffin);
		jason.addToCart(chocChip);
		jason.addToCart(smCoffee);
		checkOut(jason);
		
		Customer peter = new Customer("Peter");
		peter.addToCart(smLipton);
		peter.addToCart(pumpkinMuffin);
		checkOut(peter);
		
		
	}
	
	private static double checkOut(Customer c) {
		// create variable to hold total
		double totalPrice = 0.0;
		// loop through cart. display name and price of each item
		for(Purchasable item : c.getCart()) {
			System.out.println(item.getName() + ": $" + item.getPrice());
			totalPrice += item.getPrice();
		}
		System.out.println("Total: $" + totalPrice);
		// return total price
		return totalPrice;
	}

}
