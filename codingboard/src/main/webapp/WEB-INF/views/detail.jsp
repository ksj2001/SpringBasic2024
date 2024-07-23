<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="300">
		<tr>
			<th>no</th>
			<td>${bdto.boardNo}</td>
		</tr>
		<tr>
			<th>writer</th>
			<td>${bdto.boardWriter}</td>
		</tr>
		<tr>
			<th>date</th>
			<td>${bdto.boardCreatedTime}</td>
		</tr>
		<tr>
			<th>hits</th>
			<td>${bdto.boardHits}</td>
		</tr>
		<tr>
			<th>title</th>
			<td>${bdto.boardTitle}</td>
		</tr>
		<tr>
			<th>contents</th>
			<td>${bdto.boardContents}</td>
		</tr>
	</table>
	<button type="button" onclick="listFn()">목록</button>
	<button type="button" onclick="updateFn()">수정</button>
	<button type="button" onclick="deleteFn()">삭제</button>
</body>
<script>
	const listFn = () => {
		// const page = '${page}';
		location.href = "/codingboard/list";
	}
	const updateFn = () => { const boardNo = '${bdto.boardNo}';
		location.href = "/codingboard/update?boardNo=" + boardNo;
	}
	const deleteFn = () => { const boardNo = '${bdto.boardNo}';
		location.href = "/codingboard/delete?boardNo=" + boardNo;
	}
</script>
</html>