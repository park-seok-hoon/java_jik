<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<!-- 아이디, 비번, 비번확인, 이메일을 입력받아 서버로 전송하는 코드를 작성 get과 post 중에 선택해서 전송 -->
<form action="<%=request.getContextPath()%>/signup" method="post">
	<input type="text" name="id" placeholder="아이디">
	<br>
	<input type="password" name="pw" placeholder="비번">
	<br>
	<input type="email" name="email" placeholder="비번">
	<br>
	<button>로그인</button>

</form>
</body>
</html>