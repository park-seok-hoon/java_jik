package Product;

public class Aircon extends Product{
	int area;

	public Aircon(String brand, String code, String name, int area) {
		super(brand, code, name);
		this.area = area;
	}
	
	public void print()
	{
		System.out.println("브랜드 : "+brand);
		System.out.println("제품코드 : "+code);
		System.out.println("제품명 : "+name);
		System.out.println("냉방면적(m2) : "+area);
		
	}

}
