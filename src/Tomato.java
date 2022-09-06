

public class Tomato extends Product {

	private static String productName = "Tomato";
	private static int unitPrice = 7;
	private static double stockInformation = 8;

	public Tomato() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " kg\t " + "Unit price is:"
				+ this.unitPrice + "/kg" );
	}

}
