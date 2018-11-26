<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<style type="text/css">
table {
margin: 0;
padding-top: 0;
}

</style>
</head>
<body>
<table>
<tr><td height="30" width="800" colspan="2" bgcolor="#234886">
<tiles:insertAttribute name="header"/>
</td>
</tr>
<tr><td width="280" height="120" bgcolor="#454545">
<tiles:insertAttribute name="menu"/>
</td>
<td height="560" width="1290" bgcolor="#C3CFE2">
<tiles:insertAttribute name="body"/>
</td>
</tr>
<tr><td height="30" colspan="2" width="1005" bgcolor="#454545">
<tiles:insertAttribute name="footer"/>
</td>
</tr>
</table>
</body>
</html>