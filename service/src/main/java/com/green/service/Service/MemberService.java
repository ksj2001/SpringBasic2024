package com.green.service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.service.dao.MemberDAO;
import com.green.service.dto.MemberDTO;

@Service // 비지니스 로직은 @Service로 SpringContainer의 Bean 객체로 생성
public class MemberService implements IMemberService{

	
	@Autowired // @Repository로 Bean 객체를 생성한 MemberDAO를 자동 주입
	MemberDAO mdao;
	
//	@Override
//	public void memberRegister(String memId, String memPw, String memMail, String memPhone1, String memPhone2,
//			String memPhone3) {
//		System.out.println("memberInsert()");
//		System.out.println("memId : " + memId);
//		System.out.println("memPw : " + memPw);
//		System.out.println("memMail : " + memMail);
//		System.out.println("memPhone1 : " + memPhone1 + "-" + memPhone2 + "-" + memPhone3);
//		
//		// view에서 입력한 데이터를 HashMap으로 만든 dbmap에 저장한다.
//		mdao.memberInsert(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);
//		
//		
//	}

	@Override
	public MemberDTO memberSearch(String memId, String memPw) {
		System.out.println("memberSearch()");
		System.out.println("memId : "+memId);
		System.out.println("memPw : "+memPw);
		
		MemberDTO mdto = mdao.memberSelect(memId, memPw);
		return mdto;
	}

	@Override
	public void memberModify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberRemove() {
		// TODO Auto-generated method stub
		
	}

	//수정된 코드
	@Override
	public void memberRegister(MemberDTO mdto) {
		System.out.println("memberInsert()");
		System.out.println("memId : " + mdto.getMemId());
		System.out.println("memPw : " + mdto.getMemPw());
        System.out.println("memMail : " + mdto.getMemMail());
		System.out.println("memPhone1 : " + mdto.getMemPhone1() + "-" + mdto.getMemPhone2() + "-" + mdto.getMemPhone3());
		
		mdao.memberInsert(mdto);
		
	}
	
}
