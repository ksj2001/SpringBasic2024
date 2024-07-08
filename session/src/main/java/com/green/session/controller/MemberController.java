package com.green.session.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.green.session.dto.Member;
import com.green.session.service.MemberService;

@Controller
@RequestMapping("/member") // RequestMapping에서 공통의 Mapping 주소는 따로 작성 가능하다.
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@ModelAttribute("cp")
	public String getContext(HttpServletRequest request) {
		//String path = request.getContextPath();
		System.out.println(request.getContextPath());
		return request.getContextPath();
	}
	
	//join
	@RequestMapping(value="/joinForm")
	public String joinForm(Member member) {
		return "/member/joinForm";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String joinReg(Member member) {
		service.memberRegister(member);
		return "/member/joinOk";
	}
	
	//session으로 로그인 정보 가져온다.
	// @PostMapping("/loginForm")
	// @GetMapping("/loginForm")
	@RequestMapping(value="/loginForm")
	public String memLoginForm(Member member) {
		return "/member/loginForm";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String memLogin(Member member, HttpSession session) {
		Member mem = service.memberSearch(member);
		session.setAttribute("member", mem);
		return "/member/loginOk";
	}
	
	//로그아웃 하면 session 삭제한다.
	@RequestMapping("/logout")
	public String memLogout(Member member, HttpSession session) {
		session.invalidate();
		return "/member/logoutOk";
	}
	
	@RequestMapping("/myPage")
	public String myPage(Member member, HttpSession session) {
//		현재 로그인이 유지중인지 session.getValue로 값을 가져온다.
//		session은 Member의 상위 클래스이기 때문에 다운캐스팅을 이용하여 형변환한다.
		/*
		 * Member mem = (Member) session.getAttribute("member"); // 로그인이 안 된 상태
		 * if(mem==null) { // redirect:/ => /session 을 의미한다. return
		 * "redirect:/member/loginForm"; }
		 */
		
//		로그인이 된 상태에서만 myPage로 이동되고, 로그인이 안 된 상태일때는 loginForm.jsp로 이동한다.
		return "/member/myPage";
	}
	
	@RequestMapping("/Board")
	public String board(Member member) {
		return "/member/Board";
	}
}
