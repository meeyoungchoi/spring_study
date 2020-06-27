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
	<h1>birth-form</h1>
	
	<form action="${path}/birth/form" method="post">
		#YEAR: <input type="text" name="bYear" placeholder="년">
		#MONTH: <input type="text" name="bMonth" placeholder="월">
		#DATE: <input type="text" name="bDate" placeholder="일">
		
		<button>제출</button>
		
	</form>
	
	
	
</body>
</html>