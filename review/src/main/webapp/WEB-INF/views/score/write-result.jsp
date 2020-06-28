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
	<h1>write-result</h1>
	
	<a href="${path}/score/register">다른 점수 등록하기</a>
	<a href="${path}/score/result">전체 점수 조회하기</a>
	<a href="${path}/score/search">개별 점수 조회하기</a>
	
	
	
</body>
</html>