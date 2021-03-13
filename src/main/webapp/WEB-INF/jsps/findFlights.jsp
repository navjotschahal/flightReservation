<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Flight's</title>
</head>
<body>

	<h2>Search a flight</h2>

	<form action="findFlights" method="post">

		<label>From :</label>
		<input type="text" name="from"/>
		
		<label>To :</label>
		<input type="text" name="to"/>
		
		<label>Departure Date :</label>
		<input type="date" name="date" />
		
		<input type="submit" value="search" />
	
	</form>

</body>
</html>