package Product;

public class Notebook extends Product {
	double cpu;
	int ram;
	
	public Notebook(String brand, String code, String name, double cpu, int ram) {
		super(brand, code, name);
		this.cpu = cpu;
		this.ram = ram;
	}
	
	
	public void print()
	{
		System.out.println("브랜드 : "+brand);
		System.out.println("제품코드 : "+code);
		System.out.println("제품명 : "+name);
		System.out.println("cpu : "+cpu);
		System.out.println("ram : "+ram);
		
	}
	

}
	

	
