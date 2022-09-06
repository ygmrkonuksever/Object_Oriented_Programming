

public class MincedBeefMeat extends Product {

	private static String productName = "Minced Beef Meat";
	private static int unitPrice = 58;
	private static double stockInformation = 20;

	public MincedBeefMeat() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " kg\t " + "Unit price is:"
				+ this.unitPrice + "/kg" );
	}

}
