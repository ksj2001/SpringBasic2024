<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1,h2,h3,h4,h5,h6,p{
	margin: 0;
}
</style>
</head>
<body>
	<h3>${contact.cNo}번 연락처</h3><br>
	<p>
		이름 : ${contact.cName}<br>
		전화 : ${contact.cPhone}<br>
		주소 : ${contact.cAddress}<br>
		이메일 : ${contact.cEmail}<br>
		비고 : ${contact.cNote}<br>
	</p><br>
	<h3>정보를 수정하고 수정하기 버튼을 클릭하세요</h3><br>
	<form method="post">
		<input type="text" name="cName" value="${contact.cName}"><br>
		<input type="text" name="cPhone" value="${contact.cPhone}"><br>
		<input type="text" name="cAddress" value="${contact.cAddress}"><br>
		<input type="text" name="cEmail" value="${contact.cEmail}"><br>
		<input type="text" name="cNote" value="${contact.cNote}"><br>
		<input type="hidden" name="cNo" value="${contact.cNo}"><br>
		<input type="button" value="수정하기" onclick="fn_update(this.form)">
		<input type="button" value="삭제하기" onclick="fn_delete(this.form)">
	</form>
</body>
<script>
	function fn_update(f){
		f.action = "contactUpdate";
		f.submit();
	}
	function fn_delete(f){
		if(confirm("삭제할까요?")){
			f.action = "contactDelete";
			f.submit();
		}
	}
</script>
</html>