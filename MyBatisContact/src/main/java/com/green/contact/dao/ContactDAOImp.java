package com.green.contact.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.green.contact.dto.ContactDTO;

@Repository
public class ContactDAOImp implements ContactDAO{
	
	@Autowired
	SqlSessionTemplate sql;
	
	@Override
	public int insert(ContactDTO cdto) {
		int result= sql.insert("Contact.insert", cdto);
		if(result>0) {
			System.out.println("sql 성공");
		}else {
			System.out.println("sql 실패");
		}
		return result;
	}

	@Override
	public ContactDTO findByNo(int cNo) {
		return sql.selectOne("Contact.findByNo", cNo);
	}

	@Override
	public List<ContactDTO> findAll() {
		return sql.selectList("Contact.findAll");
	}
	
	@Override
	public int update(ContactDTO cdto) {
		return sql.update("Contact.update", cdto);
	}

	@Override
	public void delete(int cNo) {
		sql.delete("Contact.delete", cNo);
	}
	
}
