package com.green.example.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.green.example.dto.MemberDTO;

@Repository
public class MemberDAO implements IMemberDAO{
	private HashMap<String, MemberDTO> dbMap;
	
	public MemberDAO() {
		dbMap = new HashMap<String, MemberDTO>();
	}

	@Override
	public void memberInsert(String id, String pwd, String name,
			String email, String birth, String sns) {
		MemberDTO mdto = new MemberDTO();
		mdto.setId(id);
		mdto.setPwd(pwd);
		mdto.setName(name);
		mdto.setEmail(email);
		mdto.setBirth(birth);
		mdto.setSns(sns);
		
		dbMap.put(id, mdto);
		
		for(String key: dbMap.keySet()) {
			MemberDTO value = dbMap.get(key);
			System.out.print("memberId:"+value.getId()+"\t");
			System.out.print("|memberPw:"+value.getPwd()+"\t");
			System.out.print("|memberName:"+value.getName()+"\t");
			System.out.print("|memberMail:"+value.getEmail()+"\t");
			System.out.print("|memberBirth:"+value.getBirth()+"\t");
			System.out.print("|memberSns:"+value.getSns()+"\t");
		}
	}

	@Override
	public MemberDTO memberSelect(MemberDTO mdto) {
		MemberDTO mem = dbMap.get(mdto.getId());
		return mem;
	}
}
