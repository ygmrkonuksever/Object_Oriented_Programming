

public class Orange extends Product {

	private static String productName = "Orange";
	private static int unitPrice = 7;
	private static double stockInformation = 7;

	public Orange() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " kg\t " + "Unit price is:"
				+ this.unitPrice + "/kg" );
	}

}
