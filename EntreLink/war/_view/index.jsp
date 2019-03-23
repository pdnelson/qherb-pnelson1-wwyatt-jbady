<!DOCTYPE html>

<html>
	<head>
		<title>Index view</title>
	</head>

	<body>
		
		<form action="${pageContext.servletContext.contextPath}/addNumbers" method="get">
			<input type="Submit" name="submit" value="Add!">
		</form>
		<form action="${pageContext.servletContext.contextPath}/multiplyNumbers" method="get">
			<input type="Submit" name="submit" value="Multiply!">
		</form>
		<form action="${pageContext.servletContext.contextPath}/guessingGame" method="get">
			<input type="Submit" name="submit" value="Guessing Game!">
		</form>

	</body>
</html>
