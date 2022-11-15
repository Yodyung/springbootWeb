<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- session이라고 쓰면 다른 지정변수와 이름 겹치기 때문에 세션에서 불러오려면 sessionScope라고 해야함~ -->
	${sessionScope.login}님 로그인 성공하였습니다.<hr>
	
	<a href=''>모든 회원 정보 보기 </a>
	
</body>
</html>