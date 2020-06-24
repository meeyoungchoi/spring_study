<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${boards.size() <=0 }">
		<p>�ۼ��� �Խñ��� �����ϴ�.</p>
	</c:if>	
	
	
	<c:if test="${boards.size() > 0}">
	
			<h1>�Խù� ���</h1>
	
	
	
		<table>
			<thead>
				<tr>
					<td>#</td>
					<td>Name</td>
					<td>Title</td>
				
				</tr>
			
			</thead>
			

			<tbody>
			<c:forEach var="b" items="${boards}"  varStatus="contentNum">
				<tr>
					<td>${contentNum.index+1}</td>
					<td>${b.userId}</td>
					<td>
					<a href="/web2/board/show?boardNo=${contentNum.index+1}">${b.title}</a>
					</td>
					<td>
						<a href="/web2/board/delete?boardNo=${contentNum.index+1}">����</a>
					</td>
				
				</tr>
			</c:forEach>
	
			
			</tbody>
	
		
		
		</table>
		
		
	</c:if>
	
	<p>
		<a href="/web2/board/write">�۾���</a>
	
	</p>
	
	
</body>
</html>