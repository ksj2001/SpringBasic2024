package com.green.mybatis.dao;

import java.util.ArrayList;

import com.green.mybatis.dto.MemberDTO;

public interface MemberDAO {
	// 1. ��ü ��� ��������
	public ArrayList<MemberDTO> selectMemberList();
	
	// 2. �����ϱ�
	public void insertMember(String mId, String mName);
	
	// 3. ȸ�� ���� ����
	public MemberDTO selectBymNo(int mNo);
	
	// 4. �����ϱ�
	public void updateMember(String mName, int mNo);
	
	// 5. �����ϱ�
	public void deleteMember(int mno);
}
