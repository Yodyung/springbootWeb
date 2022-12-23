package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.BoardVO;
import com.example.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/{step}")
	public String viewPage(@PathVariable String step) {
		
		return "board/"+step;
	}
	
	//글 목록 가져오기
	//	@RequestMapping(value="", method=RequestMethod.GET)
	@GetMapping("")
	public String getBoardList(Model m) {
		BoardVO vo = new BoardVO();		//지금은 이 객체 역할 없음
		List<BoardVO> list = boardService.getBoardList(vo);
		m.addAttribute("boardList",list);
		System.out.println("[BoardController:getBoardList] 결과 갯수 : "+list.size());
		return "/board/getBoardList";
	}
	
	//선택한 게시글 가져오기
	@GetMapping("/{seq}")
	public String getBoard(Model m, BoardVO vo) {
		BoardVO list = boardService.getBoard(vo);
		m.addAttribute("board",list);
		System.out.println("[BoardController:getBoard] 글 번호 : "+list.getSeq());		
		return "/board/getBoard";
	}

	//입력 폼 출력
	@GetMapping("/write")
	public String saveBoard() {
		return "/board/insertBoard";
	}	
	
	//입력하기
	@PostMapping("/write")
	public String saveBoard2(BoardVO vo) {
		boardService.saveBoard(vo);
		System.out.println("[BoardController:saveBoard] 글 등록 완료");
		
		return "redirect:/board";
	}

	//글 수정
	@PutMapping(value="/board/{seq}")
	public String updateBoard(BoardVO vo) {
		boardService.updateBoard(vo);
		System.out.println("[BoardController:updateBoard] 글 수정 완료");
		
		return "redirect:/board";
	}	
	
	//글 삭제
	@DeleteMapping(value="/board/{seq}")
	public String deleteBoard(BoardVO vo) {
		boardService.deleteBoard(vo);
		System.out.println("[BoardController:deleteBoard] 글 삭제 완료");
		
		return "redirect:/board";
	}
	
	
}
