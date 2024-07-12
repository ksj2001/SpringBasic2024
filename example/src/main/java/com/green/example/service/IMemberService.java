package com.green.example.service;

import com.green.example.dto.MemberDTO;

public interface IMemberService {
	int memberRegister(MemberDTO member);
	MemberDTO memberSearch(MemberDTO member);
	int memberDelete(MemberDTO member);
}
