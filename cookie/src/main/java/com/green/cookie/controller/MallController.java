package com.green.cookie.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.cookie.dto.Mall;

@Controller
@RequestMapping("/mall")
public class MallController {
	
//	@ModelAttribute("cp")
//	public String getContextPath(HttpServletRequest request) {
//		return request.getContextPath();
//	}
	
	// ��Ű ����
	@RequestMapping("/main")
	public String mallMain(@ModelAttribute("M") Mall malldto, HttpServletResponse response) {
		// ��Ű�� genderCookie�� ���� Cookie("id", "abcd") => id="abcd"�� �ǹ�
		Cookie genderCookie = new Cookie("gender", malldto.getGender());
		
		System.out.println(malldto.isCookieDel());
		
		if(malldto.isCookieDel()) {
			genderCookie.setMaxAge(0);
			malldto.setGender(null);
		}else {
			genderCookie.setMaxAge(60*60*24);
		}
		System.out.println(genderCookie.getValue());
		
		response.addCookie(genderCookie);
		return "mall/main";
	}
	 
	// ��Ű �о����
	@RequestMapping("/index")
	public String mallIndex(Mall malldto,
			@CookieValue(value="gender", required=false) Cookie genderCookie,
			HttpServletRequest request) {
		
		if(genderCookie != null) {
			malldto.setGender(genderCookie.getValue());
			System.out.println(genderCookie.getValue());
		}
		
		return "mall/index";
	}
}
