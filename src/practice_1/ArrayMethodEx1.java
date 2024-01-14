package practice_1;

import java.util.Scanner;

public class ArrayMethodEx1 {
	public static int select;
	public static int subject;
	public static int student;
	public static int score;
	public static int subjectselect;
	public static int []Kor=new int[30];
	public static int []Eng=new int[30];
	public static int []Math=new int[30];
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		do {
		menu();
		select=sc.nextInt();
		
		
		switch(select) //메뉴판
		{
		case 1:
			score_correction();
					switch(subject)
					{
						case 1:
							Kor[subject]=score;
							break;
						case 2:
							Eng[subject]=score;
							break;
						case 3:
							Math[subject]=score;
							break;
					}
			break;
		case 2:
			score_inquiry();
			select=sc.nextInt();
			switch(select)
			{
			case 1:
				subject_inquiry();
				break;
			case 2:
				student_inquiry();
				break;
			}
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		
		}
		}while(select!=3);
	
		
		
		
		
		
	

	}
	
	
	public static void menu() {
		System.out.println("------------메뉴-------------");
		System.out.println("1.성적수정");
		System.out.println("2.성적조회");
		System.out.println("3.프로그램 종료");
		System.out.print("메뉴 선택:");
		
	}

	public static void score_correction() {
		System.out.println("-----------성적수정------------");
		System.out.println("1.국어");
		System.out.println("2.영어");
		System.out.println("3.수학");
		System.out.println("과목 선택 : ");
		subject=sc.nextInt();
		System.out.println("학생 선택 : "); 
		student=sc.nextInt();
		System.out.println("성적 입력 : ");
		score=sc.nextInt();
		System.out.println("입력이 완료됐습니다.");
		
	}

	public static void score_inquiry() {	//성적조회
		
		System.out.println("-----------성적조회------------");
		System.out.println("1.과목별조회");
		System.out.println("2.학생별조회");
		System.out.print("선택 : ");
	}

	public static void subject_inquiry() {	//과목별조회
		System.out.println("-----------과목별조회------------");
		System.out.println("1.국어");
		System.out.println("2.영어");
		System.out.println("3.수학");
		System.out.print("과목 선택 : ");
		subjectselect=sc.nextInt();
		
		switch(subjectselect)
		{	
		case 1:
			for(int i=0; i<Kor.length; i++)
			{
				System.out.println(i+"번 : "+Kor[i]+"점");
				
			}
			break;
		case 2:
			for(int i=0; i<Eng.length; i++)
			{
				System.out.println(i+"번 : "+Eng[i]+"점");
				
			}
			break;
		case 3:
			for(int i=0; i<Math.length; i++)
			{
				System.out.println(i+"번 : "+Math[i]+"점");
				
			}
			break;
		
		}
	}

	public static void student_inquiry() { //학생별조회
		System.out.print("학생 선택 : ");
		select=sc.nextInt();		
		System.out.println("국어 : " + Kor[select]+"점");
		System.out.println("영어 : " + Eng[select]+"점");
		System.out.println("수학 : " + Math[select]+"점");
		
	}

}
