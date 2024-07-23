package com.green.member02.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.member02.dto.Member02DTO;

@Repository
public class Member02DAOImpl implements IMember02DAO{

	@Autowired
	private SqlSessionTemplate sql;
	
	@Override
	public int save(Member02DTO memberDTO) {		
		// statement�� �Է��ϴ� ���ڴ�
		// member02Mapper.xml�� mapper namespace�� �̸��� Member.insert�� ID�� save�� �Է��Ѵ�.
		// String sql = "INSERT INTO member_table(......) values(?,?,?,?)"  => Member.save  
		return sql.insert("Member.save", memberDTO);

	}

	@Override
	public Member02DTO login(Member02DTO memberDTO) {
		// �� ����� Member02DTO ������ ������ �� ���� selectOne�� �����Ѵ�.
		return sql.selectOne("Member.login", memberDTO);
	}

	@Override
	public List<Member02DTO> findAll() {
		return sql.selectList("Member.findAll");
	}

	@Override
	public Member02DTO findById(Long id) {
		return sql.selectOne("Member.findById", id);
	}

	@Override
	public void delete(Long id) {
		sql.delete("Member.delete", id);
	}

	@Override
	public int update(Member02DTO memberDTO) {
		return sql.update("Member.update", memberDTO);
	}

	@Override
	public Member02DTO findByMemberEmail(String email) {
		return sql.selectOne("Member.findByMemberEmail", email);
	}

}
