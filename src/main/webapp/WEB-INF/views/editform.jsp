<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.example.dao.BoardDAO, com.example.bean.BoardVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Form</title>
</head>
<body>

<%
	BoardDAO boardDAO = new BoardDAO();
	String id=request.getParameter("id");
	BoardVO u=boardDAO.getBoard(Integer.parseInt(id));
%>

<h1>Edit Form</h1>
<form id="boardVO" action="../editok" method="post">
<input id="seq" type="hidden" name="seg" value="<%=u.getSeq() %>"/>
<table>
	<tr><td>Category:</td><td><input id="category" name="category" type="text" value="<%= u.getCategory()%>"/></td></tr>
<tr><td>Title:</td><td><input id="title" name="title" type="text" value="<%= u.getTitle()%>"/></td></tr>
<tr><td>Writer:</td><td><input id="writer" type="text" name="writer" value="<%= u.getWriter()%>" /></td></tr>
<tr><td>Content:</td><td><textarea id="content" cols="50" rows="5" name="content"><%= u.getContent()%></textarea></td></tr>
<tr><td colspan="2"><input type="submit" value="Edit Post"/>
<input type="button" value="Cancel" onclick="history.back()"/></td></tr>
</table>
</form>

</body>
</html>