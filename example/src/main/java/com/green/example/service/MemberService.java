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
	public int memberRegister(MemberDTO mdto) {
		int result = mdao.memberInsert(mdto);
		if(result == 0) {
			System.out.println("회원가입 실패");
		}else {
			System.out.println("회원가입 성공");
		}
		return result;
//		System.out.println("memId: "+id);
//		System.out.println("memPwd: "+pwd);
//		System.out.println("memName: "+name);
//		System.out.println("memEmail: "+email);
//		System.out.println("memBirth: "+birth);
//		System.out.println("memSns: "+sns);
//		mdao.memberInsert(id, pwd, name, email, birth, sns);
	}

	@Override
	public MemberDTO memberSearch(MemberDTO mdto) {
		MemberDTO mem = mdao.memberSelect(mdto);
		if(mem == null) {
			System.out.println("로그인 실패");
		}else {
			System.out.println("로그인 성공");
		}
		return mem;
	}
	
	@Override
	public int memberDelete(MemberDTO mdto) {
		int result = mdao.memberDelete(mdto);
		if(result == 0) {
			System.out.println("회원탈퇴 실패");
		}else {
			System.out.println("회원탈퇴 성공");
		}
		return result;
	}
}
