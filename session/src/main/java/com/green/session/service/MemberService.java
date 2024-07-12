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
	public int memberRegister(Member member) {
		int result = dao.memberInsert(member);
		if(result==0) {
			System.out.println("Join 실패");
		}else {
			System.out.println("Join 성공");
		}
		return result;
	}

	@Override
	public Member memberSearch(Member member) {
		Member mem = dao.memberSelect(member);
		
		if(mem==null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
		
		return mem;
	}

	@Override
	public int memberModify(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
