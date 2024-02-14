package project1.board.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import project1.board.dao.PostDAO;
import project1.board.model.vo.MemberVO;
import project1.board.model.vo.PostCategoryVO;
import project1.board.model.vo.PostVO;

public class PostServiceImp implements PostService {
	private PostDAO postDAO;
	private InputStream inputStream;
	private SqlSession session;
	
	public PostServiceImp() {
		String resource = "project1/board/config/mybatis-config.xml";
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession(true);
			postDAO = session.getMapper(PostDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override	//게시글 조회
	public List<PostVO> getPostList() {
		return postDAO.selectPostList();
	}

	@Override
	public List<PostCategoryVO> getPostCategoryList() {//게시글 카테고리 리스트 조회
		
		return postDAO.selectPostCategoryList();
	}

	@Override
	public boolean writePost(PostVO post) {
		if(post ==null
			|| 	post.getPo_title() 	==null
			||	post.getPo_content()==null
			||	post.getPo_mb_id()	==null
			) {
		
		return false;
	}
	boolean res = postDAO.writePost(post);
	if(res) {
		session.commit();
	}
	return res;
}
	


}

	


