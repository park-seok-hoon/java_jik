package Product;

import java.util.Scanner;

public class product_main {
	public static Scanner sc=new Scanner(System.in);
	public static Product [] list = new Product[30];
	public static int count=0;
	public static void main(String args[])
	{
		int menu=0;
		
		
		do{
			
			menuboard();
			menu=sc.nextInt();
			switch(menu)
			{
					case 1:
						addproduct();
						break;		//제품 추가 메뉴 함수
					case 2:
						showproduct();
						break;		//추가한 제품 보여주는 함수
					case 3:
						System.out.println("종료합니다.");
						break;
					default:
						System.out.println("다시 입력해주세요");
			
			}
			
		}while(menu!=3);
		
		
	}

	private static void printmenu() {
		System.out.println("-----1번------");
		System.out.println("추가할 제품");
		System.out.println("1. TV");
		System.out.println("2.에어컨");
		System.out.println("3.컴퓨터");
		System.out.print("제품 선택:");
		
	}

	public static void addproduct() {
		int select;
		String brand;
		String code;
		String name;
		int size;
		int area;
		int cpu;
		int ram;
	
		printmenu();
		select=sc.nextInt();
		
		System.out.print("브랜드 : ");
		sc.nextLine();
		brand=sc.nextLine();
		System.out.print("제품코드 : ");
		code=sc.nextLine();
		System.out.print("제품명 : ");
		name=sc.next();
		
		switch(select)
		{
		case 1:
			System.out.print("화면크기(cm) : ");
			size=sc.nextInt();
			list[count++]=new Tv(brand,code,name,size);
			
			break;
		case 2:
		
			System.out.print("냉방면적 : ");
			area=sc.nextInt();
			list[count++]=new Aircon(brand,code,name,area);
			break;
		case 3:
			System.out.print("cpu : ");
			cpu=sc.nextInt();;
			System.out.print("ram : ");
			ram=sc.nextInt();
			list[count++]=new Notebook(brand,code,name,cpu,ram);
			break;
		}
		System.out.println("등록이 완료됐습니다.");
		
		
	}
	public static void showproduct() {
		
		for(int i=0; i<count; i++)
		{
			list[i].print();
			
		}
		
	}

	public static void menuboard() {
		System.out.println("메뉴");
		System.out.println("1.제품 추가");
		System.out.println("2.제품 확인");
		System.out.println("3.종료");
		System.out.print("메뉴 선택 : ");
	}

	
}


