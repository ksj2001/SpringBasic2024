<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/contact/contactP/contactInsert" method="post">
		이름&nbsp;&nbsp;&nbsp;<input type="text" name="cName"><br>
		전화&nbsp;&nbsp;&nbsp;<input type="text" name="cPhone"><br>
		주소&nbsp;&nbsp;&nbsp;<input type="text" name="cAddress"><br>
		이메일&nbsp;&nbsp;&nbsp;<input type="text" name="cEmail"><br>
		비고&nbsp;&nbsp;&nbsp;<input type="text" name="cNote"><br>
		<input type="submit" value="새 연락처 등록하기">
		<input type="reset" value="다시 작성하기">
		<button type="button" onclick="location.href='/contact/contactP/contactListPage'">전체 연락처 보기
		</button>
	</form>
</body>
</html>