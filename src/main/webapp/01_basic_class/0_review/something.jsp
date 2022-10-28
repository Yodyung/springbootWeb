<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.dao.*" %>    
    
<%
//0 한글 처리 (한글처리 해주지 않으면 깨져서 들어감)
	request.setCharacterEncoding("utf-8");

//1 이전 폼의 사용자 입력값을 얻어오기
	String realname = request.getParameter("realname");
	String nickname =request.getParameter("nickname");
	String myemail =request.getParameter("myemail");
	String myage =request.getParameter("myage");
	
//2 empvo 멤버변수에 지정
	memberVO vo=new memberVO();
	vo.setName(realname);
	vo.setEname(nickname);
	vo.setEmail(myemail);
	vo.setAge(Integer.parseInt(myage));
	
//3 db에 보내기(singleton 패턴으로 만들기(매번 객체 생성 하는것이 아닌 1번만 열어놓고 그 객체 계속 사용하기))
	//			클래스 명으로 접근.함수명();
	memberDAO dao= memberDAO.getInstance();
	dao.insert(vo); 

//출력은 알아서

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB 확인하러가자</title>
</head>
<body>

<h2> DB에서 확인 PLZ </h2>
	입력한 이름 : <%= realname %> <br/>
	입력한 별명 : <%= nickname %>	<br/>
	입력한 이메일 : <%= myemail %>	<br/>
	입력한 나이 : <%= myage %> <br/>
</body>
</html>