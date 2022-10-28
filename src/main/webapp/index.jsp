<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 선언부 -->
<%! String msg; %>
<!-- 자바코드 기술  -->
<% msg = "하이루 하이루^ㅁ^ 룰루"; %>

<!-- html 주석 -->
<%-- jsp 주석 --%>
<% //java 주석 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 표현식  -->
메세지 : <%= msg %>
</body>
</html>