<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>MEMBER JOIN</h1>
	<form action="${cp}/member/join" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="memId"></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><input type="text" name="memPw"></td>
			</tr>
			<tr>
				<td>MAIL</td>
				<td><input type="text" name="memMail"></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Join">
					<input type="reset" value="Cancel">
				</td>
			</tr>
		</table>
	</form>
	<a href="${cp}/">MAIN</a>
</body>
</html>