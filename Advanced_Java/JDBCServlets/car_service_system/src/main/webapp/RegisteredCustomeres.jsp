<%@page import="com.gqt.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Customer> customerList=(List<Customer>)session.getAttribute("scustomerList");

%>
<h1>Registered customers are :</h1>
<%
for(Customer x:customerList){
	out.println(x);//optional
	out.println(x.getName()+"  "+x.getUn()+"  "+x.getEmail());
}
%>
</body>
</html>