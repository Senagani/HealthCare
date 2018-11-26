<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
border-collapse: collapse;
}
table, tr, th {
	color: black;
	 text-align: center;
}
tr:nth-child(even){background-color: #f2f2f2}
#footer {
  position: absolute;
  bottom: 38;
  right: 10;
  height: 150px;
}
th {
    background-color: #4CAF50;
    color: white;
    text-align: center;
}
</style>

</head>

<body>

<table id="footer" bgcolor="#1F618D">
<tr height="15">
<th>S.No</th><th width="120">amount</th><th  width="120">payer</th><th  width="80">status</th><th  width="80">type</th>
</tr>
<c:forEach items="${payerinfo}" var="pay">
<tr height="10">
<td><c:out value="${pay.id}"/></td>
<td><c:out value="${pay.amount}"/></td>
<td><c:out value="${pay.payer.firstname}"/></td>
<td><c:out value="${pay.status}"/></td>
<td><c:out value="${pay.amounttype}"/></td>


</tr>
</c:forEach>
</table>
</body>