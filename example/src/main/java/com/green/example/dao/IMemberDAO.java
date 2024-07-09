package com.green.example.dao;

import java.lang.reflect.Member;

import com.green.example.dto.MemberDTO;

public interface IMemberDAO {
	void memberInsert(String id, String pwd, String name,
			String email, String birth, String sns);
	
	MemberDTO memberSelect(MemberDTO mdto);
}
