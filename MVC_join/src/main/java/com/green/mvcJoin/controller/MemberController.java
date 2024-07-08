package com.green.mvcJoin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.green.mvcJoin.dto.MemberDTO;

@Controller
public class MemberController {
	@RequestMapping(value="/member/register", method=RequestMethod.POST)
	public String goView01(MemberDTO mdto, Model model) {
		model.addAttribute("mdto", mdto);
		return "member/registered";
	}
}
