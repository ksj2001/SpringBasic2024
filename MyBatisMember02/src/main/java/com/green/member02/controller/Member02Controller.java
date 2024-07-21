package com.green.member02.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.member02.dto.Member02DTO;
import com.green.member02.service.Member02ServiceImpl;

@Controller
public class Member02Controller {
	@Autowired
	Member02ServiceImpl mService;
	
	// insert하는 화면을 띄워주는 
	@RequestMapping(value="/save",method = RequestMethod.GET)
	public String saveForm() {
		return "save";
	}
	
	// insert 처리
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String save(Member02DTO mdto) {
		int result = mService.save(mdto);
		if(result>0) {
			System.out.println("회원가입 성공");
			return "redirect:/";
		}else {
			System.out.println("회원가입 실패");
			return "save";
		}
	}
	
	// 로그인 화면 띄워주기
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String loginForm() {
		return "login";
	}
	
	// 로그인 처리
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String login(Member02DTO mdto, HttpSession session) {
		boolean result = mService.login(mdto);
		if(result) {
			System.out.println("로그인 성공");
			// session.setAttribute("mdto", mService.login(mdto));
			  session.setAttribute("email", mdto.getMemberEmail());
			//  session.setAttribute("name", mdto.getMemberName());
			return "main";
		}else {
			System.out.println("로그인 실패");
			return "login";
		}
		
	}
	
	// 회원목록 처리
	@RequestMapping(value="/list",method = RequestMethod.GET)
	public String findAllList(Model model) {
		List<Member02DTO> mdtoList = mService.findAll();
		model.addAttribute("memberList", mdtoList);
		return "list";
	}
	
	// GET 방식으로 id=1
	@RequestMapping(value="/detail",method = RequestMethod.GET)
	public String detail(Model model, @RequestParam("id") Long id) {
		Member02DTO mdto = mService.findById(id);
		model.addAttribute("member", mdto);
		return "detail";
	}
	
	// 회원정보 수정 화면
	@RequestMapping(value="/update",method = RequestMethod.GET)
	public String updateForm(Member02DTO mdto, HttpSession session) {
	    System.out.println(session.getAttribute("name"));
		session.getAttribute("email");
		return "update";
	}
	
	// 회원정보 삭제
	@RequestMapping(value="/delete",method = RequestMethod.GET)
	public String delete(@RequestParam("id") Long id) {
		mService.delete(id);
		return "redirect:/list";
	}
	
}
