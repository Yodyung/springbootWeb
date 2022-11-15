package com.javassem.exeception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice("com.javassem")
public class ProjectExceptionHandeler {
	
	//구체적인 예외를 작성
	@ExceptionHandler
	public String handlerException(Exception e,Model m) {
		
		m.addAttribute("exception", e);
		
		return "error/TransErrorPage";
	}
}
