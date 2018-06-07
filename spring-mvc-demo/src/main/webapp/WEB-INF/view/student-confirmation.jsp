<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Student Confirmation Page</title>
	</head>
	<body>
	<!-- Spring MVC populates the data from the Model 
		 Spring looks on the Model for an Object called Student 
		 then using dot Notation translates student.firstName to looking for
		 getFirstName() on the Student Object -->	
	The Student is : ${student.firstName} ${student.lastName}<br><br>
	Country: ${student.country}<br><br>
	The Students favourite language is : ${student.favouriteLanguage}<br><br>
	Operating Systems 
		<ul>
		<!-- using jsp/jstl/core we have the forEach tag available to use.
			In the for each we declare a variable called temp and the use it to populate
			the unordered list, by operating on the LinkedHashMap that is returned by getOperatingSystems
			on the Student Object -->
		<c:forEach var="temp" items="${student.operatingSystems}">
			<li>${temp}</li>
		</c:forEach>
		</ul>
	</body>
</html>