<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
	<head>
		<!-- Use Spring Url Tag to map the resources according to the spring-mvc-demo.xml -->
		<spring:url value="/resources/style.css" var="styleCss" />
		<link rel="stylesheet" href="${styleCss}"/>
		
		<title>Customer Registration Form</title>
		
	</head>
	<body>
		<i>Fill out the form. Asterisk(*)means required</i>
		<form:form action="processForm" modelAttribute="customer">			
			First Name: <form:input path="firstName"/>
			<br><br>
			Last Name(*):<form:input path="lastName"/>
			<form:errors path="lastName" cssClass="error"/>
			<br><br>
			Free passes:<form:input path="freePasses"/>
			<form:errors path="freePasses" cssClass="error"/>
			<br><br>
			Post Code:<form:input path="postCode"/>
			<form:errors path="postCode" cssClass="error"/>
			<br><br>
			<input type="submit" value="Submit">
		</form:form>
	</body>
</html>