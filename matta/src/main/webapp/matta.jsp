<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				height="80" width="60"> </a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a href="index.jsp">home Page</a>
		</div>


	</nav>
    <form action="mattaAction" method="post"  class="container col-12 col-sm-6 col-md-3 shadow-lg p-4 mb-4 bg-white mx-auto d-block border border-primary rounded-lg 
m-5 pb-5 bg-info">
	
	<table>
	
	    <c:forEach items="${erros}" var="a">
		<span style="color:red">${a.message}</span><br>
		</c:forEach>
	
	<tr><td>name :</td><td><input type="text" name="name"></td></tr>
	
	<tr><td>Swamiji :</td><td><input type="text" name="swamijiName"></td></tr>
	
	
	<tr><td>location :</td><td><input type="text" name="location"></td></tr>
	
	 <tr><td> fund :</td><td><input type="text" name="fund"></td></tr>
          
	
	  <tr><td><input type="submit" value="save"/></td></tr>
          
	
	</table>
	
	
	</form>
	
	
	
	

</body>
</html>
