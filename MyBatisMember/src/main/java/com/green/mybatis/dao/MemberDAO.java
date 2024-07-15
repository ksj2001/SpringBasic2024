package com.green.mybatis.dao;

import java.util.ArrayList;

import com.green.mybatis.dto.MemberDTO;

public interface MemberDAO {
	// 1. 전체 목록 가져오기
	public ArrayList<MemberDTO> selectMemberList();
	
	// 2. 삽입하기
	public void insertMember(String mId, String mName);
	
	// 3. 회원 정보 보기
	public MemberDTO selectBymNo(int mNo);
	
	// 4. 수정하기
	public void updateMember(String mName, int mNo);
	
	// 5. 삭제하기
	public void deleteMember(int mno);
}
