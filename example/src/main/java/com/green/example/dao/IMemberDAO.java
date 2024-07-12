package com.green.example.dao;

import java.lang.reflect.Member;

import com.green.example.dto.MemberDTO;

public interface IMemberDAO {
	int memberInsert(MemberDTO mdto);
	MemberDTO memberSelect(MemberDTO mdto);
	int memberDelete(MemberDTO mdto);
}
