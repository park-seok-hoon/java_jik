package kr.kh.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.kh.app.model.vo.MemberVO;
import kr.kh.app.service.MemberService;
import kr.kh.app.service.MemberServiceImp;

@WebServlet("/signup")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private MemberService memberService = new MemberServiceImp();
    
	public SignupServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/views/signup.jsp").forward(request, response); 
		//request.getRequestDispatcher/WEB-INF/views/signup.jsp 경로에 있는 파일을 클라이언트에게 보내준다. url에 ?뒤에 나오는 정보들을 통해서 보여줌
		//FORM ,a태그 밖에 사용할 수 없다.
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//POST방식은 반드시 FORM 태그를 이용할 수 밖에 없다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		if(memberService.signup(new MemberVO(id, pw, email))) {
			//회원가입에 성공하면 메인 페이지로 이동
			response.sendRedirect(request.getContextPath()+"/");
		}
		else {
			//실패하면 회원가입 페이지 유지
			doGet(request, response);
		}
	}

}