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
	
	<form action="/member02/update" method="post" name="updateForm">
	    <input type="text" name="id" value="${mdto.id}"readonly><br><br>
	    <input type="text" name="memberEmail" value="${mdto.memberEmail}"readonly><br><br>
		<!-- <input type="text" name="memberPassword" placeholder="비밀번호"><br><br> -->
		<input type="text" name="memberName" placeholder="이름" value="${mdto.memberName}"><br><br>
		<input type="text" name="memberAge" placeholder="나이" value="${mdto.memberAge}"><br><br>
		<input type="text" name="memberMobile" placeholder="전화번호" value="${mdto.memberMobile}"><br><br>
		<input type="submit" value="회원정보수정">
		<!-- <input type="button" value="회원정보수정" onclick="update()"> -->
	</form>
</body>
<script>
    const update = () => {
        const passwordDB = '${mdto.memberPassword}';
        const password = document.getElementById("memberPassword").value;
        if (passwordDB == password) {
            document.updateForm.submit();
        } else {
            alert("비밀번호가 일치하지 않습니다!");
        }
    }
</script>
</html>