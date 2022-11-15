package com.javassem.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.javassem.domain.MemberVO;
import com.javassem.service.MemberService;

@Controller
@RequestMapping("user")
public class MemberController {
	
	@Autowired
	private MemberService memberservice;
	
	//매번 매핑할 필요 없이 그냥 그 찍은 제목의 연결 페이지로 이동한다.
	@RequestMapping("/{url}.do")
	public String userJoin(@PathVariable String url) {
		System.out.println("경로 : "+url);
		return "user/"+url;
	}
	
	/*
	 * 요청 : /user/userInsert.do
	 * 뷰페이지 : user/userJoin_ok.jsp
	 */
	@RequestMapping("userInsert.do")
	public String userInsert(MemberVO memberVO, Model m) {
		
		int result=memberservice.userInsert(memberVO);
		String message="가입되지 않았습니다..";
		if(result==1) message = memberVO.getUserName()+"님! 가입을 축하합니다^-^";
		m.addAttribute("message", message);
		
		return "user/userJoin_ok";
	}
	
	
	@RequestMapping("login.do")
	//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	//세션 사용 > 인자에 HttpSession 변수 선언
	public String userJoin(MemberVO memberVO, HttpSession session) {
		MemberVO result = memberservice.idCheck_Login(memberVO);
		if(result==null||result.getUserId()==null) {
			return "/user/userLogin";
		}else {
			//로그인 성공
			session.setAttribute("login", memberVO.getUserId());
			
			return "/user/login_ok";			
		}
	}
	
	@RequestMapping(value={"idCheck.do"}, produces = "application/text;charset=utf-8")
	//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
	//일반 요청 함수에서 String 리턴 : 뷰페이지 지정 
	//이 요청에 Ajax 통신에 의해 값을 전송해야 함, Ajax 쓸 때는 항상 이 골뱅이 써야함
	@ResponseBody
	public String checkId(MemberVO memberVO) {
		MemberVO result = memberservice.idCheck_Login(memberVO);
		String message="사용 간응한.";
		if(result !=null) message = "중복한.";
		
		System.out.println("message :"+message);
		return message;
		}
}
