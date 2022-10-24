$(function(){
	
	$('#hideButton').click(function(){
		$('#intro img').hide();		
	});
	
	$('#showButton').click(function(){
		$('#intro img').show();		
	});

//	$('#toggleButton').click(function(){
//		$('#intro img').toggle();
//						.fadeToggle(2000);	,	slideToggle(2000);
//	});
	
	$('#toggleButton').click(function(){
		if($('#intro img').is(':visible'))
		{
		$('#intro img').fadeOut(1000);					
		}else{
		$('#intro img').fadeIn(1000);								
		}		
	});

	//$('#toggleButton').$('#intro').hide().$('#intro').show();	
	
	//테이블 내용 중 홀수 행을 배경색 지정
	//$('#celebs table.data > tbody > tr:odd').css({'background' : 'skyblue'})
	$('#celebs table.data > tbody > tr:odd').addClass('table_striping')
	
	//마우스가 올라갔을 때 배경색이 바뀌었으면 좋겠음 마우스 다시 나오면 원상 복귀
	$('#celebs tr').hover(function(){
		$(this).addClass('td_mouseover');	
	},function(){
		$(this).removeClass('td_mouseover');
	});
	
	
});//$