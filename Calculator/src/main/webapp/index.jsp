<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.content {
	height: 200px;
	position: absolute;
	margin: 100px 500px;
}
</style>
<meta charset="UTF-8">
<title>Mathematical Operation</title>
</head>
<body>
	<div class="content">
		<form method="post" action="index.jsp">
			<fieldset style="width: 30%; background-color: #b3d1ff">
				<h2 style="text-align: center;">Mathematical Operation</h2>
				<hr>
				<font size=3 face="Times New Roman"> 
				<input type="radio"	name="a1" value="add" checked>Addition </input><br> 
				<input type="radio" name="a1" value="sub">Subtraction </input><br> 
				<input type="radio" name="a1" value="mul">Multiplication </input><br>
				<input type="radio" name="a1" value="div">Division </input><br>
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
					
					<tr>
						<td><input type="submit" name="result" value="Check result!"></td>
					</tr>
				</table>
			</fieldset>
		</form>
	<%--  <h1 style="text-align: center;">Result for <%=request.getParameter("a1")%></h1> --%>
		<%
		String num1 = request.getParameter("t1");

		String num2 = request.getParameter("t2");

		int i = Integer.parseInt(num1);

		int j = Integer.parseInt(num2);

		int k = 0;

		String str = request.getParameter("a1");

		if (str.equals("add"))

			k = i + j;

		if (str.equals("sub"))

			k = i - j;

		if (str.equals("mul"))

			k = i * j;

		if (str.equals("div"))

			k = i / j;
		%>
			<h3 style="text-align: center;">Result is: <%=k%></h3>
	</div>
</body>
</html>