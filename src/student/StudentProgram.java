package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentProgram implements Program{  
	//main에서 run()을 해줬을 때 실행이 가능하게 해주는 학생 관리 프로그램
	Scanner sc=new Scanner(System.in);
	
	int menu;
	List<Student> list = new ArrayList<Student>();
	Student std;

	@Override
	public void run() {
		do {
		printMenu();
		menu=sc.nextInt();
		runMenu(menu);
		}while(menu!=4);
	}

	@Override
	public void runMenu(int menu) {
		switch(menu)
		{
		case 1:
			studentmanage();
			break;
		
		case 2:
			scoremange();
			break;
		
		case 3:
			checkmenu();
			break;
		case 4:
			System.out.println("종료됩니다.");
			break;
		
		
		}
	}


	public void printMenu() {
		System.out.println("---------메뉴----------"); //첫번째 화면 메뉴 출력
		System.out.println("1. 학생 관리");
		System.out.println("2. 성적 관리");
		System.out.println("3. 조회");
		System.out.println("4. 종료");
		System.out.print("메뉴를 고르시오 : ");
		
	}
	
	private void studentmanage() { //학생 관리 1번 메뉴
		
		System.out.println("--------학생 관리----------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.print("메뉴를 고르시오 : ");
		menu=sc.nextInt();
		switch(menu)
		{
			case 1:	//학생 추가
				studentadds();
				break;
			
			case 2: //학생 수정
				studentchange();
				break;
			
			case 3: //학생 삭제
				studentdelete();
				break;
		
		}
		
		
		
	}

	private void studentadds() { //1-1 메뉴 학생 추가 메뉴
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int classNum=sc.nextInt();
		System.out.print("번호 : ");
		int num=sc.nextInt();
		System.out.print("이름 : ");
		String name=sc.next();
		
		Student std=new Student(grade,classNum,num,name);
		
		if(list.contains(std))
			{	
				System.out.println("중복된 학생입니다.");
				return;
			}
			list.add(std);
			int index=list.indexOf(std);
			System.out.println("추가되었습니다.");
		
		
		 
	}
	
	private void studentchange() { //1-2번 메뉴 수정할 학생 
		
		if(list.indexOf(std)==-1)
			System.out.println("등록된 학생이 없습니다.");
		
		System.out.println(list);
		System.out.println("수정할 학생의 학년,반,번호,이름을 쓰시오");
		System.out.print("학년 : ");
		int grade=sc.nextInt();
		System.out.print("반 : ");
		int classNum=sc.nextInt();
		System.out.print("번호 : ");
		int num=sc.nextInt();
		System.out.print("이름 : ");
		String name=sc.next();
		Student std=new Student(grade,classNum,num,name);
		int index=list.indexOf(std);	//수정되기 전 학생의 학년,반,번호,이름의 인덱스를 기억함
		
		System.out.println("수정할 학생의 학년,반,번호,이름을 쓰시오");
		System.out.print("학년 수정 : ");
		grade=sc.nextInt();
		System.out.print("반 수정: ");
		classNum=sc.nextInt();
		System.out.print("번호 수정 : ");
		num=sc.nextInt();
		System.out.print("이름 수정 : ");
		name=sc.next();
		Student stdfix=new Student(grade,classNum,num,name);
		
		list.remove(index);
		
		list.add(stdfix);
		
		
		//학년 별,반 별 
		list.sort((o1,o2)->{
			if(o1.getGrade()!=o2.getGrade())
			{
				return o1.getGrade()-o2.getGrade(); //학년 별로 오름차순
			}
			if(o1.getClassNum()!=o2.getClassNum())
			{
				return o1.getClassNum()-o2.getClassNum(); //반 별로 오름차순
			}
			return o1.getNum()-o2.getNum();
		});
			
				
		
		System.out.println("수정이 완료됐습니다.");
		
		
	}
	
	private void studentdelete() { //1-3번 메뉴 삭제할 학생
		
		System.out.println("삭제할 학생을 고르세요.");
		System.out.println(list);
		System.out.println("번호 선택 0번부터 시작");
		int index=sc.nextInt();
		
		list.remove(index);
		
		System.out.println("삭제가 완료됐습니다.");
		
	}
	

	private void scoremange() { //성적 관리 2번 메뉴
		System.out.println("성적 수정");
		System.out.println(list);
		System.out.println("수정할 학생의 번호를 고르세요 : ");
		int index=sc.nextInt();
		
		System.out.println("1. 부분 성적 수정");
		System.out.println("2. 전체 성적 수정");
		System.out.print("부분 성적 수정을 할지 전체 성적 수정을 할 지 고르시오 : ");
		int fixchoose=sc.nextInt();
		
		switch(fixchoose)
		{
		
		case 1:
			System.out.println("\n");
			System.out.println("부분 성적 수정");
			System.out.println("1.국어 성적 수정 : ");
			System.out.println("2.영어 성적 수정 : ");
			System.out.println("3.수학 성적 수정 : ");
			System.out.print("수정할 성적의 번호를 고르세요 : ");
			menu=sc.nextInt();
			
		switch(menu)
			{
				case 1:
					System.out.println("\n");
					System.out.println("---------부분 성적 수정------");
					System.out.print("국어 성적 입력");
					int kor =sc.nextInt();
					list.get(index).setKor(kor);
					System.out.println("국어 성적 수정 완료");
					break;
				
				case 2:
					System.out.println("\n");
					System.out.println("---------부분 성적 수정------");
					System.out.print("영어 성적 입력");
					int eng = sc.nextInt();
					list.get(index).setEng(eng);
					System.out.println("영어 성적 수정 완료");
					break;
				
				case 3:
					System.out.println("\n");
					System.out.println("---------부분 성적 수정------");
					System.out.println("수학 성적 입력");
					int math = sc.nextInt();
					list.get(index).setEng(math);
					System.out.println("수학 성적 수정 완료");
					break;
			}
			break;
		
		case 2:
			System.out.println("\n");
			System.out.println("---------전체 성적 수정------");
			
			System.out.print("국어 성적 입력 : ");
			int kor=sc.nextInt();
			System.out.print("영어 성적 입력 : ");
			int eng =sc.nextInt();
			System.out.print("수학 성적 입력 : ");
			int math=sc.nextInt();
			
			list.get(index).setKor(kor);
			list.get(index).setEng(eng);
			list.get(index).setMath(math);
			
			
			System.out.println("전체 성적 수정이 완료됐습니다.");
			break;
			
		
		}
		System.out.println("바뀐 성적 현황");
		System.out.println(list);
		
	}
	
	
	
	private void checkmenu() { //3번 메뉴를 들어갔을때 (조회)
		
		System.out.println("--1.학생 조회--"); //학생 조회는 학년,반,번호,이름이 들어간 조회
		System.out.println("--2.과목 조회--"); //과목 조회는 국어,영어,수학 성적을 조회 
		System.out.print("메뉴 선택 : ");
		menu=sc.nextInt();
		
		switch(menu)
		{
			case 1:
					studentcheck();
				break;
			
			case 2:
				scorecheck();
				break;
				
		
		}
	}


	private void studentcheck() { //3-1번 메뉴를 들어갔을 때 (학생 조회) 
		
	}

	private void scorecheck() {	//3-2번 메뉴를 들어갔을 때 (성적 조회)
		System.out.println("--------성적 조회--------");
		System.out.println("1. 국어 조회 ");
		System.out.println("2. 영어 조회 ");
		System.out.println("3. 수학 조회 ");
		menu=sc.nextInt();
		
		switch(menu)
		{
		case 1:	//1. 국어 조회
			
			break;
		case 2: //2. 영어 조회
			
			break;
		case 3: //3. 수학 조회
			
			break;
			
		
		
		}
		
		
	}

	
	

	

}
