package com.green.member02.dao;

import java.util.List;

import com.green.member02.dto.Member02DTO;

public interface IMember02DAO {
	// insert
	public int save(Member02DTO memberDTO);
	// login
	public Member02DTO login(Member02DTO memberDTO);
	// ��ü ȸ������ ��ȸ
	public List<Member02DTO> findAll();
	// ���� ȸ������ ��ȸ
	public Member02DTO findById(Long id);
	// delete
	public void delete(Long id);
	// update
	public int update(Member02DTO memberDTO);
}
