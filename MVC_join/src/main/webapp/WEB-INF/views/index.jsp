<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		display: flex;
		justify-content: center;
		align-items: center;
	}
	.registerBox{
		width: 300px;
		height: 550px;
		border: 1px solid #5975C4;
		padding: 0 50px;
		border-radius: 5px;
	}
	.registerBox h2{
		font-size: 40px;
		font-weight: 500;
		text-align: center;
		margin-bottom: 80px;
	}
	input{
		width: 100%;
		height: 20px;
		margin: 5px 0;
		padding: 2px 5px;
		border: 1px solid #5975C4;
		border-radius: 3px;
	}
	.selectSns{
		margin: 10px 5px;
		text-align: center;
	}
	input[type=radio]{
		width:15px;
		height:15px;
		margin-right: 3px;
	}
	input[type=submit]{
		width:310px;
		height:30px;
		border-color: white;
		color: white;
		background-color: #5975C4;
	}
</style>
</head>
<body>
	<div class="registerBox">
		<h2>Register</h2>
		<form action="member/register" method="post">
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
				<input type="radio" name="sns" value="facebook">페이스북
				<input type="radio" name="sns" value="kakaotalk">카카오톡
				<input type="radio" name="sns" value="instagram">인스타그램
			</div>
			<input type="submit" value="회원 가입">
		</form>
	</div>
</body>
</html>