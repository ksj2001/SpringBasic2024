package com.green.session.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler)
			throws Exception {
		
		   // 기존의 session이 존재하면 session 값을 가져오고, session이 존재하지 않으면 null을 반환한다.
		    HttpSession session = request.getSession(false);
		  
		  // 로그인이 안 된 상태
		  if(session == null || session.getAttribute("member") == null) {
			  response.sendRedirect( "/session/member/loginForm"); 
			  return false;
		  }
		  
		// 로그인이 된 상태  
		return true;
	}

	
	
	
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
