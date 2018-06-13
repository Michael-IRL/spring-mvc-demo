<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Customer Confirmation page</title>
	</head>
	<body>
		The customer is confirmed: ${customer.firstName} ${customer.lastName} 
		<br><br>
		Free Passes: ${customer.freePasses}
		<br><br>
		Post Code: ${customer.postalCode}
	</body>
</html>