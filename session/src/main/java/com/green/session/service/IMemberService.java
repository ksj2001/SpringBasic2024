package com.green.session.service;

import com.green.session.dto.Member;

public interface IMemberService {
	void memberRegister(Member member);
	Member memberSearch(Member member);
}
