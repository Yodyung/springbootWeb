package com.example.controller;

import org.slf4j.Logger;			//logger 꼭 이걸로 임포트하기
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	//private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@RequestMapping("/insertBoard")
	public void insertBoard() {
		//logger.info("[ insertBoard ]");
	
	}
	
	
	@RequestMapping("/getBoardList")
	public void getBoardList() {
		//logger.info("[ getBoardList ]");
		
	}



}
