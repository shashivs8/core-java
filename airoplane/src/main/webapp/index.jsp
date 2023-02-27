<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<title>X-Workz</title>
</head>
<body>
	<div>
		<nav class="navbar navbar-green bg-dark">
			<div>
				<img
					src="https://images.hindustantimes.com/img/2022/08/04/1600x900/go-first-_1659603871151_1659603879354_1659603879354.jpg"
					hight="80px" width="80px">

				<form action="find" method="get">
					<input  type="text" placeholder="Search"
						aria-label="Search" name="id"> 
						<div>
						<input type="submit"
						value="find"><a href="flight" class="btn btn-primary">Flight</a>
						</div>

				</form>
			</div>
		</nav>
	</div>
	<div style="color: blue">
	<h3 >>Welcome to Flight .........</h3>
	<%-- 	<span style="color: green">${dto}</span>
 --%>
 </div>
	<span style="color: red">${nu}</span>

	<h4>Display Detiles</h4>
<div>
	Company:<span>${dto.name}</span>
	</div>
	Flight<span>${dto.fname}</span>
	<br> cost
	<span>${dto.cost}</span>
	<br> type
	<span>${dto.type}</span>
	<br> country
	<span>${dto.country}</span>
	<br>


</body>
</html>