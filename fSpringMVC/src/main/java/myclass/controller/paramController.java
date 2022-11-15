package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import myclass.model.MemberVO;

@Controller
public class paramController {
	
	@RequestMapping("param.do")
	public String test(MemberVO vo) {
		return "param";
	}

}
