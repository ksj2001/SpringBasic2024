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
	
	// 회원정보 수정 화면으로 이동
	@RequestMapping(value="/update",method = RequestMethod.GET)
	public String updateForm(HttpSession session, Model model) {
		// 로그인 된 session에 담아둔 이메일을 꺼내서 loginEmail로 저장
	    String loginEmail = (String) session.getAttribute("email");
	    // 로그인 된 loginEmail에 해당하는 한 사람의 회원정보를 Member02DTO에 담는다.
	    Member02DTO mem = mService.findByMemberEmail(loginEmail);
	    // update.jsp 화면으로 회원정보를 넘김.
		model.addAttribute("mdto", mem);
		return "update";
	}
	
	// 회원정보 수정 처리
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public String update(@ModelAttribute Member02DTO mdto) {
		boolean updateResult = mService.update(mdto);
		System.out.println("update 완료 :" + updateResult);
		if(updateResult) {
			return "redirect:/list?id="+mdto.getId();
		}else {
			return "index";
		}
	}
	
	// 회원정보 삭제
	@RequestMapping(value="/delete",method = RequestMethod.GET)
	public String delete(@RequestParam("id") Long id) {
		mService.delete(id);
		return "redirect:/list";
	}
	
}
