package com.green.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.contact.dao.ContactDAOImp;
import com.green.contact.dto.ContactDTO;

@Service
public class ContactServiceImp implements ContactService{

	@Autowired
	ContactDAOImp cdao;
	
	@Override
	public int insert(ContactDTO cdto) {
//		int result = cdao.insert(cdto);
//		if(result>0) {
//			System.out.println("연락처 등록 성공");
//		}else {
//			System.out.println("연락처 등록 실패");
//		}
//		return result;
		return cdao.insert(cdto);
	}

	@Override
	public ContactDTO findByNo(int cNo) {
		return cdao.findByNo(cNo);
	}

	@Override
	public List<ContactDTO> findAll() {
		return cdao.findAll();
	}
	
	@Override
	public boolean update(ContactDTO cdto) {
		int result = cdao.update(cdto);
		if(result>0) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void delete(int cNo) {
		cdao.delete(cNo);
	}

}
