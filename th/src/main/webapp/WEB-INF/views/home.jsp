<%@ page session="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<div>
		<table border="1">
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>등록일</th>
			</tr>
			<c:forEach items="${board}" var="i" varStatus="s">
			<tr>
				<td><c:out value="${i.boardNo}" /></td>
				<td><a href="/detailBoard?boardNo=${i.boardNo}"><c:out value="${i.title}" /></a></td>
				<td>
				<fmt:parseDate value="${i.regDt}" var="dateFmt" pattern="yyyyMMddHHmmss"/>
				<fmt:formatDate value="${dateFmt}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
			</tr>
			</c:forEach>
			<c:if test="${empty board}">
				<tr>
					<td colspan="3">글이 없습니다.</td>
				</tr>
			</c:if>
		</table>
	</div>
	<P>The time on the server is ${serverTime}.</P>
	<h1>HOHO</h1>
</body> 
</html>
