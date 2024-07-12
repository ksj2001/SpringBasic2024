<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="/example/resources/css/menu.css">
</head>
<body>
    <%-- <h1>${member.getId() }</h1> --%>
    <c:set var="loginOut" value="${member.getId() == null ? 'Login' : 'Logout'}"/>
    <c:set var="loginOutLink" value="${member.getId() == null ?'/example/member/loginForm' : '/example/member/logout'}"/>
    <c:set var="signInDeleteAcc" value="${member.getId() == null ? 'Sign in' : 'Delete Account'}"/>
    <c:set var="signInDeleteAccLink" value="${member.getId() == null ? '/example/member/joinForm' : '/example/member/deleteAcc'}"/>
	<div class="menuBar">
		<ul>
			<li><a href="/example">Home</a></li>
			<li><a href="/example/member/boardList">Board</a></li>
			<li><a href="${loginOutLink}">${loginOut}</a></li>
			<li><a href="${signInDeleteAccLink}">${signInDeleteAcc}</a></li>
		</ul>
	</div>
	<div class="content">
		<h1>This is HOME</h1>
		<h1>This is HOME</h1>
		<h1>This is HOME</h1>
	</div>
</body>
</html>