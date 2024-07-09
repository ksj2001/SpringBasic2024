package com.green.example.service;

import com.green.example.dto.MemberDTO;

public interface IMemberService {
	void memberRegister(String id, String pwd, String name,
			String email, String birth, String sns);
	
	MemberDTO memberSearch(MemberDTO member);
}
