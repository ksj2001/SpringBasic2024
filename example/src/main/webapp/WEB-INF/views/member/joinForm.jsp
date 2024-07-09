<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/example/resources/css/joinForm.css">
</head>
<body>
	<div class="registerBox">
		<h2>Register</h2>
		<form action="/example/member/join" method="post">
			<label>아이디</label><br>
			<input type="text" name="id" placeholder="8~12자리의 영대소문자와 숫자 조합"><br>
			<label>비밀번호</label><br>
			<input type="password" name="pwd" placeholder="8~12자리의 영대소문자와 숫자 조합"><br>
			<label>이름</label><br>
			<input type="text" name="name" placeholder="홍길동"><br>
			<label>이메일</label><br>
			<input type="email" name="email" placeholder="example@fastcampus.co.kr"><br>
			<label>생일</label><br>
			<input type="text" name="birth" placeholder="2020/12/31"><br>
			<div class="selectSns">
				<input type="radio" name="sns" value="facebook">
				<label for="sns">페이스북</label>
				<input type="radio" name="sns" value="kakaotalk">
				<label for="sns">카카오톡</label>
				<input type="radio" name="sns" value="instagram">
				<label for="sns">인스타그램</label>
			</div>
			<input type="submit" value="회원 가입">
		</form>
	</div>
</body>
</html>