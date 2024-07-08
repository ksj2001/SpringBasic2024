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
	
	// @RequestMapping: url 주소를 Mapping하는 Annotation
	// Model은 addAttribute(속성 이름,값)를 하기 위한 스프링의 클래스이다.
	// Model 클래스는 반드시 메서드의 매개 변수로 가져와 사용한다.
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		// serverTime이라는 이름으로 model 클래스에 저장된 상태
		// view의 EL 표현 방식인 ${serverTime} 형식으로 사용 가능하다. 
		
		return "home"; // View.jsp의 view 이름
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
	   * JSP와 Spring의 요청값 비교
	   * JSP
	   * HttpServletRequest request : request.setAttribute(속성이름,값)
	   
	   * Spring
	   * Model model : model.addAttribute(속성이름,값)
	   * Model은 매개변수로 선언한다.
	   * DispatcherServlet -> Controller -> Method -> ViewResolver -> View로 값을 Model이 가져간다
	
	
	*/
	
	@RequestMapping(value = "view02", method = RequestMethod.GET)
	public String goView02(Model model) {
		model.addAttribute("name", "에밀리");
		model.addAttribute("age", "20");
		
		return "view02";
	}
	
	@RequestMapping(value = "view03", method = RequestMethod.GET)
	public String goView03() {
		return "view03";
	}
	
//	ModelAndView 클래스
//	Spring 2.0 이전부터 존재하던 클래스로, 주로 많이 사용되었다.
//	Model의 데이터값과 View를 함께 보내준다.
//	Model은 데이터 추가를 addObject("속성",값)
//	View는 setViewName("View 이름")
	@RequestMapping(value = "board/view04", method = RequestMethod.GET)
	public ModelAndView goView04() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("board/view04");
		return mav;
	}
	
	@RequestMapping(value = "board/view05", method = RequestMethod.GET)
	public ModelAndView goView05() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("name", "홍길동");
		mav.addObject("age", 30);
		mav.setViewName("board/view05");
		return mav;
	}
}
