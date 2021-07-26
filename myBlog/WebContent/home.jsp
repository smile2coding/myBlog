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
          	<div>
     		<div class="block">
			    <div class="box_big ">
			        <div class="box"><img src="src/img/1.jpg" alt=""/></div>
			        <div class="box"><img src="src/img/2.jpg" alt=""/></div>
			        <div class="box"><img src="src/img/3.jpg" alt=""/></div>
			    </div>
			    <div class="spot">
			        <div class="spot_list">1</div>
			        <div class="spot_list">2</div>
			        <div class="spot_list">3</div>
			       
			    </div>
			    <div class="btn_def">
			        <div class="left_btn"><span> < </span></div>
			        <div class="right_btn"><span> > </span></div>
			    </div>
			</div>
     		<script type="text/javascript" src="src/js/home.js" ></script>
          	</div>
          	<br>
          	<br>
          	<h4>热门文章</h4>
          	<hr>
          	
          	<div class="row">
          		<% 
		          	request.setCharacterEncoding("utf-8");
		            List<article> list=null;
		            articleDao art=new articleDao();
		            list=art.queryAll();
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
     </div><!--/row-->

</div>
<%@ include file="src/includes/footer.jsp" %>
</body>
</html>