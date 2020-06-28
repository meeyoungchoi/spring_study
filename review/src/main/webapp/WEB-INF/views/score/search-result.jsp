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
	<h1>학생 개별 점수</h1>
	#학생번호:${stuNum}<br>
	#학생이름: ${stu.stuName}<br>
	#국어: ${stu.kor}<br>
	#영어: ${stu.eng}<br>
	#수학: ${stu.math}<br>
	#총점: ${stu.total}<br>
	#평균: ${stu.average}<br>
	
	
	
</body>
</html>