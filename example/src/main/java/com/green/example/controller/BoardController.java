package com.green.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.example.dto.MemberDTO;

@Controller
@RequestMapping("/member")
public class BoardController {
	@RequestMapping("/boardList")
	public String boardList(MemberDTO mdto, HttpSession session) {
		MemberDTO mem = (MemberDTO) session.getAttribute("member");
		if(mem==null) {
			return "redirect:/member/loginForm";
		}
		return "member/boardList";
	}
}
