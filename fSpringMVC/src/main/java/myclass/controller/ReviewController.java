package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// /review/modelandview.do

/*
 * 모델(데이터)를 뷰페이지로 전송
 * 
 * 1. ModelAndView
 * 			-addObject()
 * 2. Model < 인자에 선언만 하기
 * 			-SetAttribute()
 * 			****
 * 
 */


@Controller
@RequestMapping("/review")
public class ReviewController {
	
	@RequestMapping("/modelandview.do")
	public ModelAndView test() {
		//1. madelAndView 뷰페이지 지정
		System.out.println("요청 받음1");
		ModelAndView mv= new ModelAndView();
		//데이터 & 뷰
		mv.setViewName("review/void");
					//"WEB-INF/views/+review/void+.jsp"
		mv.addObject("greeting", "오늘은 행복해용");
		mv.addObject("test", "백배로데이");
		return mv;
	}

	@RequestMapping("/string.do")
	//************************************
	//Model : view 단으로 데이터를 전송 객체
	//			===> 인자에 지정, ()안에 들어있는 애를 view단으로 날려줌
	public String test2(Model m) {
		//2. 문자열 리턴 뷰페이지 지정
		System.out.println("요청 받음2");
		m.addAttribute("greeting", "오늘은 행복해용");
		m.addAttribute("test", "백배로데이");
		return "review/void";
	}
	
	@RequestMapping("/void.do")
	public void test3(Model m) {
		//3. void 리턴 뷰페이지 지정
		//	--> 요청명과 동일한 뷰페이지로 자동 지정
		System.out.println("요청 받음3");
		m.addAttribute("greeting", "오늘은 행복해용");
		m.addAttribute("test", "백배로데이");
	}

}
