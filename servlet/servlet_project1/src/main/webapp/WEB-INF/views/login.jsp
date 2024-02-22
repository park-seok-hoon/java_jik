<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>

</head>
<body>
<!-- 서버로 id와 pw를 입력받아 서버로 전송하는 코드를 작성 post방식으로 전송 -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="<%=request.getContextPath() %>/">Logo</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath() %>/signup">회원가입</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath() %>/login">로그인</a>
      </ul>
    </div>
  </div>
</nav>
<form action="<%=request.getContextPath()%>/login" method="post">
	<h1>로그인</h1>
	 <div class="mb-3 mt-3">
	    <label for="email" class="form-label">아이디:</label>
	    <input type="text" class="form-control" id="id" placeholder="아이디" name="id">
	 </div>
	 <div class="mb-3 mt-3">
	    <label for="email" class="form-label">비밀번호:</label>
	    <input type="text" class="form-control" id="pw" placeholder="아이디" name="pw">
	 </div>
	<button class="btn btn-outline-success col-12">로그인</button>
</form>
<!-- 
session.setAttribute()는 세션에 정보를 저장하고,
request.setAttribute()는 요청에 정보를 저장
세션은 세션이 유지되는 동안에 다른 페이지에서도 사용 가능
요청은 해당 URL에 대해서만 사용 가능 (새로고침 X)	
 -->
${user}
${age}


</body>
</html>