<!DOCTYPE html>

<html>
	<head>
		<title>EntreLink - Home</title>
	</head>

	<body>
		
		<form action="${pageContext.servletContext.contextPath}/login" method="get">
			<input type="Submit" name="submit" value="Log in">
		</form>
		
		<form action="${pageContext.servletContext.contextPath}/projects" method="get">
			<input type="Submit" name="submit" value="Projects">
		</form>

	</body>
</html>
