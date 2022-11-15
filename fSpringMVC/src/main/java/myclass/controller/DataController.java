package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataController {

	@RequestMapping("insert.do")
	public String test() {
		System.out.println("연결 1");
		//********************************
		//data 안넣었으니까 안넘어옴
		//return "select";
		//********************************
		//리다이렉팅!!!
		return "redirect:select.do";
	}

	@RequestMapping("select.do")
	public void test2(Model m) {
		System.out.println("연결 2");
		m.addAttribute("info","DB에서 넘어온 값");
	}
}
