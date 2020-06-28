<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="path" value="<%=request.getContextPath() %>" scope="application"/>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>개별 학생 점수 조회</h1>
	
	<form method="post">
		#학번: <input type="text" name="stuNum" placeholder="학번입력">
		<button>전송</button>
	</form>
	
</body>
</html>