<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPL 문법</title>
</head>
<body>
<!-- 변수 선언 -->
<c:set var='gender' value='male'/>
<!-- if 문 -->
<c:if test="${gender eq 'male'}">당신은 남성</c:if>
<c:if test="${gender eq 'female'}">당신은 여성</c:if>

<c:set var='age'>10</c:set>
<c:choose>
	<c:when test="${age lt 10}">어린이입니다.</c:when>
	<c:when test="${age lt 20 and age ge 10}">청소년입니다.</c:when>
	<c:otherwise>성인입니다.</c:otherwise>
</c:choose>
<hr/>

<!-- 사실 바로 밑 코딩 필요 없음 -->
<c:set var='sum' value='0'></c:set>
<c:forEach var='i' begin='1' end='100'>
	<c:set var='sum' value='${sum+i}'></c:set>
</c:forEach>
1~100까지의 합 : ${sum} <hr/>

<!--  1~100 짝수 홀수 -->


<c:set var = 'sum' value='0'/>
<c:forEach var = 'i' begin='1' end = '100'>


   <c:if test = "${ i%2==0 }">
      <c:set var='sume' value ='${sume+i}'/>
   </c:if>
   <c:if  test = "${ i%2==1 }">
      <c:set var='sumo' value ='${sumo+i}'/>
   </c:if>
   
 
   <c:choose>
      <c:when test = "${ i mod 2 eq 0 }">
            <c:set var='even' value ='${even+i}'/>
         </c:when>
         <c:otherwise>
            <c:set var='odd' value ='${odd+i}'/>
      </c:otherwise>
   </c:choose>

</c:forEach>

<hr/>
1~100까지의 짝수합 : ${even}<br/>
1~100까지의 홀수합 : ${odd}<hr/>
<hr/><hr/><hr/><hr/>

1~100까지의 짝수합 : ${sume}<br/>
1~100까지의 홀수합 : ${sumo}

<hr/>

</body>
</html>


<!-- 
	JSP 기초 문법
	< %@ %> : 설정
				-page 설정
				-include 설정
				-taglib : JSTL 사용할 때 필요함
	
	< %! %> : 선언(변수,함수)
	< % %>  : 설정(자바코드)
	< %= %> : 출력(화면결과 출력) ==> EL
	
	


 -->