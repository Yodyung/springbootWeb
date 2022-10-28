$(function(){
  //(1) 오늘 날짜 출력 (10점)
  var d = new Date();
  $(".year").text(d.getFullYear());
  $(".month").text(d.getMonth()+1);
  $(".date").text(d.getDate());
  
  //(2) 포커스 가면 ‘검색어를 입력하세요’를 안보이고 다시 포커스가 없으면 다시 출력 (10점)
  //포커스에 맞춰지면 이미지 사라지기
   $('#keyword').focus(function(){
   $('#keyword').css("background-position","0 -500px");
      
  //포커스에 벗어나면 이미지 나타나기
   })
   $('#keyword').blur(function(){
      $('#keyword').css("background-position","0 0")
   })
  
  //(3) 탭팬 구현 (10점)
      $('#tabmenu>dt>a>img').click(function() {
		//이미지 클릭했을 시 검정 배경에서 흰색 배경으로 
           var src = $(this).attr('src');
            $(this).attr("src", src.replace("out","over"));
        //이미지 클릭하면 클릭하기 전 선택되어 있던 이미지를 흰색에서 검정색 배경으로      
            var ori=$('#tabmenu>dt[name="on"]>a>img')
            ori.attr("src",ori.attr("src").replace("over","out"));
         })
         
      $('#tabmenu dt').click(function(){
		//전체를 숨겼다가 클릭한 dt의 dd를 보여준다.
         $('#tabmenu dd').hide();
         $(this).next('dd').show();
         //위에서 이미지를 바꾼 다음 [name="on"]을 옮겨준다
         $('#tabmenu dt[name="on"]').removeAttr('name');
         $(this).attr('name','on');
      });
  
  //(4) 이미지슬라이드 구현 (10점)
	$('#best_bg > ul').bxSlider({
     auto: true,
     autoControls: true,
     stopAutoOnClick: true,
     pager: true,
     slideWidth: 600,
     minSlides: 5,
     maxSlides: 5,
     slideMargin: 10
   });
  
  // (5) [로그인]을 누르면 로그인 창이 보이고 [Close]를 누르면 다시 안 보임  (20점)     
   $('img[alt="로그인"]').click(function(){ // 로그인 누르면 로그인 창 보임
      $('#login_f').css("top","0")
   
    $('img[alt="닫기버튼"]').click(function(){ // 로그인 닫기 누르면 로그인 창 안보임
      $('#login_f').css("top","-500px")
      })
   })
   
  //(6) [전체메뉴]를 선택하면 전체메뉴가 보이고 [Close] 누르면 다시 안 보임 (20점)
   $('img[alt="전체메뉴"]').click(function(){ // 전체메뉴 누르면 전체메뉴 창 보임
   	//alert('dd')
      $('#total_menu').show();
   
    $('img[alt="전체메뉴 닫기"]').click(function(){ // 전체메뉴 닫기 누르면 전체메뉴 창 안보임
    //alert('닫기누름')
      $('#total_menu').hide();
      })
   })
   
  //(7) 그 외 추가적으로 구현하면 해당 화면 캡쳐하고 코드를 작성합니다. (20점)
  //메인의 이지스 퍼블리싱 로고 누르면 페이지 새로고침
  $('img[alt="이지스 퍼블리싱"]').click(function(){
	location.reload();
	})
	
	//프린트 버튼 누르면 출력하기 나옴
	$('img[src="images/util_print.gif"]').click(function(){
		window.print();
	})
	
	$('.zoom_in>img').click(function(){
		alert('ss')
	})
	$('.zoom_return>img').click(function(){
		alert('ss')
	})
	$('.zoom_out>img').click(function(){
		alert('ss')
	})
  
	
	
	
	
})