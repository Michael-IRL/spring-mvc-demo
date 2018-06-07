<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
	<head>		
		<title>Student Form</title>
	</head>
	<body>
		<!-- create a Spring form that add its data a student object that was added to
			 the Model in the StudentController class while processing the /showForm mapping -->
		<form:form action="processForm" modelAttribute="student">
			<!-- Spring MVC will use setter to add firstName and lastName to the Student Object.
				 Spring will take firstName and convert it to setFirstName(String firstName) so this method must 
				 be available on the Student Object -->		
			First Name: <form:input path="firstName"/>			
			<br><br>
			Last Name: <form:input path="lastName"/>
			<br><br>
			Select Country: 
			<form:select path="country">
			<!-- By using dot notation Spring MVC will look of a get method of the name after the dot
				 on the Object before the dot in the exampel below it is the Student Object and the 
				 getCountryOptions() method  -->
				<form:options items="${student.countryOptions}"/>				
			</form:select>
			<br><br>
			Favourite Language:
			Java <form:radiobutton path="favouriteLanguage" value="Java"/>
			C# <form:radiobutton path="favouriteLanguage" value="C#"/>
			PHP <form:radiobutton path="favouriteLanguage" value="PHP"/>
			Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
			<br><br>
			Operating Systems : 
			Linux<form:checkbox path="operatingSystems" value="Linux"/>
			Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
			MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
			<br><br>
			<input type="submit" value="Submit"/>
		</form:form>
	</body>
</html>