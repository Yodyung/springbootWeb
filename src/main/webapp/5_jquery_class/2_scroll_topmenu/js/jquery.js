$(document).ready(function(){
	
	$('p#intro').animate({
		padding : '20px',
		fontSize : '30px'
	},2000);
	
	$('#navigation li').hover(function(){
		$(this).animate({
			paddingLeft : '+=15px'},200);
	},function(){
			
		});
		
	//고정 퀵 메뉴 원리 (따라오는 것이 아닌 그 위치에 고정 되어 있는 느낌)
	$(window).scroll(function(){
		$('#navigation').css({'top' : $(document).scrollTop()});
	})	;
	
	
	
	
});