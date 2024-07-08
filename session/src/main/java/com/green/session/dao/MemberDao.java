package com.green.session.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.green.session.dto.Member;
@Repository
public class MemberDao implements IMemberDao{
	
	// HashMap으로 임시 테이블 작성
	HashMap<String,Member> db;
	
	public MemberDao() {
		db = new HashMap<String,Member>();
	}

	@Override
	public Map<String, Member> memberInsert(Member member) {
		db.put(member.getMemId(), member);
		return db;
	}

	@Override
	public Member memberSelect(Member member) {
		Member mem = db.get(member.getMemId());
		return mem;
	}

}
