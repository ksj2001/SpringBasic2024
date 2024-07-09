package com.green.example.controller;

import java.lang.reflect.Member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.example.dto.MemberDTO;
import com.green.example.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberService service;
	
	@ModelAttribute("cp")
	public String getContext(HttpServletRequest request) {
		System.out.println(request.getContextPath());
		return request.getContextPath();
	}
	
	@RequestMapping("/joinForm")
	public String joinForm() {
		return "member/joinForm";
	}
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	@RequestMapping("/join")
	// @ModelAttribute´Â ÇÊ¼ö?? (${mdto.id}´Â ¾È ¸ÔÈû)
	public String joinForm(@ModelAttribute("m") MemberDTO mdto) {
		service.memberRegister(mdto.getId(), mdto.getPwd(), mdto.getName(),
				mdto.getEmail(), mdto.getBirth(), mdto.getSns());
		return "member/joinFormOk";
	}
	
	@RequestMapping("login")
	public String loginForm(MemberDTO member, HttpSession session) {
		MemberDTO mdto = service.memberSearch(member);
		
		try {
			session.setAttribute("member", mdto);
//			model.addAttribute("id",mdto.getId());
//			model.addAttribute("pwd",mdto.getPwd());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "member/loginOk";
	}
}
