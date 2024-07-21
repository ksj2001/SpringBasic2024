package com.green.contact.dao;

import java.util.List;

import com.green.contact.dto.ContactDTO;

public interface ContactDAO {
	// insert
	public int insert(ContactDTO cdto);
	// findByNo
	public ContactDTO findByNo(int cNo);
	// findAll
	public List<ContactDTO> findAll();
	// update
	public int update(ContactDTO cdto);
	// delete
	public void delete(int cNo);
}
