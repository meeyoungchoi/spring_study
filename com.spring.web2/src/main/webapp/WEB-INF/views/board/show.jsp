<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 상세조회</h1>
	
	<form method="get" action="/web2/board/update">
		#글번호: <input type="text" readonly="readonly" value="${boardNo}">
		#작성자: <input type="text" readonly="readonly" value="${board.userId}">
		#제목: <input type="text"  value="${board.title}">
		#내용: <input type="text"  value="${board.content}"><br>
		<button>수정</button>
	</form>
	
	
	
	
</body>
</html>