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
	<table border="1" width="600">
		<tr height="40">
			<th>id</th>
			<th>email</th>
			<th>password</th>
			<th>name</th>
			<th>age</th>
			<th>mobile</th>
			<th>조회</th>
			<th>삭제</th>
		</tr>
		<c:forEach items="${memberList}" var="member">
			<tr height="40">
				<td>${member.id}</td>
				<td>
					<a href="/member02/detail?id=${member.id}">${member.memberEmail}</a>
				</td>
				<td>${member.memberPassword}</td>
				<td>${member.memberName}</td>
				<td>${member.memberAge}</td>
				<td>${member.memberMobile}</td>
				<td>
					<a href="/member02/detail?id=${member.id}">조회</a>
				</td>
				<td>
					<button onclick="deleteMember('${member.id}')">삭제</button>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
<script type="text/javascript">
	const deleteMember = (id) => {
		console.log(id);
		location.href = "/member02/delete?id="+id;
	}
</script>
</html>