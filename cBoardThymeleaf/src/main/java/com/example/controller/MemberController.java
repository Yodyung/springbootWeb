package com.example.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.MemberVO;
import com.example.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		
		return "member/"+step;
	}
	
	
	 // 회원가입
	   @RequestMapping("/saveMember")
	   public String saveMember(MemberVO vo, Model m) {
	      
	      MemberVO idCheck = memberService.loginSuccess(vo);
	      if(idCheck == null ) {
	         memberService.saveMember(vo);
	         System.out.println("[MemberController] 회원가입 : "+vo.getUserid());
	         return "redirect:loginForm";
	      } else {
	    	 m.addAttribute("msg","(ID 중복)회원가입 실패");
	         System.out.println("[MemberController] 회원가입 실패 : "+vo.getUserid());
	         return "/member/insertMemberForm";         
	      }
	   }
	   
	   // 로그인
	   @RequestMapping("/login")
	   public String login(MemberVO vo, Model m, HttpSession session) throws Exception {
	      MemberVO result = memberService.loginSuccess(vo);
	      
	      if (result != null ) {
	         System.out.println("[MemberController] 로그인 : 성공 - "+result.getUserid());
	         
	         m.addAttribute("mem", result);
	         session.setAttribute("member", result);
	         
	         return "/member/loginSuccess";
	      }
	      else {
	    	  System.out.println("[MemberController] 로그인 : 실패");
	    	  return "/member/loginForm";
	      }
	      
	   }
	   
	   //로그아웃
	   @RequestMapping("/logout")
	   public String logout(HttpSession session) {
	      session.getAttribute("member");
	      session.invalidate();
	      
	      return "redirect:insertMemberForm";
	   }

	
}
