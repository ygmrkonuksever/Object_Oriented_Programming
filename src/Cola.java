

public class Cola extends Product {

	private static String productName = "Cola";
	private static int unitPrice = 4;
	private static double stockInformation = 10;

	public Cola() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " lt\t " + "Unit price is:"
				+ this.unitPrice + "/lt" );
	}

}
