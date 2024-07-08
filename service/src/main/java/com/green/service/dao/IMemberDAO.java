package com.green.service.dao;

import java.util.Map;

import com.green.service.dto.MemberDTO;

public interface IMemberDAO {
	//데이터 추가 - mySQL의 insert into
//	void memberInsert(String memId, String memPw, String memMail,
//			String memPhone1, String memPhone2, String memPhone3);
	Map<String, MemberDTO> memberInsert(MemberDTO mdto);
	//데이터 검색 - mySQL의 select
	MemberDTO memberSelect(String memID, String memPw);
	
	//데이터 수정 - mySQL의 update
	void memberUpdate();
	
	//데이터 삭제 - mySQL의 delete
	void memberDelete();
}
