public class Spinach extends Product {

	private static String productName="Spinach";
	private static  int unitPrice=5;
	private static double stockInformation=0;
	public Spinach() {
		super(productName, unitPrice, stockInformation);
	}
	
	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " kg\t " + "Unit price is:"
				+ this.unitPrice + "/kg" );
	}
}
