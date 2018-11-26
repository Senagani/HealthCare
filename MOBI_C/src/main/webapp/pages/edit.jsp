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
<body style="background-color:lightblue">
<form action="update.form" method="post">
<pre>
firstname : <input type="text" name="id" value="${user.id}"readonly="readonly"/>
firstname : <input type="text" name="firstname" value="${user.firstname}"/>
lastname  : <input type="text" name="lastname" value="${user.lastname}"/>
assets    : <input type="text" name="asset" value="${user.asset}"readonly="readonly"/>
blocks    : <input type="text" name="blocks" value="${user.blocks}"readonly="readonly"/>
flats     : <input type="text" name="flats" value="${user.flats}"readonly="readonly"/>
email     : <input type="text" name="email" value="${user.email}"/>
<input type="submit" value="submit">


  


</pre></form>

</body>
</center>
 <%-- <center>
 <footer size='10px' background: #366b82;>
Copyright &copy; chinnasoft.com</footer>
</center> --%>
</html>