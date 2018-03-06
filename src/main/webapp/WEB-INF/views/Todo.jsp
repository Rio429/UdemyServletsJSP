<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Hello ${name} Your tasks are: </h1>
	<ol>
		<c:forEach items="${todos}" var="todo">
			<li>${todo.todo} &nbsp <a href="/delete-todo?deleteTodo=${todo.todo}">Delete</a></li>
		</c:forEach>
	</ol>
	<br/>
	<form action="/todo" method="POST">
		<input type="text", name="newTodo"></input> <input type="submit", value="Add"></input>
	</form>
	<br/>
	<h3><a href="/logout">Logout</a></h3>
</body>
</html>