<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Main Screen</h3>
	<!-- form의 action은 RequestMapping의 주소를 입력한다. -->
	<form action="board/view03" method="post">
		<label>제목</label>
		<input type="text" name="title"><br>
		<label>내용</label>
		<input type="text" name="content"><br>
		<label>조회수</label>
		<input type="text" name="viewcount"><br>
		<input type="submit" value="입력">
	</form>
</body>
</html>