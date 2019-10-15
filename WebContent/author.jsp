<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%-- <%@ page import="com.etlforma.db.Database" %> --%>
<%@ page import="com.etlforma.model.Author" %>
<%-- <%! Database db = new Database(); %> --%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>All authors - TheCoolBook</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/styles.css">
</head>

<body>
    <nav class="navbar navbar-light navbar-expand-md">
        <div class="container-fluid"><a class="navbar-brand" href="/TheCoolBook">TheCoolBook</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navcol-1"><span class="sr-only">Toggle navigation</span><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse"
                id="navcol-1">
                <ul class="nav navbar-nav">
                
                    <li class="nav-item" role="presentation"><a class="nav-link active" href="/TheCoolBook/allAuthors.jsp">Authors</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="/TheCoolBook/allBooks.jsp">Books</a></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="/TheCoolBook/allEvents.jsp">Events</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <h3>Author</h3>
    </div>
    <div class="container">
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
    
                        <th>Name</th>
                        <th>Surname</th>
                        <th>Birthday</th>
                    </tr>
                </thead>
                <tbody>
                	<%
                	Author a = (Author)request.getAttribute("author");
                	
      
                	
                	out.println("<tr>");
            		out.println("<td>" + a.getFirstName() + "</td>");
            		out.println("<td>" + a.getLastName() + "</td>");
            		out.println("<td>" + String.format("%tY-%tm-%td", a.getBirthday(), a.getBirthday(), a.getBirthday()) + "</td>");
            		out.println("</tr>");

                	%>
                </tbody>
            </table>
        </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>