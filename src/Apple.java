

public class Apple extends Product {

	private static String productName = "Apple";
	private static int unitPrice = 8;
	private static double stockInformation = 5;

	public Apple() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " kg\t " + "Unit price is:"
				+ this.unitPrice + "/kg" );
	}

}

