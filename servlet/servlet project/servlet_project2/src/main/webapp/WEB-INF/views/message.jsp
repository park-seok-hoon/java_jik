<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		let msg = '${msg}'; //서버에서 보낸 msg값을 변수에 저장,msg != ''는 msg의 값이 비어 있는 경우
		if(msg != ''){ //서버에서 보내준 정보가 없을 때 값이 아무것도 존재하지 않음
			alert(msg);
		}
		let redirectURL = '${url}'; //서버에서 보낸 url을 변수에 저장
		if(redirectURL != ''){
			location.href = '<c:url value="/${url}"/>'; //location.href 새로운 페이지로 이동
		}else{
			location.href = '<c:url value="/"/>';
		}
	</script>
</body>
</html>