<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>

	<h2>
	
		Add Product
	</h2>
	
	<p>${msg }</p>
</head>

<body>
		<form:form action="product" modelAttribute="p" method="POST">
		<table>
			<tr>
				<td>Name : </td>
				<td><form:input path="name"/> </td>
			</tr>
			
			<tr>
				<td>Price : </td>
				<td><form:input path="price"/> </td>
			</tr>
			
			<tr>
				<td>Quantity : </td>
				<td><form:input path="qty"/> </td>
			</tr>
			
			<tr>
			<td><input type=submit value="save"/></td>
			</tr>
		</table>
		</form:form>
		
		<a href="/products">Go to Products</a>

</body>

</html>