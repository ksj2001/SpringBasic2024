package com.green.contact.service;

import java.util.List;

import com.green.contact.dto.ContactDTO;

public interface ContactService {
	// insert
	public int insert(ContactDTO cdto);
	// findByNo
	public ContactDTO findByNo(int cNo);
	// findAll
	public List<ContactDTO> findAll();
	// update
	public boolean update(ContactDTO cdto);
	// delete
	public void delete(int cNo);
}
