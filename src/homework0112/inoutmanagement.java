package homework0112;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class inoutmanagement implements Program {
	
	public static Scanner sc=new Scanner(System.in);
	
	
	public static outsumlist outsum; //outsumlist(지출) 클래스 선언
	public static List<insumlist> inlist = new ArrayList<insumlist>(); //수입 리스트 선언
	public static List<outsumlist> outlist = new ArrayList<outsumlist>(); //수출 리스트 선언
	public static int moneytotal=0; //수입과 지출을 포함한 가지고 있는 총 돈
	static int menu;
	
	@Override
	public void run() {
		
		do {
		
			try {
				printMenu();
				//메뉴 선택
				menu = sc.nextInt();
				//메뉼 실행
				runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				sc.nextLine();
			}
		}while(menu!=5);
	}

	@Override
	public void runMenu(int menu) {
		
	
		switch(menu)
		{
			case 1:
				insertmenu(); //내역 등록
				break;
			case 2:
				insumoutsummenu(); //내역 출력
				break;
			case 3:
				searchmenu(); //내역 검색
				break;
			case 4:
				//deletemenu(); //내역 삭제
				break;
			case 5:
				break;
		}
		
	
	}




	@Override
	public void printMenu() {
		  System.out.println("-----------메뉴-------------");
	      System.out.println("1. 내역 등록");
	      System.out.println("2. 내역 출력");
	      System.out.println("3. 내역 검색");
	      System.out.println("4. 내역 삭제");
	      System.out.println("5. 종료");
	      System.out.println("================");
	      System.out.print("선택 :");
	}

	private void insertmenu() {		//1-1내역 등록 메뉴
		String date; //(수입,수출) 날짜 변수 
		String index; // (수입,수출) 목록 변수
		int money; //(수입,수출) 돈 변수
		
		
		System.out.println("--------------내역 등록 메뉴------------");
		System.out.println("1. 수입 등록 ");
		System.out.println("2. 지출 등록 ");
		System.out.println("3. 메뉴로 돌아가기");
		System.out.print("선택 : ");
		menu=sc.nextInt();
		
		switch(menu)	
		{
		
		case 1:
			sc.nextLine();
			System.out.println("-------------수입 등록-------------");
			System.out.println("수입 날짜 입력 : ");
			date=sc.nextLine();
			System.out.println("수입 내역 입력 : ");
			index=sc.nextLine();
			System.out.println("수입 금액 입력 : ");
			money=sc.nextInt();
			insumlist insum=new insumlist(date, index, money);
			inlist.add(insum);
			
			System.out.println(inlist);
			
			moneytotal+=money;
			
			break;
			
		case 2:
			
			sc.nextLine();
			System.out.println("-------------지출 등록 ------------");
			System.out.println("지출 날짜 입력 : ");
			date=sc.nextLine();
			System.out.println("지출 내역 입력 : ");
			index=sc.nextLine();
			System.out.println("지출 금액 입력 : ");
			money=sc.nextInt();
			outsumlist outsum=new outsumlist(date, index, money);
			outlist.add(outsum);
			
			System.out.println(outlist);
			moneytotal-=money;
			break;
		case 3:
			return;
			
		}
		
		
		
	}
	
	private void insumoutsummenu() {
		System.out.println("--------------- 내역 출력 ---------------");
		System.out.println("1.수입 내역 출력 ");
		System.out.println("2.수출 내역 출력 ");
		System.out.println("3.전체 내역 출력 ");
		System.out.println("4.돌아가기");
		System.out.print("메뉴를 선택하세요.");
		menu=sc.nextInt();
		
		
		switch(menu)
		{
			case 1:
				System.out.println(inlist);
				break;
			case 2:
				System.out.println(outlist);
				break;
			case 3:
				System.out.println(inlist);
				System.out.println();
				System.out.println(outlist);
				System.out.println("현재 총 합계 : " +moneytotal);
				break;
			case 4:
				break;
		}

	
	}
	
	private void searchmenu() {
		System.out.println("--------------- 내역 검색 ---------------");
		System.out.println("검색할 내역을 입력해주세요.");
		
	}
	
	
	

}
