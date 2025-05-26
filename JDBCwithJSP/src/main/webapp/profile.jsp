<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.sql.*" errorPage="errorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display details</title>
</head>
<body>
	<%
	String url = "jdbc:mysql://localhost:3306/restdb";
	String username = "root";
	String password = "12345";
	Class.forName("com.mysql.cj.jdbc.Driver");
	String sql = "select * from alien where aname='Raju'";
	Connection con = DriverManager.getConnection(url, username, password);
	Statement st = con.createStatement();
	ResultSet res = st.executeQuery(sql);
	res.next();
	%>
	
	ID : <%= res.getString(1) %> <br> 
	NAME: <%= res.getString(2) %> <br>
	COURSE: <%= res.getString(3) %> <br>

</body>
</html>