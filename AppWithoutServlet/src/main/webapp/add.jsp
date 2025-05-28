<%@
	page import="java.util.List, java.util.ArrayList"
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body bgcolor="cyan">
	<%!
		int temp = 100;
		List<String> lst = new ArrayList<>();
	%>

	<%
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
	
		int k = i + j;
		out.println("Output:" + k);
	%>
	
	
	My favorite number is : + <%= temp %>

</body>
</html>