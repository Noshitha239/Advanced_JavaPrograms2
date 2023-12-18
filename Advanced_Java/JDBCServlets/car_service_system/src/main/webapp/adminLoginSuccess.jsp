<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
button {
	position: relative;
	font-size: 18px;
	font-weight: bold;
	transition:  box-shadow .3s ease-in-out;
	left: 42%;
	width: 250px;
	height: 40px;
	color:white;
	
	border-radius: 10px 10px;
	background-color:rgb(17, 90, 143,0.7);
}

button:hover {
	cursor: pointer;
	border: 3px solid rgb(17, 90, 143);
	box-shadow: inset 0 0 0 20px white;
	color: rgb(17, 90, 143);
}
</style>
</head>
<body style="Background-image: linear-gradient(90deg, rgba(17, 90, 143, 0.4), rgba(17, 90, 143, 0.4)), url('https://img.freepik.com/free-vector/auto-mechanic-repairing-vehicle-engine-isolated-flat-vector-illustration-cartoon-man-fixing-checking-car-with-open-hood-garage_74855-8227.jpg'); background-size: cover;">
	
<h1 style="margin-left:36%;color:white">You have successfully logged in</h1>
<a href="/car_service_system/RegisteredCustomers"><button>Register Customers</button></a><br><br>
<a href="/car_service_system/"><button>Service Requests</button></a><br><br>
<a href="/car_service_system/UpdateServiceStatus.html"><button>Update service status</button></a><br><br>
<a href="/car_service_system/"><button>Search customers</button></a><br><br>
<a href="/car_service_system/"><button>Search service Requests</button></a><br><br>
</body>
</html>