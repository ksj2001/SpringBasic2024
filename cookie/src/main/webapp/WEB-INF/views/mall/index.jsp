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
	<h1>MALL INDEX</h1>
	<form action="/cookie/mall/main" method="get">
		<table>
		<tr>
			<td>구분</td>
			<td>
				<input type="radio" value="M" name="gender" checked>남성,
				<input type="radio" value="W" name="gender">여성
			</td>
		</tr>
		<tr>
			<td colspan="2"><input type="checkbox" name="cookieDel">쿠키삭제</td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="OK"></td>
		</tr>
	</table>
	</form>
	<%-- 
	<c:choose>
		<c:when test="${gender == 'M'}">
			남성 상품 노출
		</c:when>
		<c:when test="${gender == 'W'}">
			여성 상품 노출
		</c:when>
		<c:otherwise>
			남성, 여성 상품 노출
		</c:otherwise>
	</c:choose> --%>
</body>
</html>