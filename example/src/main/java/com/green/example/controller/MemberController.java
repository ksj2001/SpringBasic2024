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
	// @ModelAttribute�� �ʼ�?? (${mdto.id}�� �� ����)
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
//			// session�� ����
//			session.setAttribute("member", mdto);
//			// ���� �����ڸ� �̿��ؼ� �α����� �ȵ� ���¸� home���� �̵�
//			// �α����� �� ���¸� toURL�� �޾ƿ� ������ �̵�
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
