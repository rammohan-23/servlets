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
${studs} <br>
<c:forEach items="${studs}" var="s">
	Name: ${s.name} <br>
	Roll Num: ${s.rollno} <br>
</c:forEach>
</body>
</html>