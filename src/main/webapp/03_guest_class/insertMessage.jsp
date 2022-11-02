<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 방명록 </title>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
   $('#submitBtn').click(function(){
	   //유효성 검사 틈나면 넣어놓기
	   if($("#guestName").val() == ""){
		    alert("이름을 입력해주세요.");
		    $("#guestName").focus();
		    return false;
		}
		 
		if($("input[name='password']").val() == ""){
		    alert("비밀번호를 입력해주세요.");
		    $("input[name='password']").focus();
		    return false;
		}

		if($("textarea[name='message']").val() == ""){
		    alert("메세지 내용을 입력해주세요.");
		    $("textarea[name='message']").focus();
		    return false;
		}
		
	   //버튼을 누르면 입력한 값 모두 서브밋
      $('form[name="frm"]').submit();
   })
});
</script>






</head>
<body>

   <form action="saveMessage.jsp" name="frm" method="get">
      이름 : <input type="text" id="guestName" name="guestName" required /><br/><br/>
      암호 : <input type="password" id="password" name="password" required /><br/><br/>
      메세지 : <textarea id="message" name="message" rows="3" cols="30" required></textarea><br/><br/>
      <input id='submitBtn' type="button" value="메세지 남기기" >
   </form>
</body>
</html>