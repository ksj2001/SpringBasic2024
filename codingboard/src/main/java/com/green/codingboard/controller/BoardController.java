package com.green.codingboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.codingboard.dto.BoardDTO;
import com.green.codingboard.service.BoardServiceImpl;

@Controller
public class BoardController {
	@Autowired
	BoardServiceImpl bService;
	
	// insert ȭ������ �̵�
	//@RequestMapping(value="", method=)
	@GetMapping("/insert")
	public String insertForm() {
		return "insert";
	}
	
	// insert ó��
	@PostMapping("/insert")
	public String insert(BoardDTO bdto) {
		int result = bService.insert(bdto);
		if(result>0) {
			return "redirect:/list";
		}else {
			return "index";
		}
	}
	
	// ��ü���
	@GetMapping("/list")
	public String findAll(Model model) {
		List<BoardDTO> boardList = bService.findAll();
		model.addAttribute("bdtoList", boardList);
		return "list";
	}
	
	// �ϳ��� �Խñ� ��������(detail)
	@GetMapping("/detail")
	public String findByNo(Model model, @RequestParam("boardNo") Long boardNo) {
		bService.updateHits(boardNo); // ��ȸ�� 1 ����
		BoardDTO bdto = bService.findByNo(boardNo);
		model.addAttribute("bdto", bdto);
		return "detail";
	}
	
	// update ȭ������ �̵�
	@GetMapping("/update")
	public String updateForm(Model model, @RequestParam("boardNo") Long boardNo) {
		BoardDTO bdto = bService.findByNo(boardNo);
		model.addAttribute("bdto", bdto);
		return "update";
	}
	
	// update ó��
	@PostMapping("/update")
	public String update(Model model, BoardDTO bdto) {
		bService.update(bdto);
		model.addAttribute("bdto", bdto);
		return "redirect:/detail?boardNo="+bdto.getBoardNo();
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("boardNo") Long boardNo) {
		bService.delete(boardNo);
		return "redirect:/list";
	}
}
