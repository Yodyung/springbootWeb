<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="temp.*" %>
<%

	//1 이전 폼의 사용자 입력값을 얻어오기
	String empno = request.getParameter("empno");
	String ename =request.getParameter("ename");
	String deptno =request.getParameter("deptno");
	String job =request.getParameter("job");
	String sal =request.getParameter("sal");
	
	//2 empvo 멤버변수에 지정
	EmpVO vo=new EmpVO();
	vo.setEmpno(Integer.parseInt(empno));
	vo.setEname(ename);
	vo.setDeptno(Integer.parseInt(deptno));
	vo.setJob(job);
	vo.setSal(Integer.parseInt(sal));
	
	//3 db에 보내기(singleton 패턴으로 만들기(매번 객체 생성 하는것이 아닌 1번만 열어놓고 그 객체 계속 사용하기))
	//			클래스 명으로 접근.함수명();
	EmpDAO dao= EmpDAO.getInstance();
	dao.insert(vo);

%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 사원등록 </title>
</head>
<body>
	
	 <h2> 성공적으로 입력되었는지 DB에서 확인합니다.</h2>
	입력한 empno : <%= empno %> <br/>
	입력한 ename : <%= ename %>	<br/>
	입력한 deptno : <%= deptno %>	<br/>
	입력한 job : <%= job %> <br/>
	입력한 sal : <%= sal %>
</body>
</html>