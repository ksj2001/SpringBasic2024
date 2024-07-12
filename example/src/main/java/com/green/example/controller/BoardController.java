package com.green.example.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.example.dto.MemberDTO;

@Controller
@RequestMapping("/member")
public class BoardController {
	@RequestMapping("/boardList")
	public String boardList(MemberDTO mdto, HttpSession session, HttpServletRequest request) {
		// 
		// request.getRequestURL(); �ּ� ���θ� ������ش�. to�� ����
		// request.getHeader("referer"); ��� �Դ����� �ּҷ� ������. from�� ����
		MemberDTO mem = (MemberDTO) session.getAttribute("member");
		if(mem==null) {
			// get ������� boardList�� �ּҸ� loginForm.jsp�� ������.
			System.out.println("to : "+request.getRequestURL());
			System.out.println("from : "+request.getHeader("referer"));
			return "redirect:/member/loginForm?toURL=" + request.getRequestURL();
		}
		return "member/boardList";
	}
}
