<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>


</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> 
				<a href="index.jsp">Home_Page</a>
		</div>
	</nav>

	<h2>Beach Details</h2>
	<form action="beach">
	Name <input type="text" name="name" />
	Location <input type="text" name="location" />
	Clean  Yes:<input type="radio" name="clean" value="true" />
			No:<input type="radio" name="NotClean" value="false" />
	Games     Yes:<input type="radio" name="games" value="true" />
			No:<input type="radio" name="Nogames" value="false" />
		<input type="submit" value="send" class="btn btn-dark">
	</form>


<body>

</body>
</html>