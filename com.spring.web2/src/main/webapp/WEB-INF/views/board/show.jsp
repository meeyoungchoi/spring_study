<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>�Խñ� ����ȸ</h1>
	
	<form method="get" action="/web2/board/update">
		#�۹�ȣ: <input type="text" readonly="readonly" value="${boardNo}">
		#�ۼ���: <input type="text" readonly="readonly" value="${board.userId}">
		#����: <input type="text"  value="${board.title}">
		#����: <input type="text"  value="${board.content}"><br>
		<button>����</button>
	</form>
	
	
	
	
</body>
</html>