

public class Banana extends Product {

	private static String productName = "Banana";
	private static int unitPrice = 14;
	private static double stockInformation = 3;

	public Banana() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " kg\t " + "Unit price is:"
				+ this.unitPrice + "/kg" );
	}

}
