$(document).ready(function(){

	$('.fontSize > button:eq(0)').click(function(){
			$('#txt').css({'fontSize' : '+=3px'})
		});

	$('.fontSize > button:eq(1)').click(function(){
			$('#txt').css({'fontSize' : '-=3px'})
		});

 //글씨체 조정
   $('#fontstyle').change(function(){
      $('#txt').css({
         'font-family' : $(this).val()
      });
   });


		
})