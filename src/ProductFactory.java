

public class ProductFactory {
	public Product getProduct(String ProductType){
	if(ProductType==null)
		return null;
	else if(ProductType.equalsIgnoreCase("APPLE"))
		return new Apple();
	else if(ProductType.equalsIgnoreCase("BANANA"))
		return new Banana();
	else if(ProductType.equalsIgnoreCase("BEEFMEAT"))
		return new BeefMeat();
	else if(ProductType.equalsIgnoreCase("BÝSCUÝT"))
		return new Biscuit();
	else if(ProductType.equalsIgnoreCase("BUTTERMÝLK"))
		return new ButterMilk();
	else if(ProductType.equalsIgnoreCase("CHÝCKEN"))
		return new Chicken();
	else if(ProductType.equalsIgnoreCase("COLA"))
		return new Cola();
	else if(ProductType.equalsIgnoreCase("DETERGENT"))
		return new Detergent();
	else if(ProductType.equalsIgnoreCase("MÝNCEDBEEFMEAT"))
		return new MincedBeefMeat();
	else if(ProductType.equalsIgnoreCase("ORANGE"))
		return new Orange();
	else if(ProductType.equalsIgnoreCase("PEAS"))
		return new Peas();
	else if(ProductType.equalsIgnoreCase("SPÝNACH"))
		return new Spinach();
	else if(ProductType.equalsIgnoreCase("TOMATO"))
		return new Tomato();
	else if(ProductType.equalsIgnoreCase("WATER"))
		return new Water();
	return null;
	}
}
