$(function(){
	//나오지 않던 앤쳐 위에 보이게 만들어 주기
	var topDiv  = $('.tabSet');
	//tabSet class밑에 있는 ul.tabs 의 a 값
	var anchors = topDiv.find('ul.tabs a');
	//밑의 내용 모두 보이지 않게 하기 위한 변수 저장
	var panelDivs= topDiv.find($('div.panels div.panel'));
	
	anchors.show();
	panelDivs.hide();
	
	//css on클래스가 눌려져 있는 앤쳐 찾아서 변수 저장
	var lastanchors = anchors.filter('.on');
	//lastanchors의 바로 밑에 있는 href값 변수에 저장
	var lastPanel = $(lastanchors.attr('href'));
	//alert(lastPanel);
	lastPanel.show();
	
	//n번째 클릭 시 이벤트 발생
	anchors.click(function(){
	//눌려진 애를 변수에 하나 저장
		var currentAnchor = $(this);
	//눌려진 애의 href값을 하나 저장
		var currentPanel  = $(currentAnchor.attr('href'));
	
	//마지막에 눌려있던 패널 감추기	
	lastPanel.hide();
	//최근 선택한 앤쳐의 패널만 보이기
	currentPanel.show();
	//마지막 앤쳐에 눌려있던 흰색 배경  css클래스 제거
	lastanchors.removeClass('on');
	//최근에 누른 앤쳐에 흰색 배경 css 클래스 추가
	currentAnchor.addClass('on');
	
	//마지막에 눌려져 있었던 값 변수에 최근 값을 저장(다음 클릭시 자동으로 중첩,누적되지 않고 계산 되게)
	lastanchors = currentAnchor;
	lastPanel = currentPanel;
	})
	
	
	
})