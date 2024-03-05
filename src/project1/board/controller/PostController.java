package project1.board.controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import project1.board.model.vo.MemberVO;
import project1.board.model.vo.PostCategoryVO;
import project1.board.model.vo.PostVO;
import project1.board.service.MemberService;
import project1.board.service.MemberServiceImp;
import project1.board.service.PostService;
import project1.board.service.PostServiceImp;
import project1.board.service.PrintService;
import project1.board.service.PrintServiceImp;

//게시글 작성을 하는 컨트롤러
//ADMIN과 USER 모두 사용 가능한 컨트롤러
//관리자가 게시판을 생성해야 게시글을 작성할 수 있기 때문에, 게시판이 생성 이전이라면 실행할 수 없는 컨트롤러
//입력받은 값을 PostService에게 보내주는 역할의 컨트롤러

//일반회원은 게시글 작성,수정(본인),삭제(본인)이 가능하고
//관리자는 게시글 작성,수정,삭제 + 공지사항 등록이 가능함

public class PostController {

	private PostService postService = new PostServiceImp();
	private PostVO postVo;
	private Scanner scan = new Scanner(System.in);
	private PrintService printService = new PrintServiceImp();
	
	



	public void postManagement() {	//게시글 관리 임시
		int menu=0;
		printService.postManagement();
		menu=scan.nextInt();
		postManagementrun(menu);
		
		}

		
	private void postManagementrun(int menu) {
		switch(menu) {
		case 1:
			printPost();	//게시글 출력
		case 2:
			postControll(); //게시글 입력
		case 3:
		
		}
	}

	private void printPost() {	//게시판 출력
		System.out.println("게시판 출력");
		List<PostVO> postVoList =postService.getPostList();	//select문을 쓸때는 postService에 해당리스트를 가져오도록 요청함
		for(int i=0; i<postVoList.size(); i++) {
			System.out.println(postVoList);
		}
	}


	boolean postControll() {
		System.out.println("게시판 insert");
		System.out.print("아이디를 입력하세요.");
		String po_mb_id=scan.next();		
		
		System.out.println("게시판");
		
		System.out.print("카테고리 번호를 선택하여 주세요.");
		List<PostCategoryVO> postCategoryList = postService.getPostCategoryList(); //select문을 통해 게시글 분류를 가져옴
		System.out.println(postCategoryList);
		int po_pc_num=scan.nextInt();
		scan.nextLine();
		System.out.print("게시글에 쓸 제목을 입력하세요 : ");
		String po_title=scan.next();
<<<<<<< HEAD
		
		System.out.println("게시글에 쓸 내용을 입력하세요 : ");
		String po_content=scan.nextLine();
=======
		System.out.print("게시글 내용을 입력하세요.");;
		String content=scan.next();
		System.out.print("아이디를 입력하세요.");
		String po_mb_id=scan.next();
		System.out.println("게시판 번호를 입력하세요.");
		int po_bo_num=scan.nextInt();
		System.out.println("게시글 카테고리 번호를 입력하세요.");
		int po_pc_num=scan.nextInt();
		
		PostVO postVo = new PostVO(po_title,content,po_mb_id,po_bo_num,po_pc_num);
	
	if(postService.write(postVo)) {
		return true;
	}
	return false;
>>>>>>> fe9da2e3450a25f6e437e62392dda395cff510ec
		
		PostVO post=new PostVO(po_title,po_content,po_mb_id, po_pc_num);
		
		if(postService.writePost(post)) {
			System.out.println("게시글 등록 성공");
			return true;
		};
			System.out.println("게시글 등록 실패");
			return false;
	
	}
		
}
