


public class ShoppingCart extends AbsShoppingCart {
	
	private static ShoppingCart instance= new ShoppingCart();
	
	private ShoppingCart() {}
	
	public static ShoppingCart getInstance() {
		return instance;
	}
	
	Queue shoppingCart = new Queue();
	Queue shoppingCartcopy = new Queue();
	Queue productnames = new Queue();
	Queue productnamescopy = new Queue();
	Queue productamounts=new Queue();
	Queue productamountscopy=new Queue();
	Queue productprices=new Queue();
	Queue productpricescopy=new Queue();
	double bill = 0;

	public Queue getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(Queue shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public void addShoppingCart(Product p1, double a) {

		if (p1.getProductName() == "Whole Chicken(1,5 kg)" || p1.getProductName() == "Biscuit")
			shoppingCart.enqueue(p1.getProductName() + " \t" + a + " packet\t" + p1.getPrice(a) + " tl");
		else if (p1.getProductName() == "Buttermilk" || p1.getProductName() == "Cola" || p1.getProductName() == "Water")
			shoppingCart.enqueue(p1.getProductName() + " \t" + a + "lt\t" + p1.getPrice(a) + " tl");
		else
			shoppingCart.enqueue(p1.getProductName() + " \t" + a + "kg\t" + p1.getPrice(a) + " tl");
		productprices.enqueue(p1.getPrice(a));
		productamounts.enqueue(a);
		bill += p1.getPrice(a);
		productnames.enqueue(p1.getProductName());
	}

	public String displayShoppingCart() throws QueueEmpty {		
		
		//System.out.println(shoppingCart.toString());
		String list;
		list = " ";
		list = shoppingCart.toString();
		return list;
	}

	public void removeShoppingCart(Product p1) throws QueueEmpty {

		while (!shoppingCart.isEmpty()) {
			if (productnames.peek().toString().toLowerCase().equals(p1.getProductName().toLowerCase())) {
				
				shoppingCart.dequeue();
				productnames.dequeue();
				bill-=Double.parseDouble(productprices.dequeue().toString());
				p1.addStock(Double.parseDouble(productamounts.dequeue().toString()));
			}
			if (!shoppingCart.isEmpty()) {
				shoppingCartcopy.enqueue(shoppingCart.dequeue());
				productnamescopy.enqueue(productnames.dequeue());
				productamountscopy.enqueue(productamounts.dequeue());
				productpricescopy.enqueue(productprices.dequeue());
				
			}
		}

		while (!shoppingCartcopy.isEmpty()) {
			shoppingCart.enqueue(shoppingCartcopy.dequeue());
			productnames.enqueue(productnamescopy.dequeue());
			productamounts.enqueue(productamountscopy.dequeue());
			productprices.enqueue(productpricescopy.dequeue());
		}

	}

	public String calculateShoppingCart() {

		return bill + "tl";
	}

	public double getBill() {
		return bill;
	}
	

}
