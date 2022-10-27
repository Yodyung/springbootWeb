

$(function(){
	//signup 아이디를 가진div의 자식 form 찾기
	$('#signup > form').validate({
		rules :{
			name : {required : true},
			email : {required : true,
					 email : true
					},
			website : {url : true},
			password : {minlength : 6, maxlength:12},
			//비밀번호 확인 {equalTo : 같아야 할 아이디값}
			passconf : {equalTo : '#password'}
			
		},
		success : function(label){
			label.addClass('valid');
			label.text('성공~~');
		}
		
	}); //validate
	
	//전체 체크하거나 전체 해제 체크박스
	//.check-all을 클릭했을 시 이벤트 발생
	$('.check-all').click(function(){
	//.check-all을 클릭하면 agree 클래스 모두 checked (아닐시 체크 해제)
	//.prop( propertyName, value )
		$('.agree').prop('checked', $('.check-all').is(':checked'));		
	})
	
	
	//.agree을 클릭했을 시 이벤트 발생
	 $('.agree').click(function(){
         //$('input:checkbox[name="agree1"]').prop('checked',false);
         //하나라도 클릭했을 시 .check-all 체크 해제
         $('.check-all').prop('checked',false);
      })

	
	
})