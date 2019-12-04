<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Recipe List</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
</head>
<body>

	<table class="table">
		<tr>
			<th>Picture</th>
			<th>Recipe Name</th>
			<th>Calories</th>
			<th>Add to Favorites</th>
			<th>Source Link</th>
		</tr>
		<c:forEach var="r" items="${test}">
			<tr>
				<td><img src="${r.recipe.image}" width="100px" height="100px"></td>
				<td><a href="/details?${r}&label=${r.recipe.label}">${r.recipe.label}</a></td>
				<td>${r.recipe.calories}</td>
				<td><a href="/add-recipe?${r}&label=${r.recipe.label}"
					class="btn btn-primary">Add to Favorites</a></td>
				<td><a href="${r.recipe.url}">Source Link</a></td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>