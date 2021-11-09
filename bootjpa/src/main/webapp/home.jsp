<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h2>Adding Student Details</h2>
<form action="addStudent">
Enter your id<input type="text" name="sid"><br>
Enter your name<input type="text" name="sname"><br>
Enter your marks<input type="text" name="marks"><br>
<input type="submit"><br>
<h2>Getting Student Details By Id</h2>
</form>
<form action="getStudent">
Enter your id<input type="text" name="sid"><br>
<input type="submit"><br>

</form>
</body>
</html>