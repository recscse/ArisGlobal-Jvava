<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome , ${user.userName }</h1>
<h2>Your email address is ${user.email }</h2>
<h4>Your Password is ${user.password}</h4>
 <h6>You have successfully signup</h6>
</body>
</html>