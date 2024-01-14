package jenericpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class MapEx2 {
	public static void main(String args[])
	{	/* 회원을 관리하는 프로그램을 작성하세요.
		* 메뉴
		* 1. 회원가입
		* 	아이디와 비번만 입력
		* 2.회원검색
		* 	-아이디를 입력해서 회원 정보를 조회
		* 3.종료
		*/
		Scanner sc=new Scanner(System.in);
		Map<String, String> login =new HashMap<String, String>();
		
		Set<String> set =login.keySet(); 
		
		int menu;
		String id;
		System.out.println("아이디를 입력해서 회원 정보를 조회");

		
		
		
		
		do {
			
			System.out.println("메뉴");
			System.out.println("1. 회원가입");
			System.out.println("2.회원검색");
			System.out.println("3. 종료");
			menu=sc.nextInt();
			sc.nextLine();
		switch(menu)
		{
			case 1:
				System.out.println("아이디 입력:");
				id=sc.nextLine();
				System.out.println("비번 입력:");
				String pw=sc.nextLine();
				login.put(id, pw);
				System.out.println("회원가입 성공");
				break;
			case 2:
				System.out.println("아이디를 입력하세요.");
				
				for(String tmp : set)
				{
					String value= login.get(tmp);
					System.out.println("[ 아이디:" + tmp + " , 비밀번호: " +value +"]" );
					
				}
				break;
			case 3:
				System.out.println("종료");
			break;
		
		}
		}while(menu!=3);
		
	}
}
