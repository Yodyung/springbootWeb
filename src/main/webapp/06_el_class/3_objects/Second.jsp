<%@ page contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title> 데이타 받는 페이지 </title>
</head>
<body>
<!-- String param= request.getParameter("data"); -->

파라메터 값(전 페이지에서 넘어오는 값) : ${param.data} <br/> 

<!-- ************기본 세션이랑 겹쳐서 이름을 바꿔서 써야함************* -->
세션의 값 : ${sessionScope.login} <br/>

<!-- .value 값 가져와야함 안붙히면 주소값 가지고 옴 -->
쿠키의 값 : ${cookie.isFlag.value} <br/>


<hr>


</body>
</html>