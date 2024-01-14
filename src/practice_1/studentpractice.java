package practice_1;

import java.util.Scanner;

public class studentpractice {
	public static int submenu; //성적조회->과목별조회,학생별조회
	public static int menu;
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Student list[] = new Student [5];
		
		for(int i=0; i<list.length; i++)
		{
			list[i]=new Student();	//배열의 생성자를 만들어주는 작업
		}
		
		int count=1;
		for(Student std:list)
		{
			
			std.num=count++;
			
		}
		
		do {
			menulist(); //메뉴판 성적수정,조회,크로그램 종료
			menu=sc.nextInt();
			
			switch(menu)
			{
					case 1:
						score_correction(list);
					case 2:
						score_inquiry(list);
					case 3:
						System.out.println("3.프로그램 종료");
			
			
			}
			
			score_inquiry(list);
			
		}while(menu!=3);
		

	}

	public static void menulist() {
		System.out.println("----------메뉴-----------");
		System.out.println("1.성적수정");
		System.out.println("2.성적조회");
		System.out.println("3.프로그램 종료");
		System.out.print("메뉴 선택 :");
	}
	public static void score_correction(Student stds[]) {
		int subject; //과목 선택
		int stud; //학생 선택
		int score; //성적 입력
		
		System.out.println("-----------성적수정------------");
		System.out.println("1.국어");
		System.out.println("2.영어");
		System.out.println("3.수학");
		System.out.print("과목 선택 : ");
		subject=sc.nextInt();
		System.out.print("학생 선택 : ");
		stud=sc.nextInt();
		System.out.println("번호를 선택");
		System.out.print("성적 입력");
		score=sc.nextInt();
		
		
		
	}
	public static void subject_inquiry(Student stds[]) {	//과목별조회
		System.out.println("-----------과목별조회------------");
		System.out.println("1.국어");
		System.out.println("2.영어");
		System.out.println("3.수학");
		System.out.print("과목 선택 : ");
	}
		public static void score_inquiry(Student stds[]) {	//성적조회
			
			System.out.println("-----------성적조회------------");
			System.out.println("1.과목별조회");
			System.out.println("2.학생별조회");
			System.out.print("선택 : ");
			int menu=sc.nextInt();
			
			switch(menu)
			{
				case 1:
					subject_inquiry(stds);
				case 2:
					
				
			}
		}	
		
		public static void student_inquiry(Student stds[]) { //학생별조회
			System.out.println("--------------학생별조회------------");
			System.out.print("학생 번호를 입력 : ");
			int num=sc.nextInt();
			
			for(Student std: stds )
			{
				if(num==std.num)
				{
					std.print();
					
				}
					
				
			}
			
		}
	
		
		
}


	


