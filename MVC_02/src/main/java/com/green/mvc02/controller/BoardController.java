package com.green.mvc02.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.mvc02.dto.BoardDTO;

@Controller
public class BoardController {
	// jsp 방식 - HttpServletRequest 클래스 사용
	@RequestMapping(value="board/view01") // url 맵핑 주소
	public String goView01(HttpServletRequest request, Model model) {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		int viewcount = Integer.parseInt(request.getParameter("viewcount"));
		// 입력받은 파라미터를 jsp 파일로 저장해서 보낼 때 Model 클래스를 사용
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("viewcount", viewcount);
		
		return "board/resultView01";
	}
	
	// @RequestParam(defaultValue = "이름", required = true)
	@RequestMapping(value="board/view02")
	public String goView02(@RequestParam(defaultValue = "title", required = true) String title,
			@RequestParam("content") String content,
			@RequestParam("viewcount") int viewcount,
			Model model) {
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("viewcount", viewcount);
		
		return "board/resultView02";
	}
	
	// BoardDTO를 이용한 Command 객체로 파라미터를 가져온다.
	@RequestMapping(value="board/view03")
	public String goView03(@ModelAttribute("b") BoardDTO bdto, Model model) {
//		model.addAttribute("bdto", bdto);
		return "board/resultView03";
	}
	
}
