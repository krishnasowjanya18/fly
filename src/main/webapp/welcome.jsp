<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to the world</title>
</head>
<!--travel details, like the date of travel, source, destination, and the number of persons.-->
<body>

	<form action="/getAllFlights" method="post" target="flight">
		<div>
			<label for="dateOfTravel">Date Of Travel: </label> <input type="date"
				name="dataOfTravel">
		</div>
		<div>
			<label for="source">Source: </label> <input type="text" name="source">
		</div>
		<div>
			<label for="destination">Destination: </label> <input type="text"
				name="destination">
		</div>
		<div>
			<label for="noOfPersons">no.of.persons: </label> <input type="text"
				name="noOfPersons">
		</div>
		<input type="submit" value="Search">
	</form>
</body>
</html>