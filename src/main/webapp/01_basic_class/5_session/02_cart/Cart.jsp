<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*" %>
<!-- java.util.* 을 사용하려면 교차되는 변수 이름이 모두 같아야 한다. -->
<%@ page import="shop.cart.Goods" %> 
<%
	String id="";
	String name ="";
	int price=0;

	ArrayList<Goods> glist = null;

	//0. 한글 안읽힐 수 있으니 utf-8 인코딩해주기
	request.setCharacterEncoding("utf-8");
	
	// 1. Form의 값(hidden값) 넘겨받기 ( id, name, price )
	id=request.getParameter("id"); 						//request로 id, name, price 값 넘겨받기
	name=request.getParameter("name"); 
	price=Integer.parseInt(request.getParameter("price")); 

	
	// 2. 세션의 cart 속성을 얻어온다. 
	Object cart= session.getAttribute("cart");			//session에서 cart속성을 얻어와 저장하는데 Object로 받아주어야 함.

	// 3. 만일 null이면 ArrayList 객체 새로 생성하고 그렇지 않으면 ArrayList 변수(glist)에 지정
	   if(cart==null){
	      glist = new ArrayList <Goods>();				//객체 새로 생성해서 열어주기
	   }else {
		  glist = (ArrayList<Goods>)cart;				//ArrayList 변수(glist) = (어레이리스트굿즈타입인)cart 라고 선언
	   }												//객체 생성만 지정해주므로 add를 쓰지 않고 glist=cart만 선언해준다
	
	// 4. 1번의 값들을 Goods 객체로 생성후 ArrayList 에 추가
														//Goods 객체 새로 생성해주고
		glist.add(new Goods(id,name,price));			//glist에 goods객체 더해주기
	
	// 5. 세션에 cart 라는 이름에 ArrayList를 저장
		session.setAttribute("cart", glist);			//바뀐 값을 다시 세션에 저장하기

%>		 
		 
<html> 
<body bgcolor=white>
<%= name %> 을 구입하셨습니다.
 
<br><br><br>

<table>
<tr bgcolor="#e7a068"><th>상품명</th>
<th>가격</th></tr>

<%
		int n = glist.size(); 
		int sum = 0; 
		for(int i=0; i < n; i++) { 
			Goods goods = (Goods) glist.get(i); 
			int gp = goods.getPrice(); 
			sum += gp; 
%>
			<tr><td align="center"> <%= goods.getName() %> </td>
				<td align="right"> <%= gp %> </td></tr>
<%
		} 		 
%>

<tr bgcolor="#e7a068"><td colspan="2" align="right"> 총액 : <%= sum  %></td></tr>
</table>

<br/><br/>
[<a href="wshop.jsp">쇼핑하러 가기</a>]
[<a href="Buy.jsp">구입하기</a>]

</body></html>

