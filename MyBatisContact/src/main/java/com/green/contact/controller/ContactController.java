package com.green.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.contact.dto.ContactDTO;
import com.green.contact.service.ContactService;

@Controller
@RequestMapping("/contactP")
public class ContactController {
	@Autowired
	ContactService cService;
	
	@RequestMapping(value="/contactListPage", method=RequestMethod.GET)
	public String list(Model model) {
		List<ContactDTO> cdtoList = cService.findAll();
		model.addAttribute("contactList", cdtoList);
		return "contactP/contactListPage";
	}
	
	@RequestMapping(value="/contactInsertPage", method=RequestMethod.GET)
	public String insertForm() {
		return "contactP/contactInsertPage";
	}
	
	@RequestMapping(value="/contactInsert", method=RequestMethod.POST)
	public String insert(Model model, ContactDTO cdto) {
		int result = cService.insert(cdto);
		if(result>0) {
			System.out.println("연락처 등록 성공");
			model.addAttribute("contactList", cdto);
			return "redirect:contactListPage";
		}else {
			System.out.println("연락처 등록 실패");
			return "contactP/contactInsertPage";
		}
	}
	
	@RequestMapping(value="/contactViewPage", method=RequestMethod.GET)
	public String view(Model model, @RequestParam("cNo") int cNo) {
		ContactDTO cdto = cService.findByNo(cNo);
		model.addAttribute("contact", cdto);
		return "contactP/contactViewPage";
	}
	
	@RequestMapping(value="/contactUpdate", method=RequestMethod.POST)
	public String update(ContactDTO cdto) {
		boolean result = cService.update(cdto);
		if(result) {
			System.out.println("연락처 수정 성공");
			return "redirect:contactListPage";
		}else {
			System.out.println("연락처 수정 실패");
			return "contactP/contactInsertPage";
		}
	}
	
	@RequestMapping(value="/contactDelete", method=RequestMethod.POST)
	public String delete(@RequestParam("cNo") int cNo) {
		cService.delete(cNo);
		return "redirect:contactListPage";
	}
}
