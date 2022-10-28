<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//이전 화면에서 사용자 입력 값들을 얻어오기
	//request.getParameter(""); >> 값을 하나씩 얻어오는것
	//request.getParameterValues(""); >> 값을 통째로 얻어오는것

	String name = request.getParameter("name");
	String gen =request.getParameter("gender");
	String job =request.getParameter("occupation");
	String []hobby=request.getParameterValues("hobby");
	String hobbyTxt = "";
//	if(hobby !=null){
		for(int i =0; hobby != null && i<hobby.length; i++){
			hobbyTxt +=hobby[i]+"/";
		}//for
//	}//if

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>폼의 입력값 넘겨받아 처리</h2>
	입력한 이름 : <%= name %> <br/>
	입력한 성별 : <%= gen %>	<br/>
	입력한 직업 : <%= job %>	<br/>
	입력한 취미 : <%= hobbyTxt%>

</body>
</html>