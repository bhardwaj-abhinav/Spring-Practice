<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<html>

<head>
	<h2>
		Student Enqiry Form
	</h2>

</head>


<body>

	<p> <font color="green">${msg}</font> </p>

	<form:form action="save" modelAttribute="student" method="POST">
		
		<table>
			<tr>
				<td>Name : </td>
				<td> <form:input path="studentName"/> </td>
			</tr>
			<tr>
				<td>Email : </td>
				<td> <form:input path="studentEmail"/> </td>
			</tr>
			<tr>
				<td>Gender : </td>
				<td> <form:radiobutton value="M" path="gender"/>Male</td>
				<td> <form:radiobutton value="F" path="gender"/>Fe-Male</td>
			</tr>
			<tr>
				<td>Courses : </td>
				<td>
					<form:select path="courses">
						<form:option value="">-select-</form:option>
						<form:options items="${course }"/>
					</form:select>
				</td>
			</tr>
			<tr>
				<td>Shifts : </td>
				<td><form:checkboxes items="${shift }" path="timings"/></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="save"/></td>
			</tr>
			
		</table>
	
	</form:form>	
	
	
</body>

</html>