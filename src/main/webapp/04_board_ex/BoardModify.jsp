<%@page import="org.apache.catalina.filters.SetCharacterEncodingFilter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board_ex.model.*,board_ex.service.*" %>

<%
	// 0. 넘겨받는 데이타의 한글 처리
	request.setCharacterEncoding("utf-8");
%> 

<!-- 1. 이전 화면의 입력값을 넘겨받아 BoardRec 객체의 각 멤버변수로 지정 -->
<jsp:useBean id="rec" class="board_ex.model.BoardVO">
	<jsp:setProperty name="rec" property="*"/>
</jsp:useBean>
	
<%
	// 2. Service에 update() 호출하여 레코드 수정
	int result=ModifyArticleService.getInstance().update(rec);

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판글수정</title>
</head>
<body>

<% if( result != 0) { %>
   <jsp:forward page="BoardView.jsp?rec=<%=rec.getSeq()%>"></jsp:forward>
         
   <% } else { %>
         암호가 잘못 입력 되었습니다.
	<a href='BoardModifyForm.jsp?id=<%=rec.getSeq() %>'>[돌아가기]</a>
   <% } %>

</body>
</html>