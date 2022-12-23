package com.example.service;

import java.util.List;

import com.example.domain.BoardVO;
import com.example.domain.MemberVO;

public interface MemberService {
	//로그인	
	public MemberVO loginSuccess(MemberVO vo);

	//회원가입 
	public int saveMember(MemberVO vo);

	//아이디 중복체크
	public MemberVO idCheck(MemberVO vo);
		
}
