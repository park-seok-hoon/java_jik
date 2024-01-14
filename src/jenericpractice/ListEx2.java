package jenericpractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		//정수를 5개 입력받아 입력받은 정수를 리스트에 저장하는 코드를 작성하세요.
		Scanner sc=new Scanner(System.in);
		
		//정수를 여러개 저장하기 위해 ArrayList 인스턴스를 생성
		//정수이기 때문에 Integer를 추가. int가 안되는 이유는 제네릭은 클래스만 올 수 있어서
		List<Integer> list=new ArrayList<Integer>();
		
		//콘솔창에서 다양한 값을 입력받기 위한 Scanner 인스턴스를 생성
		//콘솔창에서 입력받아야 하기 때문
		int number;
		
		System.out.println("5개를 입력하세요 : ");
		for(int i=0; i<5; i++)
		{	
			number=sc.nextInt();
			
			list.add(number);
			
		}
		
		for(int i=0; i<5; i++)
		{
			System.out.println(list.get(i));
			
		}
		
		
	}

}
