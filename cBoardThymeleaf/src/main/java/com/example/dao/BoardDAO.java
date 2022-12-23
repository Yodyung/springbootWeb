package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.BoardVO;

@Mapper
public interface BoardDAO {
	public List<BoardVO> getBoardList(BoardVO vo);
	
	public BoardVO getBoard(BoardVO vo);
	
	public void saveBoard(BoardVO vo);
	
	public void deleteBoard(BoardVO vo);

	public void updateBoard(BoardVO vo);
	
	
}


/*
 *	기본적인 구조라면 인터페이스를 구현한 클래스 BoardDAOImpl.java 가 필요함
 *	그 클래스를 @Repository 로 지정해야 함
 * 	@Mapper 를 사용하면 이 단계들을 뛰어넘어 사용 가능.
 * 	이름을 맞춰주어야 사용 가능함.
 * 
 */
