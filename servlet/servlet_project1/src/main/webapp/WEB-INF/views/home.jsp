<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num=10;
	%>
	<h1>���� �������Դϴ�.</h1>
	<a href="<%=request.getContextPath() %>?data=�ȳ�">������ ����</a>
	<form action="<%=request.getContextPath() %>">
		<h2>form�±� get��� ����</h2>
		<input type="text" name="id">
		<button>����</button> 
	</form>
	<h1><%=num %></h1>
	<h1><%=request.getContextPath() %></h1>
	<a href="<%=request.getContextPath()%>/login">�α�������</a>
	<a href="<%=request.getContextPath()%>/signup">ȸ����������</a>
	<h1>�������� ���� ���� ${age}</h1>
	<script type="text/javascript">
		let age = 20;
		let str = `���� : \${age}`;
		console.log(str);
	</script>
	<!-- /signup�� ó���ϴ� ������ �߰��� �� signup.jsp�� �����ϴ� �۾� -->
	
</body>
</html>