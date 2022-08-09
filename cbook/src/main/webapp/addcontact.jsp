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
</head>
<body>
	<nav class="navbar bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="/docs/5.2/assets/brand/bootstrap-logo.svg" alt="" width="30"
				height="24" class="d-inline-block align-text-top"> CBook
			</a>
		</div>
	</nav>
	<hr>

	<div class="container">
		<div class="row">

			<div class="col-md-6 offset-md-3">

				<form action="addcontact" method="post">
					
						<div class="text-center text-info"><h3>Login</h3></div>
						<div class="mb-3">
							<label for="name" class="form-label">Name </label> <input
								type="text" class="form-control" id="name" name="name"
								placeholder="Enter valid name">
						</div>
						<div class="mb-3">
							<label for="email" class="form-label">Email </label> <input
								type="text" class="form-control" id="email" name="email"
								placeholder="Enter valid email">
						</div>
						<div class="mb-3">
							<label for="mobile" class="form-label">Mobile </label> <input
								type="text" class="form-control" id="mobile" name="mobile"
								placeholder="Enter valid mobile">
						</div>
						
						
						<div class="mb-3">
							<input type="submit" value="Add Contact" class="btn btn-primary">
						</div>

					
				</form>

			</div>

		</div>
	</div>
</body>
</html>
