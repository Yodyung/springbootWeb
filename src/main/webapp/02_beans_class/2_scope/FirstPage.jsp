<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<% 
	//--------------------------- 값 지정
	pageContext.setAttribute("name", "KIM");		//아무 의미 없음 이 페이지에만 적용
	
	request.setAttribute("name", "SEUNGMIN");		//포워딩이 중요. 하나의 HTTP 요청을 처리할 때 사용되는 영역
													//하나의 요청에 값을 공유하기 때문에 자주 쓰임
													
	session.setAttribute("name", "DOKDO");			//어플리케이션보단 적은 범위, 클라이언트가 브라우저 닫기 전까지(로그인 정보)
													//하나의 웹 브라우저와 관련된 영역, 같은 웹 브라우저면(크롬끼리) 공유 가능(request는 안됨)
													
	application.setAttribute("name", "KOREA");		//모든 사용자들이 공유할 수 있음, 그치만 안 쓰임
	//application.log("FirstPage.jsp : " + pageContext.getAttribute("name") + "님 접속");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 첫번째 페이지 </title>
</head>
<body>

하나의 페이지 속성 : <%= pageContext.getAttribute("name") %> <br>
하나의 요청 속성 :	 <%= request.getAttribute("name") %> <br>
하나의 세션 속성 :	 <%= session.getAttribute("name") %> <br>
하나의 어플리케이션 속성 : <%= application.getAttribute("name") %> <br>

<!-- #############  -->
<!-- 
<a href="SecondPage.jsp">다음</a>
 -->
<!-- 
	******************************
	request.getParameter(""); : 클라이언트에서 넘어오는 데이터 받을 때
	******************************
	request.getAttribute(""); : request.setAttribute("");에 저장(서버측에서 사용하니까)
 -->



<!-- 페이지 forward 이동된다면  -->
<jsp:forward page="SecondPage.jsp"/>
		

</body>
</html>