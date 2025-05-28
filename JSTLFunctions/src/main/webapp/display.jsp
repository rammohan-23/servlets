<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="sentence" value="Ram Mohan has a laptop"></c:set>
	Length : ${fn:length(sentence)} <br>
	Capital: ${fn:toUpperCase(sentence)} <br>
	Split based on a : 
	<c:forEach items="${fn:split(sentence, 'a')}" var="word">
		${word} <br>
	</c:forEach>
	 <br>
</body>
</html>