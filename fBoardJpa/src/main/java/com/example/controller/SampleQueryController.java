package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.BoardVO;
import com.example.persistence.SampleQueryRepository;

@Controller
public class SampleQueryController {
	
	@Autowired
	private SampleQueryRepository repo;
	
	//제목검색
	@RequestMapping("/sampleQuery")
	public String sampleQuery(Model m) {
		List<BoardVO> result = repo.findBoardVOByTitle("123");
		m.addAttribute("boardList", result);
		return "board/getBoardList";
	}

	// 페이징하기!!!! 쉽게 할 수 있다!!
	@RequestMapping("/sampleQuery2")
	public String sampleQueryDESC(Model m) {
		Pageable paging = PageRequest.of(1, 3);
		List<BoardVO> result = repo.findAll(paging);
		m.addAttribute("boardList", result);
		return "board/getBoardList";
	}
}
