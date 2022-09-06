

public class BeefMeat extends Product {

	private static String productName = "Beef Meat";
	private static int unitPrice = 60;
	private static double stockInformation = 20;

	public BeefMeat() {
		super(productName, unitPrice, stockInformation);
	}
	
	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " kg\t " + "Unit price is:"
				+ this.unitPrice + "/kg" );
	}

}