<!DOCTYPE html>
<html>
<!-- A jsp page to display what is entered into the helloworld-form -->
	<head>
	</head>
	<body>
	
	Hello World of Spring!
	<br/>
	<!-- 
	Display the variable studentName, this is done by binding the date entered in the form to the model
	that had the name "studentName"	
	 -->
	Student Name: ${param.studentName}
	
	<br/>
	<!-- Display the message that was added to the Model in the HelloWorldControler class with the tag "message" -->
	The Message: ${message}
	
	</body>
</html>