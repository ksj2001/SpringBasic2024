<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>id</td>
			<td>${member.id}</td>
		</tr>
		<tr>
			<td>email</td>
			<td>${member.memberEmail}</td>
		</tr>
		<tr>
			<td>password</td>
			<td>${member.memberPassword}</td>
		</tr>
		<tr>
			<td>name</td>
			<td>${member.memberName}</td>
		</tr>
		<tr>
			<td>age</td>
			<td>${member.memberAge}</td>
		</tr>
		<tr>
			<td>mobile</td>
			<td>${member.memberMobile}</td>
		</tr>
	</table>
</body>
</html>