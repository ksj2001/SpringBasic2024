package com.green.session.service;

import com.green.session.dto.Member;

public interface IMemberService {
	int memberRegister(Member member);
	Member memberSearch(Member member);
	int memberModify(Member member);
}
