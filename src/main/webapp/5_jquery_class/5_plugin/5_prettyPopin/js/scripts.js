
$(function(){
	//첫번째 <a>를 찾아주세요 prettyPopin실행
	$('a[rel="prettyPopin"]:eq(0)').prettyPopin({width:500});

	//class, name, id 아무것도 정해져 있지 않으므로 속성값과 위치로 설정해서 찾아주기
	$('a[rel="prettyPopin"]:eq(1)').prettyPopin({
		//속성명 : 속성값
		width:500,
		callback : function(){
			alert('팝업이 닫힙니다.');
		}
	});


	
})