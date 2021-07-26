<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<%@include file="src/includes/link.jsp" %>
</head>
<body>
<div class="container">
	<div class="row" align="center">
      <form class="form-signin"  method="POST" action="/myBlog/loginCheak">
        <h2 class="form-signin-heading">欢迎回家</h2>
        <div class="col-md-4 col-md-offset-4" align="center">
        	<input type="text" name="username" class="form-control" placeholder="username" required autofocus>
        
       		<input type="password" name="password" class="form-control" placeholder="password" required>
     		<br>
        	<button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
        </div>
      </form>

    </div> <!-- /container -->
</div>
</body>
</html>