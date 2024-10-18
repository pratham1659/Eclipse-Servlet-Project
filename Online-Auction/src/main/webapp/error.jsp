<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html>

<head>

<style>
.content {
	height: 300px;
	position: absolute;
	margin: 155px 500px;
}
</style>

<meta charset="ISO-8859-1">

<title>Mathematical Operation</title>

</head>

<body>

	<div class="content">
		<form method="post" action="index.jsp">
			<fieldset style="width: 30%; background-color: #b3d1ff">
				<h2 style="text-align: center;">Mathematical Operation</h2>
				<hr>
				<font size=3 face="Times New Roman"> <input type="radio"
					name="a1" value="add" checked>Addition /><br> <input
					type="radio" name="a1" value="sub">Subtraction /><br>
					<input type="radio" name="a1" value="mul">Multiplication /><br>
					<input type="radio" name="a1" value="div">Division /><br>
				</font>
				<table>
					<tr>
						<td>Num1:</td>
						<td><input type="text" name="t1" value=""></td>
					</tr>
					<tr>
						<td>Num2:</td>
						<td><input type="text" name="t2" value=""></td>
					</tr>
					<br>
					<tr>
						<td></td>
						<td><input type="submit" name="result" value="Check result!"></td>
					</tr>
				</table>
			</fieldset>
		</form>
		<%@ page isErrorPage="true"%>
		<h3>Sorry an exception occured!</h3>
		Exception is:<%=exception%>
	</div>
</body>
</html>