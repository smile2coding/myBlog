<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.List" %>
<%@ page import="DAO.articleDao,Util.jdbcUtil,Vo.article" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Blog page</title>
<%@include file="src/includes/link.jsp" %>

</head>
<body>
<%@include file="src/includes/header.jsp" %>
<br>
<br>
<br>
<br>

<div class="container">
	
    <div class="row">

     <div class="col-sm-8 blog-main">
     <%
     	int textId=Integer.parseInt(request.getParameter("textId")); 
		articleDao art =new articleDao(); 
		article rst=art.findBlogById(textId);
		System.out.println(rst);
	  %>
     	<div class="blog-post">
        	<h2 class="blog-post-title"><%= rst.getTitle()%></h2>
         	<p class="blog-post-meta"><%=rst.getTime() %>   <a href="#">By Dylan</a></p>
        	<hr>
				<%=rst.getContext() %>
	

        </div><!-- /.blog-post -->

     
       	

     </div><!-- /.blog-main -->

     
        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
	        <div class="sidebar-module sidebar-module-inset">
	          <h4>Dylan</h4>
	          	  <p>一名在校大学生，这是我的第一个Blog！当然也是Java Web课程的大作业。
	          	                  开发环境是Eclipse + tomcat + jdk + 阿里云服务器</p>
	        </div>
	        <br>
        	<div class="sidebar-module">
            <h4>友情链接</h4>
            <ol class="list-unstyled">
              <li><a href="https://www.csdn.net/">CSDN</a></li>
              <li><a href="https://github.com/">GitHub</a></li>
              <li><a href="https://www/baidu.com">Baidu</a></li>
              
            </ol>
          </div>  	
		</div><!--/.sidebar-offcanvas-->
   </div><!-- /.row -->

 </div><!-- /.container -->


<%@include file="src/includes/footer.jsp" %>
</body>
</html>