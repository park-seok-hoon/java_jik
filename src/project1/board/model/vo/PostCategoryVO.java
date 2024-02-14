package project1.board.model.vo;

public class PostCategoryVO { //게시글분류
	int pc_num;
	String pc_title;
	int pc_bo_num;
	
	@Override
	public String toString() {
		return "게시글 카테고리 번호 : " + pc_num + ",게시글 카테고리 내용" + pc_title + ", 게시판 번호 : " + pc_bo_num + "] \n";
	}
	
	
}
