<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<div class="container">
<h1>회원가입</h1>
<!-- 아이디, 비번, 비번확인, 이메일을 입력받아 서버로 전송하는 코드를 작성 get과 post 중에 선택해서 전송 -->
<form action="<%=request.getContextPath()%>/signup" method="post">
	 <div class="mb-3 mt-3">
	    <label for="ㅑㅇ" class="form-label">아이디:</label>
	    <input type="text" class="form-control" id="id" placeholder="아이디" name="id">
	 </div>
	 
	<div class="mb-3 mt-3">
	    <label for="pw" class="form-label">비번:</label>
	    <input type="text" class="form-control" id="pw" placeholder="비번확인" name="pw">
	 </div>
	 
	<div class="mb-3 mt-3">
	    <label for="pw2" class="form-label">비번확인:</label>
	    <input type="text" class="form-control" id="pw2" placeholder="비번확인" name="pw2">
	 </div>
	 
	<div class="mb-3 mt-3">
	    <label for="email" class="form-label">이메일:</label>
	    <input type="text" class="form-control" id="email" placeholder="이메일" name="email">
	 </div>
	<button class ="btn btn-outline-success col-12">회원가입</button>
</form>
 </div>
</body>
</html>