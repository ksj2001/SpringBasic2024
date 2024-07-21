<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <set var="mdto" value="${sessionScope.mdto}"></set>
	<set var="name" value="${sessionScope.name}"></set> --%>
	<h1>${sessionScope.email}</h1>
	<h1>${sessionScope.name}</h1>
	
	<%-- <form action="/member02/update" method="post">
		<input type="text" name="memberEmail" placeholder="이메일" value="${mdto.memberEmail}"><br><br>
		<!-- <input type="text" name="memberPassword" placeholder="비밀번호"><br><br> -->
		<input type="text" name="memberName" placeholder="이름" value="${mdto.memberName}"><br><br>
		<input type="text" name="memberAge" placeholder="나이" value="${mdto.memberAge}"><br><br>
		<input type="text" name="memberMobile" placeholder="전화번호" value="${mdto.memberMobile}"><br><br>
		<input type="submit" value="회원정보수정">
	</form> --%>
</body>
</html>