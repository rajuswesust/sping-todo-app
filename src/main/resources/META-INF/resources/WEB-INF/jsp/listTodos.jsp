<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">

<title>login page</title>
</head>
<body>
	<div class="container">
		<h2>welcome ${name}</h2>
		<hr>
		<h3>Your todos are :</h3>

		<table class="table">
			<thead>
				<tr>
<!-- 					<th>id</th> -->
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
<%-- 						<td>${todo.getId()}</td> --%>
						<td>${todo.getDescription()}</td>
						<td>${todo.getTargetDate()}</td>
						<td>${todo.isDone()}</td>
						<td><a href="delete-todo?id=${todo.getId()}" class="btn btn-warning">DELETE</a></td>
						<td><a href="update-todo?id=${todo.getId()}" class="btn btn-success">UPDATE</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="add-todo" class="btn btn-success">Add Todo</a>
		
	</div>
	<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>
