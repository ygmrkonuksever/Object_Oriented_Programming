


public abstract class AbsShoppingCart {
	
	abstract public void addShoppingCart(Product p1, double a);

	abstract public String displayShoppingCart() throws QueueEmpty;

	abstract public void removeShoppingCart(Product p1) throws QueueEmpty;

	abstract public String calculateShoppingCart();
	
	abstract public double getBill();
}