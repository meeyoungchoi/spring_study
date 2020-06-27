<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<c:set var="path" value="<%=request.getContextPath() %>" scope="application"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	
	<!--  
	<form action="<c:url value='/quiz'/>"  method="post">

	
		#ID: <input type="text" name="userId">
		#PW: <input type="text" name="userPw">
		<button>전송</button>
	</form>
	-->
	
	
	<form action="${path}/quiz"  method="post">
		#ID: <input type="text" name="userId">
		#PW: <input type="text" name="userPw">
		<button>전송</button>
	</form>
	
	
</body>
</html>