
$(function(){
	
	//이름이 달린 제목칸에 커서를 올리면 손가락 모양이 나오게
	$('#bio h3').css({'cursor':'pointer'});
	//밑의 내용을 다 감추고
	$('#bio div').hide();
	//위의 제목만 보이게 설정
	$('#bio h3').show();
	//제목 클릭 했을 시 이벤트 걸리게 함
	$('#bio h3').click(function(){
		//모든 내용 다 감추고	
		$('#bio div').hide();
		//$(this).next().show();
		//클릭한 창의 하위만 열리게 설정
		$(this).next().animate({'height':'toggle'},500,'easeOutBounce');
	})
	

});