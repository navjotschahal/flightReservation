<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<h2>User Login</h2>

	<form action="login" method="post">
	
		<pre>
			<label>User Name :</label>
			<input type="text" name="email"/>
			
			<label>Password :</label>
			<input type="password" name="password"/>
			
			<input type="submit" value="login" />
		</pre>
		
		${msg}
		
	</form>
	
</body>
</html>