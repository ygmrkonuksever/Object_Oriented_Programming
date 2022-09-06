
public class ButterMilk extends Product {

	private static String productName = "Buttermilk";
	private static int unitPrice = 3;
	private static double stockInformation = 15;

	public ButterMilk() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " lt\t " + "Unit price is:"
				+ this.unitPrice + "/lt" );
	}

}
