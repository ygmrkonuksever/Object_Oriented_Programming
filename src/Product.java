
import javax.swing.JOptionPane;

public class Product implements AbsProduct {

	private String productName;
	private int unitPrice;
	private double stockInformation;
	private double price=0.0;
	private double productAmount=0.0;

	public Product(String productName, int unitPrice, double stockInformation) {

		this.productName = productName;
		this.unitPrice = unitPrice;
		this.stockInformation = stockInformation;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getunitPrice() {
		return unitPrice;
	}

	public void setunitPrice(int price) {
		this.unitPrice = price;
	}

	public double getStockInformation() {
		return stockInformation;
	}

	public void setStockInformation(double stockInformation2) {
		this.stockInformation = stockInformation2;
	}

	public void display() {

		System.out.println( this.productName + "/t" + "Stock is: " + this.getStockInformation() + "/t " + "Unit price is:" + this.unitPrice);

	}

	public void decreaseFromStock(double d) {
		stockInformation = this.getStockInformation() - d;
		
		if(stockInformation<0) {
			
			String message = "Not Enough stock. Invalid purchase.";
			JOptionPane.showMessageDialog(null, message);
			stockInformation = this.getStockInformation() + d;
		}

	}
	
	public void calculatePrice(double amount) {
		price=unitPrice*amount;
		productAmount=amount;
	}
	
	public double getPrice(double amount) {
		calculatePrice(amount);
		return price;
	}
	
	public double getAmount() {
		return productAmount;
	}

	public void addStock(double d) {
		stockInformation = this.getStockInformation() + d;
	}



	
}
