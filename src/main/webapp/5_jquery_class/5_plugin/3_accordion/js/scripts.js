//accordion()

$(function(){
	//커스텀 긁어와서 적용시키기
	$('.accordion').accordion({
		'heightStyle':'content',
		'event':'mouseover',
		'active':2
	});
})