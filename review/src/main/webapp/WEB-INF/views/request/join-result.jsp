<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>join-result</h1>
	#ID: ${member.userId}
	#PW: ${member.userPw}
	#취미:
	<c:if test="${member.hobbys != null }">
		<c:forEach var="h" items="${member.hobbys}">
			${h}&nbsp;
		</c:forEach>

	</c:if>
	<c:if test="${member.hobbys == null}">
		<p>취미가 없다</p>
	
	
	</c:if>
	
	
	
	
	
	
	
	
	
	
</body>
</html>