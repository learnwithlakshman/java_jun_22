<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Cbook-login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<nav class="navbar bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="images/contact-icon.png" alt="" width="30"
				height="24" class="d-inline-block align-text-top"> CBook
			</a>
		</div>
	</nav>
	<hr>

	<div class="container">
		<div class="row">
			<div class="col-md-2 float-right">
					<a class="btn btn-primary" href="addcontact.jsp">Add New Contact</a>
			</div>
			<div class="col-md-8 offset-md-2">
				<table class="table">
					<thead>
						<tr>
							<th>id</th>
							<th>Name</th>
							<th>Email</th>
							<th>Mobile</th>
							<th>Edit</th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${contacts}" var="contact">
							<tr>
								<td>${contact.id}</td>
								<td>${contact.name}</td>
								<td>${contact.email}</td>
								<td>${contact.mobile}</td>
								<td><a href="editcontct?id=${contact.id}"><i class="fa fa-edit"></i></a></td>
								<td><a href="editcontct?id=${contact.id}"><i class="fa fa-trash"></i></a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>

		</div>
	</div>
</body>
</html>

