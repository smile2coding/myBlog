<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
</head>
<body>

<!-- 导航栏 -->
<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
	<div class="container">
    	<div class="navbar-header">
          	<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
           	    <span class="icon-bar"></span>
           		<span class="icon-bar"></span>
           	
         	</button>
         	<a class="navbar-brand" href="home.jsp">myBlog</a>
    	</div>
        
    	<div id="navbar" class="navbar-collapse collapse">
        	<ul class="nav navbar-nav navbar-left">
            	<li><a href="tech.jsp">技术分享</a></li>
            	<li><a href="mood.jsp">心情随笔</a></li>
            	<!-- <li class="acitve"><a href="home.jsp">首页</a></li><li><a href="write.jsp">热门文章</a></li>
            	<li><a href="#contact">心情随笔</a></li> -->
          	</ul>
         	<ul class="nav navbar-nav navbar-right">
            	<li><a href="aboutMe.jsp">关于我</a></li> 
            	<li><a href="login.jsp">登录<span class="sr-only">(current)</span></a></li>
          	</ul>
        </div><!--/.nav-collapse -->
	</div>
</nav>

</body>
</html>