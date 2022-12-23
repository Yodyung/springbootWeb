package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MemberDao;
import com.example.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao MemberDAO;
	
	@Override
	//로그인
	public MemberVO loginSuccess(MemberVO vo) {		
		System.out.println("[MemberService] loginSuccess:impl");
		return MemberDAO.loginSuccess(vo);
	}

	//회원가입
	@Override
	public int saveMember(MemberVO vo) {
		System.out.println("[MemberService] saveMember:impl");
		return MemberDAO.saveMember(vo);		
	}

	//id 중복체크
	@Override
	public MemberVO idCheck(MemberVO vo) {
		System.out.println("[MemberService] idCheck:impl");
		return MemberDAO.idCheck(vo);
	}



}
