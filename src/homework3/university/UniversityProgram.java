package homework3.university;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import homework3.university.service.PrintServiceImp;
import program.Program;

public class UniversityProgram implements Program{
	private Scanner scan=new Scanner(System.in);
	private final int EXIT=6;	
	private  PrintServiceImp printService = new PrintServiceImp();	// 메뉴판 클래스
	
	
	@Override
	public void run() {
		
		int menu;
		
		do {
			printMenu();
			menu=scan.nextInt();
			runMenu(menu);
			try {
				
			}catch(InputMismatchException e)
			{
					System.out.println("잘못된 메뉴 선택입니다.");
					scan.nextLine();
			}
		}while(menu!=EXIT);
	
		
		
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1:
			professorMenu(); //교수 메뉴
			break;
		case 2:
			managestudent(); // 학생 메뉴
			break;
		/*case 3:
			managedepartment(); // 관리자 전공 관리 메뉴
			break; */
		case 4:
			managesignup(); // 대학교 조회 메뉴
			break;
		case 5:
			exitMenu(); //프로그램 종료
			break;
		default:
			throw new InputMismatchException();
		}
		
		
	}

	private void professorMenu() { //교수 메뉴 
		
		printService.printProfessorMenu();
		int menu = scan.nextInt();
		
			switch(menu) {
			case 1:
				professorManagement();
				break;
			case 2:
				setProfessor();
				break;
			case 3:
				deleteProfessor();
				break;
			case 4:
				System.out.println("이전 메뉴로 돌아갑니다.");
				break;
			default:
				throw new InputMismatchException();
			}
		
	}

	private void professorManagement() {
		printService.printProfessorManageMenu();
		int menu = scan.nextInt();
		
			switch(menu) {
			case 1:
				addProfessor(); //교수 추가
				break;
			case 2:
				setProfessor(); //교수 수정
				break;
			case 3:
				deleteProfessor(); //교수 삭제
				break;
			case 4:
				System.out.println("이전 메뉴로 돌아갑니다.");
				break;
			default:
				throw new InputMismatchException();
			}
		
		
	}

	private void addProfessor() {	//교수 추가
		
	
	}
	private void setProfessor() { //교수 수정
		printService.printProfessorFixedMenu();
		int menu=scan.nextInt();
		
		switch(menu) {
		case 1:
			setProfessorId(); //교수 번호 수정
			break;
		case 2:
			setProfessorAge(); //교수 나이 수정
			break;
		case 3:
			setProfessorName(); //교수 이름 수정
			break;
		case 4:
			System.out.println("이전 메뉴로 돌아갑니다.");
			break;
		default:
			throw new InputMismatchException();
	}

		
		
	}
	
	//교수 번호 수정
	private void setProfessorId() {
		
	}

	//교수 나이 수정
	private void setProfessorAge() {
		
	}

	 //교수 이름 수정
	private void setProfessorName() {
		
	}

	private void deleteProfessor() { //교수 삭제
		
	}

	
	
	private void managestudent() { //학생 메뉴
		printService.printStudentMenu();
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			addStudent();
			break;
		case 2:
			setStudent();
			break;
		case 3:
			deleteStudent();
			break;
		case 4:
			System.out.println("이전 메뉴로 돌아갑니다.");
			break;
		default:
			throw new InputMismatchException();
	}
		
	}
	private void addStudent() { //학생 추가
		
		
	}

	private void setStudent() { //학생 수정
		
	}

	private void deleteStudent() {	//학생 삭제
		
	}

	
	private void managedepartment() {
	
		
	}

	private void managesignup() { //수강 관리
		printService.printsignupMenu();
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			addSignup();
			break;
		case 2:
			setSignup();
			break;
		case 3:
			deleteSignup();
			break;
		case 4:
			System.out.println("이전 메뉴로 돌아갑니다.");
			break;
		default:
			throw new InputMismatchException();
	}
	}

	private void addSignup() {	//수강 추가

	}

	private void setSignup() { //수강 수정
		
		
	}

	private void deleteSignup() { //수강 취소
		
		
	}

	private void checkmenu() { //조회 메뉴
		printService.SearchMenu();
		
	}
	@Override
	public void printMenu() {

		printService.printMainMenu();
		
	}

	@Override
	public void exitMenu() {
		
		printService.printExit();
			
	}
}
