package com.green.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.service.Service.MemberService;
import com.green.service.dto.MemberDTO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value="/memJoin", method=RequestMethod.POST)
	public String memJoin(@ModelAttribute("m") MemberDTO mdto) {
//		service.memberRegister(mdto.getMemId(), mdto.getMemPw(), mdto.getMemMail(),
//				mdto.getMemPhone1(), mdto.getMemPhone2(), mdto.getMemPhone3());
		service.memberRegister(mdto);
		return "memJoinOk";
	}
	
	@RequestMapping(value="memLogin", method=RequestMethod.POST)
	public String memLogin(Model model, @RequestParam("memId") String memId,
			@RequestParam("memPw") String memPw) {
		MemberDTO mdto = service.memberSearch(memId, memPw);
		
		try {
			model.addAttribute("memId", mdto.getMemId());
			model.addAttribute("memPw", mdto.getMemPw());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "memLoginOk";
	}
	
}
