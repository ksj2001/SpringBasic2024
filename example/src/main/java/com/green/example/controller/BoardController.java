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
		// request.getRequestURL(); 주소 전부를 출력해준다. to의 역할
		// request.getHeader("referer"); 어디서 왔는지를 주소로 보여줌. from의 역할
		MemberDTO mem = (MemberDTO) session.getAttribute("member");
		if(mem==null) {
			// get 방식으로 boardList의 주소를 loginForm.jsp로 보낸다.
			System.out.println("to : "+request.getRequestURL());
			System.out.println("from : "+request.getHeader("referer"));
			return "redirect:/member/loginForm?toURL=" + request.getRequestURL();
		}
		return "member/boardList";
	}
}
