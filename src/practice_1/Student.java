package practice_1;
/* 다음 기능을 가진 성적 관리 프로그램을 작성하세요.
 * - 1반의 성적을 관리
 * - 최대 5명
 * - 성적은 번호순으로 관리
 * - 성적은 국어, 영어, 수학 성적을 관리
 * 메뉴
 * 1.성적수정
 * 2.성적조회
 * 3.프로그램 종료
 
* 메뉴 선택 : 
 * 
 * --성적수정--
 * 1. 국어
 * 2. 영어
 * 3. 수학
 * 과목 선택 : 1
 * 
 * 학생 선택 : 3 번호를 선택
 * 성적 입력 : 100
 * 
 * --성적조회--
 * 1. 과목별조회
 * 2. 학생별조회
 * 선택 : 1
 * --과목별조회--
 * 1. 국어
 * 2. 영어
 * 3. 수학
 * 과목 선택 : 1
 * 1번 : 0점
 * 2번 : 0점
 * 3번 : 100점
 * ....
 * 30번 : 0점
 * 
 * --성적조회--
 * 1. 과목별조회
 * 2. 학생별조회
 * 선택 : 2
 * 학생 선택 : 3
 * 국어 : 100점
 * 영어 : 0점
 * 수학 : 0점
 * */
public class Student {
	
	int math,Eng,Kor;	//수학,영어,국어
	int num; //학생 번호
	

	
	public void print()
	{
		System.out.println("국어 : "+Kor);
		System.out.println("영어 : "+ Eng);
		System.out.println("수학 : "+math);
		
	}
	
	public void setKor(int Kor)
	{
		this.Kor=Kor;
		
	}
	
	public void setEng(int Eng)
	{
		
		this.Eng=Eng;
	}
	
	public void setMath(int math)
	{
		this.math=math;
		
	}
	
	
	
	
}
