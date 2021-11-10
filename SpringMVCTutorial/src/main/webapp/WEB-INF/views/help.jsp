<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello My name is Brijesh</h1>
	<h1>This is help page</h1>

	<%
	/*  String name = (String)request.getAttribute("name");
	 Integer rollnumber = (Integer) request.getAttribute("rollnumber"); */
	%>

	<h1>
		Hello My Name is
		<%-- <%=name %> --%>
		${name }
	</h1>
	<h2>This is my help page</h2>
	<h4>
		My rollNumber us
		<%-- <%=rollnumber %> --%>
		${rollnumber }
	</h4>
	<hr>
	<c:forEach var="item" items="${marks }">
	
	<h1>${item}</h1>

	</c:forEach>
</body>
</html>