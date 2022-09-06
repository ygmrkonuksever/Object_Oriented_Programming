

public class Detergent extends Product {

	private static String productName = "Detergent";
	private static int unitPrice = 5;
	private static double stockInformation = 7;

	public Detergent() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " kg\t " + "Unit price is:"
				+ this.unitPrice + "/kg" );
	}

}
