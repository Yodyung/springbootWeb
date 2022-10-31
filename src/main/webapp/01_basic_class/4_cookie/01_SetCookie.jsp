<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>		


<%	
	// 1. Cookie 객체 생성	//id가 다르면 중복되지 않고 여러개의 쿠키가 뜬다.
	Cookie c = new Cookie("idid", "sarang");
	// 2. 속성 부여 (초단위)
	c.setMaxAge(1*60*3);	//3분, 180으로 주는것보다 이렇게 하는게 더 빠름
	// 3. 클라이언트에 쿠키 전송
	response.addCookie(c);
%>

<html>
<head><title>쿠키</title></head>
<body>

<b>Simple Cookie Example</b><hr>

<br><a href="01_GetCookie.jsp"> 쿠키검색 </a>

</body></html>