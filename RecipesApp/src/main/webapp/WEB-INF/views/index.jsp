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
	<div class="container">
		<div class="jumbotron">
			<form action="/show-cal">
				Text: <input type="text" name="q" value="chicken" required>
				<!-- 		 <div class="form-group">
 -->
					<select class="custom-select" id="test" name="filter">
						<option selected="">Filter by:</option>
						<option value="calories" name="calories" id="calories">Calories</option>
						<option value="diet">Diet Type</option>
					</select>
					<button type="button" class="btn btn-primary">Apply
						Filter</button>
					<span id="filter"></span>
					${calories}
				<!-- 		</div>
 -->
				<input type="submit" value="Submit">
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