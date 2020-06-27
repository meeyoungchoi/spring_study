<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입</h1>
	
	<form method="post">
		#ID: <input type="text" name="userId"><br>
		#PW: <input type="text" name="userPw"><br>
		#Hobby: 
		<input type="checkbox" name="hobbys" value="reading">독서&nbsp;
		<input type="checkbox" name="hobbys" value="music">음악감상&nbsp;
		<input type="checkbox" name="hobbys" value="movie">영화&nbsp;
		
		<button>전송</button>
	
	</form>
	
</body>
</html>