package com.green.mvc03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.green.mvc03.dto.MemberDTO;

@Controller
public class MemberController {
	@RequestMapping(value="/member/login2", method=RequestMethod.POST)
	public String goView02(@ModelAttribute("m") MemberDTO mdto, Model model) {
		return "member/loginResult";
	}
}
