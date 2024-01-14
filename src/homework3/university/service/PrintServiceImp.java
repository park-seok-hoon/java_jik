
package homework3.university.service;

public class PrintServiceImp implements PrintService {

	@Override
	public void printMainMenu() {
		System.out.println("-------메뉴-------");
		System.out.println("1. 교수 관리");
		System.out.println("2. 학생 관리");
		System.out.println("3. 학과 관리");
		System.out.println("4. 수강 관리");
		System.out.println("5. 조회");
		System.out.println("6. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
		
	}

	@Override
	public void printProfessorMenu() {
		System.out.println("----교수 관리---");
		System.out.println("1. 교수 추가");
		System.out.println("2. 교수 수정");
		System.out.println("3. 교수 삭제");
		System.out.println("4. 뒤로 가기");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void printStudentMenu() {
		System.out.println("----학생 관리---");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 뒤로 가기");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void printdepartmentMenu() {
		System.out.println("----학과 관리---");
		System.out.println("1. 학과 추가");
		System.out.println("2. 학과 수정");
		System.out.println("3. 학과 삭제");
		System.out.println("4. 뒤로 가기");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void printsignupMenu() {
		System.out.println("----수강 관리---");
		System.out.println("1. 수강 추가");
		System.out.println("2. 수강 수정");
		System.out.println("3. 수강 취소");
		System.out.println("4. 뒤로 가기");
		System.out.print("메뉴 선택 : ");
	}
	
	@Override
	public void SearchMenu()
	{
		System.out.println("----조회---");
		System.out.println("1. ");
	}

	@Override
	public void printExit() {
		System.out.println("================");
		System.out.println("프로그램을 종료합니다.");
		System.out.println("================");
	}
	

	
}
