<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
 

<body>
<form action="payment.form" method="post">
 
<pre>
S.NO        :<input type="text" name="id"/><br/>
PAYER       :<select name=payer.id>
         <option value="-1">--select--</option>
		    <c:forEach items="${userlistobj}" var="payer">
		   
		    <option value="${payer.id}">
		    <c:out value="${payer.firstname}"/></option>
		    </c:forEach>
		</select>  
AMOUNT     : <input type="text" name="amount"/><br/>  
STATUS     : <input type="text" name="status"/><br/>  
TYPE       : <input type="text" name="amounttype"/><br/>
 
             <input type="submit" value="pay"/>
</pre>  
</form> 
</body>

<%--  <center>
 <footer size='10px' background: #366b82;>
Copyright &copy; chinnasoft.com</footer>
</center> --%>