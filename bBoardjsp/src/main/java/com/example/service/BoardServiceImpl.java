package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BoardDAO;
import com.example.domain.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	//보드 목록 가져오기
	@Override
	public List<BoardVO> getBoardList(BoardVO vo){
		List<BoardVO> list = boardDAO.getBoardList(vo);
		System.out.println("[BoardService] 리스트 갯수 : "+list.size());
		return list;
	}

	//선택한 보드 가져오기
	@Override
	public BoardVO getBoard(BoardVO vo) {
		BoardVO list = boardDAO.getBoard(vo);
		System.out.println("[BoardService] getBoard : impl ");
		return list;
	}

	//작성한 보드 저장하기
	@Override
	public void saveBoard(BoardVO vo) {
		boardDAO.saveBoard(vo);		
		System.out.println("[BoardService] saveBoard : impl ");
	}

	//선택한 보드 삭제하기
	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
		System.out.println("[BoardService] deleteBoard : impl ");
	}

	//선택한 보드 업데이트하기
	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
		System.out.println("[BoardService] deleteBoard : impl ");
	}



}
