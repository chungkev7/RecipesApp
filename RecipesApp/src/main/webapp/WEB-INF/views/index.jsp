<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recipe Home Page</title>
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
	<div class="container">
		<div class="jumbotron">
			<form action="/search?">
				Text: <input type="text" name="q" value="" required> <br>
				<input type='number' name="cal1"> and <input type='number'
					name="cal2">calories <select class="custom-select"
					id="test" name="diet">
					<option selected="">Select option</option>
					<option value="balanced">Balanced</option>
					<option value="high-protein">High Protein</option>
					<option value="high-fiber">High Fiber</option>
					<option value="low-fat">Low Fat</option>
					<option value="low-carb">Low Carb</option>
					<option value="low-sodium">Low Sodium</option>
				</select> ${calories}
				<!-- <form action="/show-cal"> -->
				<!-- <br> Filter by:<select class="custom-select" id="test"
					name="filter">
					<option selected="">Select option</option>
					<option value="calories" id="calories">Calories</option>
					<option value="diet">Diet Type</option>
				</select>
				<input type="button" class="btn btn-primary" value="Apply Filter">
				<span id="filter"></span>  -->
				<!-- </form> -->
				<input type="submit" value="Submit"> <br>
			</form>
		</div>
	</div>
	<script>
		function showMe() {
			var option = document.getElementById("test").value;
			/* if (option === "calories") {
			}  */
			document.getElementById('filter').innerHTML = "<span>Between<input type="number"> and <input type="number">calories</span>"
			console.log(filter);
			console.log(option);
		}
	</script>
</body>
</html>