<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*" %>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List Owners and their pets</title>
</head>
<body>
<form action="cargarListado" method="post">
	<input type="submit" value="ver listado">
</form>


<%
List<Pet> pets = (List<Pet>)request.getAttribute("listAllPets");
 pageContext.setAttribute("pets", pets);
%>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

<table border="1">
	<thead>
		<tr>
			<td>Cod Owner</td>
			<td>Name</td>
			<td>Chip</td>

		</tr>
	</thead>
	<tbody>
		<c:forEach var="pet1" items="${listAllPets}">
			<tr>
				<td><c:out value="${pet1.codOwner}"/> </td>
				<td><c:out value="${pet1.nombreMascota}"/> </td>
				<td><c:out value="${pet1.identificadorChip}"/> </td>

	    	</tr>
		</c:forEach>
	</tbody>
</table>

</body>
</html>