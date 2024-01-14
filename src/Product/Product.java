package Product;

public abstract class Product {
	String brand;
	String code;
	String name;
	
	public Product(String brand,String code,String name)
	{
			this.brand=brand;
			this.code=code;
			this.name=name;
		
	}
	
	public abstract void print();
}
