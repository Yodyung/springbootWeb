package sample.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.java.Service.EmpServiceImpl;
import sample.java.domain.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	private EmpServiceImpl empService;
	
	@RequestMapping("empSelect.do")
	public String empSelect(Model m) {
		List<EmpVO> list=empService.empSelect();
		m.addAttribute("result", list);
		return "empSelect";
	}
	
	
	@RequestMapping("empDept.do")
	public void empDept(Model m) {
		List<HashMap> result = empService.empDept();
		m.addAttribute("result", result);
		for(HashMap map:result) {
			System.out.println(map);
		}
	}
	

}

/*
 * 뷰페이징 지정 방식
 * 1. 모델앤뷰
 * 2. 스트링 리턴
 * 3. 보이드 리턴 (자동으로 요청명과 동일 페이지)
*/