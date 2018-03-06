<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP first Page </title>
</head>
<body>
	<h1>Hello on fisrt JSP page</h1>
	<h1>${errorMessage}</h1>
	<form method="POST">
		Login: <input type="text" name="userName"></input> <input type="submit" value="login"></input>
		<br/>
		Password: <input type="password" name="password"></input>
	</form>
</body>
</html>