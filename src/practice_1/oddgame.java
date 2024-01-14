package practice_1;

import java.util.Scanner;

public class oddgame {
	public static int choice;
	public static int win_count;
	public static int lose_count;
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int select;
		
		do {
				menu();
				select=sc.nextInt();
				switch(select)
				{
					case 1:
						oddevenchoice();
						break;
					case 2:
						result();
						break;
					case 3:
						System.out.println("------------");
						System.out.println("프로그램 종료");
						break;
				
				}
		}while(select!=3);
		
		
		
	}
	private static void result() {
		
		System.out.println("결과 : "+ win_count +"승 "+ lose_count + "패"  );
		System.out.println("------------------------------");
	}
	public static void menu()
	{
		System.out.println("메뉴");
		System.out.println("1. 새 게임");
		System.out.println("2. 결과 조회");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	
	}
	public static void oddevenchoice()
	{	int max=99,min=1;
		int random=(int) (Math.random()*(max+min-1)+min);
		System.out.println("---------------");
		System.out.print("선택(홀:1, 짝:0) :");
		choice=sc.nextInt();
		
		System.out.println(random+" 홀입니다.");
		if(random%2==0 && choice==0)
			{System.out.println("성공!");
				win_count++;
			}
		if(random%2==1 && choice==1)
			{System.out.println("성공!");
				win_count++;
			}
		
		if(random%2==1 && choice==0)
		{System.out.println("실패!");
			lose_count++;
		}
	
		if(random%2==0 && choice==1)
		{System.out.println("실패!");
			lose_count++;
		}
	
		
		
		
		
		System.out.println("---------------");
		
	}

}
