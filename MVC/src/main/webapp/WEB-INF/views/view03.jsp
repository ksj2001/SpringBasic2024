<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.green.mvc.dto.PersonDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 스크립트릿을 이용하여 스프링의 Bean 객체를 연결해준다  -->
	<h2>view03.jsp입니다.</h2>
	<%
		WebApplicationContext wac 
		= WebApplicationContextUtils.getWebApplicationContext(application);
	    
	    PersonDTO p1 = wac.getBean("person1",PersonDTO.class);
	    PersonDTO p2 = wac.getBean("person2",PersonDTO.class);
	    
	    pageContext.setAttribute("p1",p1);
	    pageContext.setAttribute("p2",p2);
	%>
	<h3>사용자1</h3>
	<li>
		<ul>이름: ${p1.name}</ul>
		<ul>나이: ${p1.age }</ul>
		<ul>전화: ${p1.cdto.phone}</ul>
		<ul>주소: ${p1.cdto.add}</ul>
	</li>
	
	<h3>사용자2</h3>
	<li>
		<ul>이름: ${p2.name}</ul>
		<ul>나이: ${p2.age }</ul>
		<ul>전화: ${p2.cdto.phone}</ul>
		<ul>주소: ${p2.cdto.add}</ul>
	</li>
</body>
</html>