package com.green.member02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.member02.dao.Member02DAOImpl;
import com.green.member02.dto.Member02DTO;

@Service
public class Member02ServiceImpl implements IMember02Service{

	@Autowired
	Member02DAOImpl mdao;
	
	@Override
	public int save(Member02DTO memberDTO) {
		return mdao.save(memberDTO);
	}

	@Override
	public boolean login(Member02DTO memberDTO) {
		Member02DTO mdto = mdao.login(memberDTO);
		if(mdto!=null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<Member02DTO> findAll() {
		return mdao.findAll();
	}

	@Override
	public Member02DTO findById(Long id) {
		return mdao.findById(id);
	}

	@Override
	public void delete(Long id) {
		mdao.delete(id);
	}

	@Override
	public boolean update(Member02DTO memberDTO) {
		int result = mdao.update(memberDTO);
		if(result>0) {
			System.out.println("update 완료");
			return true;
		}else {
			System.out.println("update 미완료");
			return false;
		}
	}

	@Override
	public Member02DTO findByMemberEmail(String email) {
		return mdao.findByMemberEmail(email);
	}

}
