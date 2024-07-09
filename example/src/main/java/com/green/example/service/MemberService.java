package com.green.example.service;

import java.lang.reflect.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.example.dao.MemberDAO;
import com.green.example.dto.MemberDTO;

@Service
public class MemberService implements IMemberService{
	@Autowired
	MemberDAO mdao;

	@Override
	public void memberRegister(String id, String pwd, String name, String email, String birth, String sns) {
		System.out.println("memId: "+id);
		System.out.println("memPwd: "+pwd);
		System.out.println("memName: "+name);
		System.out.println("memEmail: "+email);
		System.out.println("memBirth: "+birth);
		System.out.println("memSns: "+sns);
		mdao.memberInsert(id, pwd, name, email, birth, sns);
	}

	@Override
	public MemberDTO memberSearch(MemberDTO mdto) {
		MemberDTO mem = mdao.memberSelect(mdto);
		return mem;
	}
	
}
