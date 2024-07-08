package com.green.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	// @RequestMapping: url �ּҸ� Mapping�ϴ� Annotation
	// Model�� addAttribute(�Ӽ� �̸�,��)�� �ϱ� ���� �������� Ŭ�����̴�.
	// Model Ŭ������ �ݵ�� �޼����� �Ű� ������ ������ ����Ѵ�.
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		// serverTime�̶�� �̸����� model Ŭ������ ����� ����
		// view�� EL ǥ�� ����� ${serverTime} �������� ��� �����ϴ�. 
		
		return "home"; // View.jsp�� view �̸�
	}
	
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public String success() {
		return "success";
	}
	
	@RequestMapping(value = "/a/b/c/d", method = RequestMethod.GET)
	public String goView01() {
		return "view01";
	}
	
	@RequestMapping(value = "x/y/z", method = RequestMethod.GET)
	public String goLogin() {
		return "member/login"; // WEB-INF/views/member/login.jsp
	}
	/*
	   * JSP�� Spring�� ��û�� ��
	   * JSP
	   * HttpServletRequest request : request.setAttribute(�Ӽ��̸�,��)
	   
	   * Spring
	   * Model model : model.addAttribute(�Ӽ��̸�,��)
	   * Model�� �Ű������� �����Ѵ�.
	   * DispatcherServlet -> Controller -> Method -> ViewResolver -> View�� ���� Model�� ��������
	
	
	*/
	
	@RequestMapping(value = "view02", method = RequestMethod.GET)
	public String goView02(Model model) {
		model.addAttribute("name", "���и�");
		model.addAttribute("age", "20");
		
		return "view02";
	}
	
	@RequestMapping(value = "view03", method = RequestMethod.GET)
	public String goView03() {
		return "view03";
	}
	
//	ModelAndView Ŭ����
//	Spring 2.0 �������� �����ϴ� Ŭ������, �ַ� ���� ���Ǿ���.
//	Model�� �����Ͱ��� View�� �Բ� �����ش�.
//	Model�� ������ �߰��� addObject("�Ӽ�",��)
//	View�� setViewName("View �̸�")
	@RequestMapping(value = "board/view04", method = RequestMethod.GET)
	public ModelAndView goView04() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/view04");
		return mav;
	}
	
	@RequestMapping(value = "board/view05", method = RequestMethod.GET)
	public ModelAndView goView05() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "ȫ�浿");
		mav.addObject("age", 30);
		mav.setViewName("board/view05");
		return mav;
	}
}
