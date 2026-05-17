<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Result</title>
</head>
<body>

<h2>Student Result</h2>

<%
String error = (String)request.getAttribute("error");

if(error != null){
%>
    <h3 style="color:red;"><%= error %></h3>
<%
} else {
%>

Roll No: <%= request.getAttribute("roll") %><br>
Name: <%= request.getAttribute("name") %><br>

Marks:<br>
Sub1: <%= request.getAttribute("s1") %><br>
Sub2: <%= request.getAttribute("s2") %><br>
Sub3: <%= request.getAttribute("s3") %><br>
Sub4: <%= request.getAttribute("s4") %><br>
Sub5: <%= request.getAttribute("s5") %><br>

<br>
Average: <%= request.getAttribute("avg") %><br>
Result: <%= request.getAttribute("result") %><br>

<%
}
%>

<br>
<a href="index.jsp">Go Back</a>

</body>
</html>