package coffeemaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class coffeemain {
	
	public static Scanner scan=new Scanner(System.in);
	
	public static void main(String args[]) {
		
		List<coffee> coffeelist =new ArrayList<coffee>();
		List<coffeeprice> coffeepricelist = new ArrayList<coffeeprice>();
		
		
		for(int i=0; i<3; i++)
		{
			System.out.println("커피 번호를 입력");
			int coffeenum= scan.nextInt();
			System.out.println("커피 이름을 입력");
			String coffeename=scan.next();
			
			coffee cof = new coffee(coffeenum, coffeename);
			
			coffeelist.add(cof);
		}
		
		
		for(int i=0; i<3; i++)
		{		
			
		System.out.println("커피 가격을 입력");
		int coffeeprice= scan.nextInt();
		System.out.println("운세를 입력");
		String coffeelucky=scan.next();
		
		coffeeprice coffeepr = new coffeeprice(coffeeprice,coffeelucky);
		
		coffeepricelist.add(coffeepr);
		
		}
		
		//coffeelist 0,이름,1000,운세없음 }{  1,이름2,2000,운세있음, }{  2,이름3,3000,운세매우나쁨
		
		
		
		System.out.println(coffeelist.get(0).getCofelist());
		
		
		
		
	}
}
