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
		// statement에 입력하는 문자는
		// member02Mapper.xml의 mapper namespace의 이름인 Member.insert의 ID인 save를 입력한다.
		// String sql = "INSERT INTO member_table(......) values(?,?,?,?)"  => Member.save  
		return sql.insert("Member.save", memberDTO);

	}

	@Override
	public Member02DTO login(Member02DTO memberDTO) {
		// 한 사람의 Member02DTO 정보를 가지고 올 때는 selectOne을 선택한다.
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
