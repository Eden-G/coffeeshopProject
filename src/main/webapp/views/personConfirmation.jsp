<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Books currently in the shop</title>
</head>
<body>
	<h1>Person added successfully</h1>
	<h3>Person Detail</h3>
	<br />
	<table border=2px>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
<<<<<<< HEAD
			<th>City</th>
			<td>State</td>
			<td>Country</td>
			<td>ZIP Code</td>
			<th>Phone</th>
			<th>Enable</th>
			
=======
			<th>Address</th>
			<th>Phone</th>
			<th>Enable</th>
>>>>>>> c86621785757ba0495c0fd239a3f210b27c98405
		</tr>
		<tr>
			<td>${person.firstName}</td>
			<td>${person.lastName}</td>
			<td>${person.email}</td>
<<<<<<< HEAD
			<td>${person.address.city}</td>
			<td>${person.address.state}</td>
			<td>${person.address.country}</td>
			<td>${person.address.zipcode}</td>
	
			<td>${person.phone}</td>
			<td>${person.enable}</td>
			<td><a href="/person/${person.id}">Edit</a></td>
=======
			<td>${person.address}</td>
			<td>${person.phone}</td>
			<td>${person.enable}</td>
			<td><a href="#">Edit</a></td>
>>>>>>> c86621785757ba0495c0fd239a3f210b27c98405
		</tr>
	</table>
	<br />
	<a href="secure">Go to home page</a>
</body>
</html>