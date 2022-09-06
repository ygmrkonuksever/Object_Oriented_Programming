


public class Chicken extends Product {

	private static String productName = "Whole Chicken(1,5 kg)";
	private static int unitPrice = 25;
	private static double stockInformation = 10;

	public Chicken() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " grain\t " + "Unit price is:"
				+ this.unitPrice + "/grain" );
	}
	
	@Override
	public void decreaseFromStock(double d) {
		if(d%(int)d!=0.0) {
			System.out.println("Invalid Purchase.");
		}
		else {
		stockInformation =  this.getStockInformation() - d;
		if(stockInformation<0) {
			System.out.println("Not Enough stock. Invalid purchase.");
			stockInformation = (int) (this.getStockInformation() + d);
		}
		}

	}
	@Override
	public double getStockInformation() {
		return stockInformation;
	}

}

