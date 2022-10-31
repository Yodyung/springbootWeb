<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 이전 화면에서 사용자 입력값을 얻어와서 리퀘스트 겟 파라메타로 받고 화면 출력 -->
    <% 
    //한글 깨지지 않게 인코딩 설정 해주기
    request.setCharacterEncoding("utf-8");
    //사용자 입력값 request로 받아오기
    String name = request.getParameter("name");
    //getParameterValues는 여러개로 생각해 처음부터 []배열로 받아준다.
    String [] pet= request.getParameterValues("ani");
	//배열을 받아서 출력할 변수 선언해주고 for문으로 순서대로 넣어주기
    String choosepet="";
    for(int i=0; pet!=null && i<pet.length; i++){
    	choosepet += pet[i]+" ";
    }
    
    %>
이름 : <%=name %>
동물 : <%=choosepet %>

</body>
</html>