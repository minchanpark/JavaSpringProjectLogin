<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="../addok" method="post" enctype="application/x-www-form-urlencoded">
<table>
    <tr><td>Title:</td><td><input type="text" name="title"/></td></tr>
    <tr><td>Director:</td><td><input type="text" name="writer"/></td></tr>
    <tr><td>Content:</td><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>
    <tr><td>Category:</td><td><input type="text" name="category"/></td></tr>
    <tr><td>Star:</td><td><input type="text" name="star"/></td></tr>
    <tr><td>Num:</td><td><input type="text" name="num"/></td></tr>
    <tr><td><a href="../list">View All Records</a></td><td align="right"><input type="submit" value="Add Post"/></td></tr>
</table>
</form>

</body>
</html>