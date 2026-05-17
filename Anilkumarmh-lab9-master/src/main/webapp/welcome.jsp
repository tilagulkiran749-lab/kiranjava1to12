<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<%
String name = request.getParameter("uname");

// Greeting message
out.print("<h2>Hello " + name + "!</h2>");

// Store name in session
session.setAttribute("user", name);

// Set session expiry time (in seconds)
session.setMaxInactiveInterval(60); // 1 minute

out.print("<p>Session started successfully.</p>");
out.print("<p>Session expiry time: 1 minute</p>");

out.print("<p>Click below link within 1 minute or wait for expiry:</p>");
%>

<a href="second.jsp">Check Session</a>

</body>
</html>