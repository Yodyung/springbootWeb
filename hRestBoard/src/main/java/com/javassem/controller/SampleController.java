package com.javassem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.SampleVO;

@RestController
public class SampleController {
	@GetMapping(value="getText",produces="text/plain;charset=utf-8")
	public String getText() {
		return "ㅎㄹㄴㅇㄱㄹㅇㅎㅅㄱ ";
	}
	
	@GetMapping(value="getObject")
	public SampleVO getObject() {
		SampleVO vo = new SampleVO ("ddd",22,"sdsd");
		return vo;
	}
	
	@GetMapping(value="getList")
	public List<SampleVO> getList() {
		List<SampleVO> list = new ArrayList();
		list.add(new SampleVO("홍길자",22,"오늘은 내생일"));
		list.add(new SampleVO("홍길자2",22,"오늘은 내생일2"));
		list.add(new SampleVO("홍길자3",22,"오늘은 내생일3"));
		return list;
	}
	
	@GetMapping("sample/{cate}/{cno}")
	public String[] sample(@PathVariable String cate, @PathVariable String cno) {
		return new String[] {"카테고리:"+cate, "상품번호 :" +cno};
	}
	
	@PostMapping(value="sample/data")
	public SampleVO submit(SampleVO vo) {
		System.out.println("sample data요청");
		return vo;
	}

}
