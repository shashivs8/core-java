<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Waterpurifier </title>
<!-- <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1"> -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg-navbar-Light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src=" https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" width="80" height="48" class="d-inline-block align text-top">
			</a> <a href="index.jsp">Homepage</a> 
		</div>
	</nav>
	<h1>Welcome to search Page</h1>
	<h4 style="color: red">${mesage}</h4>
		<h5 style="color: green;">
		Name:${dto.name}<br>
		 Swamiji :${dto.swamijiName}<br>
		Location:${dto.location}<br> 
		Fund:${dto.fund}<br>
	</h5>
	<form action="find">
		<input type="search" name="id"> <input type="submit"
			value="search">
	</form>

</body>
</html>