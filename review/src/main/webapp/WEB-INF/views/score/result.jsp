<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전채 학생 점수</h1>
	
	<c:forEach var="st" items="${scores}"  varStatus="stuNum">
		<p>
			#학번:${stuNum.index+1}<br>
		#이름:${st.stuName}<br>
		#국어:${st.kor}<br>
		#영어:${st.eng}<br>
		#수학:${st.math}<br>
		#총점:${st.total}<br>
		#평균:${st.average}<br>
		<a href="${path}/score/delete?stuNum=${stuNum.index + 1}">삭제</a>
		</p>
		
	</c:forEach>
	

	
	
	
</body>
</html>