package project1.board.service;

import java.util.List;

import project1.board.model.vo.PostCategoryVO;
import project1.board.model.vo.PostVO;

public interface PostService {

	List<PostVO> getPostList();	//select문 게시글 가져오기d

	List<PostCategoryVO> getPostCategoryList();

	boolean writePost(PostVO post);	//게시글 입력 성공,실패를 나타냄



}
