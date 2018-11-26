<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table tr th {
	color: white;
	background-color: black;
}
</style>
</head>
<center>
<body style="background-color:lightblue">
<table border="0" ,cellspacing="1">
<tr>
<th>S.No</th><th>first name</th><th>last name</th><th>asset</th><th>blocks</th><th>flats</th><th>email</th><th>delete</th><th>update</th>
</tr>
<c:forEach items="${user}" var="users">
<tr>
<td><c:out value="${users.id}"/></td>
<td><c:out value="${users.firstname}"/></td>
<td><c:out value="${users.lastname}"/></td>
<td><c:out value="${users.asset}"/></td>
<td><c:out value="${users.blocks}"/></td>
<td><c:out value="${users.flats}"/></td>
<td><c:out value="${users.email}"/></td>
<td><a href='delete.form?id=<c:out value="${users.id}"/>'> &#9746;</a></td>
<td><a href='edit.form?id=<c:out value="${users.id}"/>'> &#8634;</a></td>
</tr>
</c:forEach>
</table>
</body>
</center>
<%--  <center>
 <footer size='10px' background: #366b82;>
Copyright &copy; chinnasoft.com</footer>
</center>< --%></html>





