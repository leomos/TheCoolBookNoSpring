<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="com.etlforma.db.Database"%>
<%@ page import="com.etlforma.model.Book"%>
<%@ page import="com.etlforma.model.Author"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%!Database db = new Database();%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
<title>All books - TheCoolBook</title>
<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="assets/css/styles.css">
</head>
<body>
	<nav class="navbar navbar-light navbar-expand-md">
		<div class="container-fluid">
			<a class="navbar-brand" href="/TheCoolBook">TheCoolBook</a>
			<button data-toggle="collapse" class="navbar-toggler"
				data-target="#navcol-1">
				<span class="sr-only">Toggle navigation</span><span
					class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navcol-1">
				<ul class="nav navbar-nav">
					<li class="nav-item" role="presentation"><a
						class="nav-link active" href="/TheCoolBook/allAuthors.jsp">Authors</a></li>
					<li class="nav-item" role="presentation"><a class="nav-link"
						href="/TheCoolBook/allBooks.jsp">Books</a></li>
					<li class="nav-item" role="presentation"><a class="nav-link"
						href="/TheCoolBook/allEvents.jsp">Events</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container">
		<h3>All Books</h3>
	</div>
	<div class="container">
		<div class="table-responsive">
			<table class="table">
				<thead>
					<tr>
						<th>Title</th>
						<th>Number of pages</th>
						<th>Authors</th>
						<th>Isbn</th>
					</tr>
				</thead>
				<tbody>
					<%
						List<Book> books = db.getBooks();
						for (int i = 0; i < books.size(); i++) {
							Book currentBook = books.get(i);
							out.println("<tr>");
							out.println("<td>" + currentBook.getTitle() + "</td>");
							out.println("<td>" + currentBook.getNumberOfPages() + "</td>");
							out.println("<td>");
							List<Author> thisBookAuthors = currentBook.getAuthors();
							for (int j = 0; j < thisBookAuthors.size(); j++) {
								Author currentAuthor = thisBookAuthors.get(j);
								out.println(currentAuthor.getFirstName());
								out.println(currentAuthor.getLastName());
								
								if(j != thisBookAuthors.size()-1) {
									out.println(",");
								}
								

							}
							out.println("</td>");
							out.println("<td>" + currentBook.getIsbn() + "</td>");
							out.println("</tr>");
						}
					%>
				</tbody>
			</table>
		</div>
	</div>
	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>