package com.green.session.dao;

import java.util.Map;

import com.green.session.dto.Member;

public interface IMemberDao {
	Map<String, Member> memberInsert(Member member);
	Member memberSelect(Member member);
}
