<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" user="root"
		password="12345" url="jdbc:mysql://localhost:3306/restdb" />
	<sql:query dataSource="${db}" var="rs">select * from alien</sql:query>
	
	<c:forEach items="${rs.rows}" var="alien">
		${alien.aid} : ${alien.aname} : ${alien.tech} <br>
	</c:forEach>
</body>
</html>