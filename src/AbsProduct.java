

public interface AbsProduct {
	
	 public double getStockInformation();

	 public void setStockInformation(double stockInformation);

	 public void display();

	 public void decreaseFromStock(double s);
	 
	 public void calculatePrice(double amount);
	 
	 public double getPrice(double amount);
	 
	 public double getAmount();
	 
	 abstract public void addStock(double d);

}



