package com.example.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.BoardDAO;
import com.example.dao.FileDAO;
import com.example.domain.BoardVO;
import com.example.domain.FileVO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private FileDAO fileDAO;
	
	//보드 목록 가져오기
	@Override
	public List<BoardVO> getBoardList(BoardVO vo){
		List<BoardVO> list = boardDAO.getBoardList(vo);
		System.out.println("[BoardService] 리스트 갯수 : "+list.size());
		return list;
	}

	//선택한 보드 가져오기
	@Override
	public HashMap getBoard(BoardVO vo) {
		//서비스 단에 안만들어도 됨 어차피 겟보드 안에 들어갈거니까~
		boardDAO.updateCnt(vo);
		HashMap list = boardDAO.getBoard(vo);
		System.out.println("[BoardService] getBoard : impl ");
		return list;
	}

	//작성한 보드 저장하기
	@Transactional
	@Override
	public void saveBoard(BoardVO bvo, FileVO fvo) {
		if(fvo!=null) {
			fileDAO.insertFile(fvo);
			bvo.setFileId(fileDAO.selectId());
		}
		boardDAO.saveBoard(bvo);
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
