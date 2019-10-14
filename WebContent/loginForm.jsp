<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
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
        <h3>All authors</h3>
    </div>
    <div class="container">
    	<h4><%
		Map<String, String> messages = (Map<String, String>)request.getAttribute("messages");
		if(messages != null) {
	    	for (Map.Entry<String, String> entry : messages.entrySet()) {
			    out.println(entry.getValue());
			}
		}
		%></h4>
		<form action="/TheCoolBook/login" method="post">  
			Username: <input type="text" name="username"/><br/><br/>  
			Password: <input type="password" name="password"/><br/><br/>  
			<input type="submit" value="login"/>
		</form>  
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>