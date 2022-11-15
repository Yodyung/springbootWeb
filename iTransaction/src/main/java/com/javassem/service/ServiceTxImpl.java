package com.javassem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javassem.dao.CustomerDao;
import com.javassem.dao.MemberDao;
import com.javassem.vo.CustomerVO;
import com.javassem.vo.MemberVO;

@Service
public class ServiceTxImpl implements ServiceTx{

	@Autowired
	private MemberDao mdao;
	@Autowired
	//주입은 각자 한개씩 해야함
	private CustomerDao cdao;

	
	//#########
	@Transactional
	@Override
	public void addAll(CustomerVO cvo, MemberVO mvo) throws Exception {
		mdao.insertMember(mvo);
		System.out.println("MemberOK");
		cdao.insertCustomer(cvo);
		System.out.println("CustomerOK");
		
	}
}
