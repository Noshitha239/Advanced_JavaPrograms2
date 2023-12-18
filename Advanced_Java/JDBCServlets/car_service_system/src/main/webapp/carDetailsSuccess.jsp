<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="Background-image: linear-gradient(90deg, rgba(17, 90, 143, 0.4), rgba(17, 90, 143, 0.4)), url('https://img.freepik.com/free-vector/auto-mechanic-repairing-vehicle-engine-isolated-flat-vector-illustration-cartoon-man-fixing-checking-car-with-open-hood-garage_74855-8227.jpg'); background-size: cover;">
	

<h1 style="color: white; margin-left: 32%; padding: 20px; font-family: sans-serif"><%
String Uname=(String)session.getAttribute("sun");
out.println("Dear "+ Uname +", Successfully logged In.");
%></h1>

</body>
</html>