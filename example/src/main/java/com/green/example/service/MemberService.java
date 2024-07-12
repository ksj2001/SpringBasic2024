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
			System.out.println("ȸ������ ����");
		}else {
			System.out.println("ȸ������ ����");
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
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		return mem;
	}
	
	@Override
	public int memberDelete(MemberDTO mdto) {
		int result = mdao.memberDelete(mdto);
		if(result == 0) {
			System.out.println("ȸ��Ż�� ����");
		}else {
			System.out.println("ȸ��Ż�� ����");
		}
		return result;
	}
}
