<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
	border-collapse: collapse;
}
/* td{
	align="center";
} */
</style>
</head>
<body>
	<table width="600" border="1">
		<tr height="40" align="center">
			<td>번호</td>
			<td>성명</td>
			<td>전화</td>
			<td>주소</td>
			<td>이메일</td>
			<td>비고</td>
		</tr>
		<c:forEach items="${contactList}" var="contact">
			<tr height="40" align="center">
				<td>${contact.cNo}</td>
				<td>
					<a href="/contact/contactP/contactViewPage?cNo=${contact.cNo}">${contact.cName}</a>
				</td>
				<td>${contact.cPhone}</td>
				<td>${contact.cAddress}</td>
				<td>${contact.cEmail}</td>
				<td>${contact.cNote}</td>
			</tr>
		</c:forEach>
		<tr height="40" align="center">
			<td colspan="6">
				<button type="button" onclick="location.href = '/contact/contactP/contactInsertPage'">
				새 연락처 등록</button>
			</td>
		</tr>
	</table>
</body>
</html>