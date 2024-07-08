package com.green.session.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.session.dao.MemberDao;
import com.green.session.dto.Member;
@Service
public class MemberService implements IMemberService{

	@Autowired
	MemberDao dao;
	
	@Override
	public void memberRegister(Member member) {
		dao.memberInsert(member);
	}

	@Override
	public Member memberSearch(Member member) {
		Member mem = dao.memberSelect(member);
		return mem;
	}

}
