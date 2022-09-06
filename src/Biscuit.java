


public class Biscuit extends Product {

	private static String productName = "Biscuit";
	private static int unitPrice = 2;
	private static double stockInformation = 10;

	public Biscuit() {
		super(productName, unitPrice, stockInformation);
	}

	@Override
	public void display() {
		System.out.println(this.productName + " \t" + "Stock is: " + this.stockInformation + " packet\t " + "Unit price is:"
				+ this.unitPrice );
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
