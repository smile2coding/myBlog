<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.List" %>
<%@ page import="DAO.articleDao,Util.jdbcUtil,Vo.article" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>

<link href="src/css/blog.css" rel="stylesheet">
<%@ include file="src/includes/link.jsp"%>
</head>
<body>
<%@ include file="src/includes/header.jsp" %>
    
<div class="container">

      <div class="row row-offcanvas row-offcanvas-right">

        <div class="col-xs-12 col-sm-9">
          <p class="pull-right visible-xs">
            <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
          </p>
          <div class="jumbotron">
            <h1>技术分享</h1>
            <p>这个是技术分享板块，分享的是自己遇到的一些技术难题。</p>
          </div>
          <div class="row">
          <% 
		          	request.setCharacterEncoding("UTF-8");
		            List<article> list=null;
		            articleDao art=new articleDao();
		            list=art.findBlogByType("tech");
		            if(list!=null){
		            for(int i=0;i<list.size();i++){
		          	
          		%>
           <div class="col-xs-6 col-lg-4">
              		<h2><%=list.get(i).getTitle() %></h2>
              		<p><%=list.get(i).getDescription() %> </p>
              		<p><a class="btn btn-default" href="blog.jsp?textId=<%=list.get(i).getTextId()%>" role="button">View details &raquo;</a></p>
            	</div><!--/.col-xs-6.col-lg-4-->
            	
            	<%}} %>
          </div><!--/row-->
        </div><!--/.col-xs-12.col-sm-9-->

        <div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
        <p>友情链接</p>
          <div class="list-group">
              <a href="https://www.csdn.net/" class="list-group-item">CSDN</a>
              <a href="https://github.com/" class="list-group-item">GitHub</a>
              <a href="https://www/baidu.com" class="list-group-item">Baidu</a>
           
          </div>
        </div><!--/.sidebar-offcanvas-->
      </div><!--/row-->

<%@ include file="src/includes/footer.jsp" %>
</body>
</html>