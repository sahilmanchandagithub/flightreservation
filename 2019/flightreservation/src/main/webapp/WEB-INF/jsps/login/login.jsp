<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER LOGIN</title>
</head>
<body>

<h2>Login:</h2>
<form action = "login" method ="post">

<pre>

USER Name : <input type= "text"  name ="email">
Password  : <input type= "password"  name ="password">

<input type= "submit"  name ="Login">
${msg}
</pre>
</body>
</html>