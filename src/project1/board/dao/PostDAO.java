package project1.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import project1.board.model.vo.PostCategoryVO;
import project1.board.model.vo.PostVO;

public interface PostDAO {

	List<PostVO> selectPostList(); //게시글 조회

	List<PostCategoryVO> selectPostCategoryList(); //게시글 카테고리 조회

	boolean writePost(@Param("post")PostVO post);

}
