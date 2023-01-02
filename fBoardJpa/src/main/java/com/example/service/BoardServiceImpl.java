package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.BoardVO;
import com.example.persistence.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository boardRepo;
	
	//게시판 글 목록 가져오기
	@Override
	public List<BoardVO> getBoardList(BoardVO vo){
		return (List<BoardVO>)boardRepo.findAll();
	}

	//게시판에 글 저장하기
	@Override
	public void saveBoard(BoardVO vo) {
		boardRepo.save(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardRepo.deleteById(vo.getSeq());
	}

	//글 수정하기
	@Override
	public void updateBoard(BoardVO vo) {
		BoardVO result = boardRepo.findById(vo.getSeq()).get();
		result.setTitle(vo.getTitle());
		result.setContent(vo.getContent());
		
		boardRepo.save(result);
	}

	//게시판 글 상세보기
	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardRepo.findById(vo.getSeq()).get();
	}
	
	
}
