<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

			<div class="col-md-6 offset-md-3">
				<a href="logout">Logout</a>	
				<form action="addtocartservlet" method="post">
					
						
						<div class="mb-3">
							<label for="username" class="form-label">Username </label> 
							<select class="form-control" name="scolor">
									<option value="green">Green</option>
									<option value="red">Red</option>
									<option value="yellow">Yellow</option>
									<option value="pink"> Pink</option>
									
							</select>
						</div>
					
						<div class="mb-3">
							<input type="submit" value="Submit" class="btn btn-primary">
						</div>

					
				</form>

			</div>
			<hr/>
			${cartitems }
		</div>
	</div>
</body>
</html>
