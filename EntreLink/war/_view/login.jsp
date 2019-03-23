<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>EntreLink - Log in</title>
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>

	<body>
	
		<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
		
		<form action="${pageContext.servletContext.contextPath}/login" method="post">
			<!-- Super secret variable names so we don't get rekt by SQL injections :^) -->
			<input type="text" name="emailAsUsername" size="12" value="${emailAsUsername}" /><br>
			<input type="text" name="passwordOfUser" size="12" value="${passwordOfUser}" /><br>
			<input type="Submit" name="submitLoginData" value="Log in">
		</form>

		<c:if test="${! empty emailAsUsername}">
			<div class="returnData">${emailAsUsername}</div><br>
		</c:if>
		<c:if test="${! empty passwordOfuser}">
			<div class="returnData">${passwordOfUser}</div><br>
		</c:if>

	</body>
</html>
