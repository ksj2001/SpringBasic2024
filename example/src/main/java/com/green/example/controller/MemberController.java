package com.green.example.controller;

import java.lang.reflect.Member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
	// @ModelAttribute는 필수?? (${mdto.id}는 안 먹힘)
	public String joinForm(@ModelAttribute("m") MemberDTO mdto) {
		service.memberRegister(mdto);
		return "member/joinFormOk";
	}
	
	@RequestMapping("/deleteAcc")
	public String deleteAcc(HttpSession session) {
		MemberDTO mdto = (MemberDTO) session.getAttribute("member");
		service.memberDelete(mdto);
		session.invalidate();
		return "redirect:/";
	}
	
//	@RequestMapping("/login")
//	public String loginForm(MemberDTO member, HttpSession session, String toURL) {
//		MemberDTO mdto = service.memberSearch(member);
//		
//		try {
//			// session에 저장
//			session.setAttribute("member", mdto);
//			// 삼항 연산자를 이용해서 로그인이 안된 상태면 home으로 이동
//			// 로그인이 된 상태면 toURL에 받아온 값으로 이동
//			toURL = toURL == null || toURL.equals("") ? "/" : toURL; 
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return "redirect:"+toURL;
//	}
	
	@RequestMapping("/login")
	public String loginForm(MemberDTO member, HttpSession session, String toURL) {
		MemberDTO mdto = service.memberSearch(member);
		try {
			session.setAttribute("member", mdto);
			toURL = toURL == null || toURL.equals("") ? "/" : toURL; 
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "redirect:" + toURL;
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
}
