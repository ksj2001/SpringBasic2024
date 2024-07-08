package com.green.service.Service;

import com.green.service.dto.MemberDTO;

public interface IMemberService {
	// 회원등록
//	void memberRegister(String memId, String memPw, String memMail,
//			String memPhone1, String memPhone2, String memPhone3);
	void memberRegister(MemberDTO mdto);
	// 회원검색
	MemberDTO memberSearch(String memID, String memPw);
	// 회원정보 수정
	void memberModify();
	// 회원정보 삭제
	void memberRemove();
}
