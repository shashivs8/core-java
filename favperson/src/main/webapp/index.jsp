<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shashi</title>
</head>
<body>
<h5>Sending info to fav</h5>
<form action="fav" method="post">
<pre>
FirstName <input type="text" name="firstName" />
<br>
LastName<input type="text" name="lastName" />
<br>
Gender <input type="text" name="gender">
<br>
Reason <input type="text" name="reason">
<br>
Address <textarea rows="5" cols="15" name="address"></textarea>
</pre>
<input type="submit" value="send">

</form>

</body>
</html>