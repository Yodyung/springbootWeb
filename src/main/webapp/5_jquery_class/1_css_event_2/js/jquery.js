
/*
$('.header > menu > li.rollover:eq(1)').click(function(){
		$('.header > menu > li.rollover:eq(1)').addClass('header')
	});
*/
	
$(function(){
   //이미지에 마우스를 올리거나 내릴 때 : hover( function, function )
   $('img').hover(
   /*마우스를 올렸을 때*/
   function(){
      var src = $(this).attr('src');                  //이미지 주소값 불러와서
      $(this).attr('src',src.replace('off','on'));      //off를 on으로 바꿔줌
   },
   /*마우스를 내렸을 때*/
   function(){
      var src = $(this).attr('src');                  //이미지 주소값 불러와서
      $(this).attr('src',src.replace('on','off'));      //on을 off로 바꿔줌
   })
})