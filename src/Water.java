

public class Water extends Product {

	private static String productName = "Water";
	private static int unitPrice = 1;
	private static int stockInformation = 20;

	public Water() {
		super(productName, unitPrice, stockInformation);
	}
	
	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " lt\t " + "Unit price is:"
				+ this.unitPrice + "/lt" );
	}

}