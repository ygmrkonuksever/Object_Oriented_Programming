

public class Peas extends Product {

	private static String productName="Peas";
	private static  int unitPrice=7;
	private static double stockInformation=1;
	public Peas() {
		super(productName, unitPrice, stockInformation);
	}
	
	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " kg\t " + "Unit price is:"
				+ this.unitPrice + "/kg" );
	}



}