package myclass.controller;

/*
 * 뷰페이징 방식
 * 
 * 1. ModelAndView 에 지정
 * 		(setViewName() 이용)
 * 
 * 2. String return인 경우 > 이 페이지에 있는 방식
 * 			리턴되는 문자열이 뷰 페이지명
 * 
 * 3. void return 경우
 * 			요청명과 동일한 뷰페이지 지정
 */


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myclass.model.MemberVO;

@Controller
@RequestMapping("re")
public class RequestMappingController {
	
	@RequestMapping(value={"/a.do","/b.do"})
	public String test() {
		System.out.println("a.do, b.do 요청");
		return "home";
		//WEB-INF/views+home+.jsp
		//String return인 경우 문자열을 의미하는게 아닌 view 페이지. 
	}
	
	@RequestMapping(value="/c.do")
	public void test2(String id) {
		System.out.println("c.do 요청"+id);
	}

	@RequestMapping(value="/request.do", method=RequestMethod.POST)
	public void test3( MemberVO vo) {
		System.out.println("request.do 요청");
		System.out.println(vo.getName());
		System.out.println(vo.getId());
	}
}
