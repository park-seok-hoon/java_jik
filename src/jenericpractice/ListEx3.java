package jenericpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

	public static void main(String args[])
	{	//속담을 입력받아 저장하고,출력하는 코드를 작성하세요.
		Scanner sc=new Scanner(System.in);
		List<String> list=new ArrayList<String>();
		
		String a;
		
		do {
			System.out.println("속담을 입력하시오:");
			a=sc.nextLine();
			list.add(a);
			
		}while(!a.equals("-1"));
		
		for(int i=0; i<list.size(); i++)
		{
			
			System.out.println(list.get(i));
			
		}
		
		
		
	}
}
