package com.green.service.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.green.service.dto.MemberDTO;

// MemberDAO는 IMemberDAO interface의 구현 클래스이다.
@Repository // @Repository는 dao 객체를 SpringContainer의 Bean 객체로 생성시켜준다.
public class MemberDAO implements IMemberDAO{
	
	// 실제 mySQL 데이터베이스를 연동하지 않았기 때문에, HashMap을 이용해서 임시 테이블을 생성
	private HashMap<String,MemberDTO> dbMap;
	
	public MemberDAO() {
		dbMap = new HashMap<String,MemberDTO>();
	}

//	@Override
//	public void memberInsert(String memId, String memPw, String memMail, String memPhone1, String memPhone2,
//			String memPhone3) {
//		
//		// 테스트 코드 작성
//		
//		System.out.println("memberInsert()");
//		System.out.println("memId : " + memId);
//		System.out.println("memPw : " + memPw);
//		System.out.println("memMail : " + memMail);
//		System.out.println("memPhone1 : " + memPhone1 + "-" + memPhone2 + "-" + memPhone3);
//		
//		
//		MemberDTO mdto = new MemberDTO();
//		mdto.setMemId(memId);
//		mdto.setMemPw(memPw);
//		mdto.setMemMail(memMail);
//		mdto.setMemPhone1(memPhone1);
//		mdto.setMemPhone2(memPhone2);
//		mdto.setMemPhone3(memPhone3);
//		
//		// HashMap으로 만든 임시 테이블에 id를 key값으로 저장
//		dbMap.put(memId, mdto);
//		
//		for(String key: dbMap.keySet()) {
//			MemberDTO value = dbMap.get(key);
//			System.out.print("memberId:"+value.getMemId()+"\t");
//			System.out.print("|memberPw:"+value.getMemPw()+"\t");
//			System.out.print("|memberMail:"+value.getMemMail()+"\t");
//			System.out.print("|memberPhone:"+value.getMemPhone1()+" - "+
//											 value.getMemPhone2()+" - "+
//											 value.getMemPhone3()+"\n");
//		}
//	}

	@Override
	public MemberDTO memberSelect(String memID, String memPw) {
		MemberDTO mdto = dbMap.get(memID);
		return mdto;
	}

	@Override
	public void memberUpdate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, MemberDTO> memberInsert(MemberDTO mdto) {
		dbMap.put(mdto.getMemId(), mdto);
		
		for(String key: dbMap.keySet()) {
			MemberDTO value = dbMap.get(key);
			System.out.print("memberId:"+value.getMemId()+"\t");
			System.out.print("|memberPw:"+value.getMemPw()+"\t");
			System.out.print("|memberMail:"+value.getMemMail()+"\t");
			System.out.print("|memberPhone:"+value.getMemPhone1()+" - "+
											 value.getMemPhone2()+" - "+
											 value.getMemPhone3()+"\n");
		}
		return dbMap;
	}
}
