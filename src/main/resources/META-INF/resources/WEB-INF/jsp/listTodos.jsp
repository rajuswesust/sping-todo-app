		<%@ include file="common/header.jspf" %>
		<%@ include file="common/navigation.jspf" %>

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
<%@ include file="common/footer.jspf"%>
