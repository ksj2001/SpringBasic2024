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
		
		   // ������ session�� �����ϸ� session ���� ��������, session�� �������� ������ null�� ��ȯ�Ѵ�.
		    HttpSession session = request.getSession(false);
		  
		  // �α����� �� �� ����
		  if(session == null || session.getAttribute("member") == null) {
			  response.sendRedirect( "/session/member/loginForm"); 
			  return false;
		  }
		  
		// �α����� �� ����  
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
