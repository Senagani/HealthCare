
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body bgcolor="lightblue">
	<div align="center">
		<h1>File Upload to DB</h1>
		
			<form method="post" action="photoupload.form" enctype="multipart/form-data">
			<pre>
			      ID:     <input type="text" name="id" size="5">
				File :    <input type="file" name="filedata" size="5" />
			    USER      :<select name="user">
         <option value="-1">--select--</option>
		    <c:forEach items="${user}" var="user">
		   
		    <option value="${user.id}">
		    <c:out value="${user.username}"/></option>
		    </c:forEach>
		</select>  
	           <input type="submit" value="Upload" />
			</pre>
			</form>
			
	
	</div>
</body>
</center>
 <%-- <center>
 <footer size='10px' background: #366b82;>
Copyright &copy; chinnasoft.com</footer>
</center> --%>
</html>