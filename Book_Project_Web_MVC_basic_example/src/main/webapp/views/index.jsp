<html>

<head>
	<h3>
		Book details
	</h3>

</head>


<body>
	
	<form action="book">
		Book ID : <input type="text" name="ID">
		<input type="submit" value="search">
		<hr />
	
	</form>
	
	Book ID : ${book.bookId}  <br/>
	
	Book Name : ${book.bookName}  <br/>
	
	Book Price : ${book.bookPrice}  <br/>

</body>


</html>