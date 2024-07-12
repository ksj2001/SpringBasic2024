<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/example/resources/css/loginForm.css">
</head>
<body>
	<div class="loginBox">
		<h2>Login</h2>
		<form action="/example/member/login" method="post">
			<input type="text" name="id" placeholder="이메일 입력"><br>
			<input type="password" name="pwd" placeholder="비밀번호"><br>
			<input type="text" name="toURL" value="${param.toURL}"><br>
			<input type="submit" value="로그인">
		</form>
		<div class="util">
			<input type="checkbox" name="saveId">
			<label for="saveId">아이디 기억</label>
			<a href="#">비밀번호 찾기</a>
			<a href="#">회원가입</a>
		</div>
	</div>
</body>
</html>