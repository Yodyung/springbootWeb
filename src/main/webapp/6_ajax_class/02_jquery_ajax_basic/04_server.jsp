<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%	// 1. 이전 화면에서 넘겨받은 데이타
	// request.getParameter로 넘겨받기
	String cate = request.getParameter("cate");
	String name = request.getParameter("name");
	
	// 2. 다시 화면으로 보낼 데이터 구성
	String result ="";
	
	result += "{";
	result += "'first' : "+ "'changed_"+cate+"_by_server" +"',";
	result += "'second' : "+ "'from_"+name+"_server'";
	result += "}";
	
	//*************************중요************************************
	//추후에는 json 관련 라이브러리를 이용하여 구조 생성한다. <(이름=밸류 이름=밸류) 구조>
	
	System.out.println(result);
	out.write(result);	
%> 