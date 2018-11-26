


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<center>
<body style="background-color:lightblue">

 <form:form action="submit.form" method="POST" commandName="user">
<table height= auto;>

<tr><td>ID: </td><td> <form:input path="id"/></td><td><font color="red"><form:errors path="id"/></font></td></tr>
<tr><td>FIRST NAME: </td><td> <form:input path="firstname"/></td><td><font color="red"><form:errors path="firstname"/></font></td></tr>
 <tr><td>LAST NAME: </td><td> <form:input path="lastname"/></td><td><font color="red"><form:errors path="lastname"/></font></td></tr>
 <tr><td>ASSETS:    </td><td> <form:input path="asset"/></td><td><font color="red"><form:errors path="asset"/></font> </td></tr>
<tr><td> BLOCKS:  </td>   <td>  <form:input path="blocks"/> </td> <td> <font color="red"><form:errors path="blocks"/></font> </td></tr>
<tr><td>FLATS:       </td> <td> <form:input path="flats"/> </td><td> <font color="red"><form:errors path="flats"/></font> </td></tr>
<tr><td> EMAIL:  </td> <td><form:input path="email"/> </td><td><font color="red"><form:errors path="email"/></font> </td></tr>
<tr><td> ROlE: <select name="role">
  <option value="Assetmanager">AM</option>
  <option value="propertymanager">PM</option>
  <option value="servicemange">AM</option>

</select>

<tr><td><input type="submit" value="submit"/></td></tr>

</table>
</form:form>

</body>
</center>
 <!-- <center>
 <footer size='10px' background: #366b82;>
Copyright &copy; chinnasoft.com</footer>
</center>
 -->