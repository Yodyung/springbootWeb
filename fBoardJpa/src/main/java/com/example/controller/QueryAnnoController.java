package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.persistence.QueryAnnoRepository;

@Controller
public class QueryAnnoController {
	
	@Autowired
	private QueryAnnoRepository repo;
	
	//어려운 쿼리, 설정해서 내림차순으로 설정해주기
	@RequestMapping("queryAnno")
	public String queryAnno(Model m) {
		m.addAttribute("boardList",repo.queryAnnotation(""));
		return "/board/getBoardList";
	}

	//어려운 쿼리, 설정해서 내림차순으로 설정해주기
	@RequestMapping("queryAnno2")
	public String queryAnno2(Model m) {
		m.addAttribute("boardList",repo.queryAnnotation2("123"));
		return "/board/getBoardList";
	}

	//어려운 쿼리, 설정해서 내림차순으로 설정해주기
	@RequestMapping("queryAnno3")
	public String queryAnno3(Model m) {
		m.addAttribute("boardList",repo.queryAnnotation3("123"));
		return "/board/getBoardList";
	}

}
