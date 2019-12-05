<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/sketchy/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-N8DsABZCqc1XWbg/bAlIDk7AS/yNzT5fcKzg/TwfmTuUqZhGquVmpb5VvfmLcMzp"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<button class="navbar-toggler collapsed" type="button"
			data-toggle="collapse" data-target="#navbarColor01"
			aria-controls="navbarColor01" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="navbar-collapse collapse" id="navbarColor01" style="">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="/">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="/favorites">Favorites</a>
				</li>
			</ul>
		</div>
	</nav>
	<h1>${emptyness }</h1>
	<table class="table">
		<tr>
			<th>Picture</th>
			<th>Recipe Name</th>
			<th>Calories</th>
			<th>Source Link</th>
			<th>Remove From Favorites</th>
		</tr>
		<c:forEach var="r" items="${faves}">
			<tr>
				<td><img src="${r.image}" width="100px" height="100px"></td>
				<td><a href="/details?${r}&label=${r.label}">${r.label}</a></td>
				<td>${r.calories}</td>
				<td><a target="_blank" href="${r.url}">Source Link</a></td>
				<td><a class="btn btn-primary" href="/remove?id=${r.id}">Remove</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>