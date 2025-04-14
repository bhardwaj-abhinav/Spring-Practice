<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<td>S.NO</td>
				<td>Name</td>
				<td>Price</td>
				<td>Quantity</td>
				</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${p }" var="product" varStatus="index">
				<tr>
					<td>${index.count}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td>${product.qty}</td>
				</tr>
			</c:forEach>
		
		</tbody>
	</table>
</body>
</html>