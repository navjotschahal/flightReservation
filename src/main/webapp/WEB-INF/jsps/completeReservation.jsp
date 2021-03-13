<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>

	<h2>Complete Reservation</h2>
	
	<pre>
	
		<label>Arrival City</label>
		<input type="text" name="airline" value="${ flight.arrivalCity }" disabled="disabled"/>
	
		<label>Departure City</label>
		<input type="text" name="airline" value="${ flight.departureCity }" disabled="disabled"/>
	
		<label>Operating Airline</label>
		<input type="text" name="airline" value="${ flight.operatingArlines }" disabled="disabled"/>
	
	</pre>
	
	
	<form action="completeReservation" method="post">
	
		<pre>
		
			<h2>Passenger Details :</h2>
			<label>First Name :</label>
			<input type="text" name="passengerFname"/>
			<label>Last Name :</label>
			<input type="text" name="passengerLastName"/>
			<label>E-mail :</label>
			<input type="email" name="passengerEmail"/>
			<label>Phone :</label>
			<input type="tel" name="passengerPhone"/>
			
			<h2>Card Details :</h2>
			<label>Name on the card :</label>
			<input type="text" name="nameOnTheCard"/>
			<label>Card number :</label>
			<input type="number" name="cardNumber"/>
			<label>Expiration Date :</label>
			<input type="date" name="expirationDate"/>
			<label>Security/CVV code :</label>
			<input type="number" name="securityCode"/>
			
			<input type="hidden" name="flightId" value="${ flight.id }"/>
			<input type="submit" value="Confirm - reservation"/>
		
		</pre>
		
	</form>	

</body>
</html>