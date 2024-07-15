package com.green.mybatis.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.mybatis.dao.MemberDAO;
import com.green.mybatis.dto.MemberDTO;

@Controller
public class MemberController {

	// MyBatis의 SqlSessionFactory를 자동 주입한다.
	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping("listPage")
	public String listPage(Model model) {
		MemberDAO mDAO = sqlSession.getMapper(MemberDAO.class);
		model.addAttribute("list", mDAO.selectMemberList());
		return "member/listPage";
	}
	
	@RequestMapping("insertPage")
	public String insertPage() {
		return "member/insertPage";
	}
	
	@RequestMapping("insert")
	public String insert(@RequestParam("mId") String mId,
			@RequestParam("mName") String mName) {
		MemberDAO mDAO = sqlSession.getMapper(MemberDAO.class);
		mDAO.insertMember(mId, mName);
		return "redirect:listPage";
	}
	
	@RequestMapping("viewPage")
	public String viewPage(@RequestParam("mNo") int mNo, Model model) {
		MemberDAO mDAO = sqlSession.getMapper(MemberDAO.class);
		MemberDTO mDTO = mDAO.selectBymNo(mNo);
		model.addAttribute("mDTO", mDTO);
		return "member/viewPage";
	}
	
	@RequestMapping("update")
	public String update(@RequestParam("mName") String mName,
			@RequestParam("mNo") int mNo) {
		MemberDAO mDAO = sqlSession.getMapper(MemberDAO.class);
		mDAO.updateMember(mName, mNo);
		return "redirect:viewPage?mNo="+mNo;
	}
	
	@RequestMapping("delete")
	public String delete(@RequestParam("mNo") int mNo) {
		MemberDAO mDAO = sqlSession.getMapper(MemberDAO.class);
		mDAO.deleteMember(mNo);
		return "redirect:listPage";
	}
}
