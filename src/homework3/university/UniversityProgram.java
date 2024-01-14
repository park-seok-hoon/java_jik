package homework3.university;

import java.util.InputMismatchException;
import java.util.Scanner;

import homework3.university.service.PrintServiceImp;
import program.Program;

public class UniversityProgram implements Program{
	private Scanner scan=new Scanner(System.in);
	private final int EXIT=5;
	private  PrintServiceImp printService = new PrintServiceImp();
	
	
	@Override
	public void run() {
		int menu=0;
		do {
			printMenu();
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
			manageprofessor(); //교수 관리
			break;
		case 2:
			managestudent(); // 학생 관리
			break;
		case 3:
			managedepartment(); // 학과 관리
			break;
		case 4:
			managesignup(); //수강 관리
			break;
		case 5:
			checkmenu(); //조회
			break;
		case 6:
			exitMenu();
			break;
		default:
			throw new InputMismatchException();
		}
		
		
	}

	private void manageprofessor() { //교수 관리(추가,수정,삭제)
		printService.printProfessorMenu();
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			addProfessor();
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

	private void addProfessor() {	//교수 추가
		
	}

	private void setProfessor() { //교수 수정
		
	}

	private void deleteProfessor() { //교수 삭제
		
	}

	private void managestudent() { //학생 관리
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

	
	private void managedepartment() {	//학과 관리
		printService.printdepartmentMenu();
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			addDepartment();
			break;
		case 2:
			setDepartment();
			break;
		case 3:
			deleteDepartment();
			break;
		case 4:
			System.out.println("이전 메뉴로 돌아갑니다.");
			break;
		default:
			throw new InputMismatchException();
	}
}
	

	private void addDepartment() {	//학과 추가
		
	}

	private void setDepartment() { //학과 수정
		
	}

	private void deleteDepartment() { //학과 삭제
		
	}

	private void managesignup() { //수강 관리
		printService.SearchMenu();
		int menu = scan.nextInt();
		switch(menu) {
		case 1:
			addDepartment();
			break;
		case 2:
			setDepartment();
			break;
		case 3:
			deleteDepartment();
			break;
		case 4:
			System.out.println("이전 메뉴로 돌아갑니다.");
			break;
		default:
			throw new InputMismatchException();
	}
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
