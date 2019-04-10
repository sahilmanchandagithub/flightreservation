<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flights</title>
</head>
<body>
<h2>Flight:</h2>
<table>

<tr>
<th> Airlines</th>
<th> Departure City</th>
<th> Departure Time</th>

</tr>
<c:forEach  items = "${flights}" var ="flights"/>
<tr>
<td>${flight.operatingAirlines}}</td>
<td>${flight.departureCity}}</td>
<td>${flight.arrivalCity}}</td>
<td> <a href ="showCompleteReservation?flightId=${flight.id}"> Select</a></td>



</table>



</body>
</html>