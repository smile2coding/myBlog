<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write</title>
<%@include file="src/includes/link.jsp" %>

</head>
<body>
<div class="container">

    <div class="row">

     <div class="col-sm-8 blog-main ">
			<form method="post" action="addBlog">
        		<h3>标题：<input type="text" name="title" /></h3>
        		<h3>简述：<input type="text" name="description" id="quantity"/></h3>
        		<h3>类型选择：</h3>
       			<p><input type="checkbox" name="type" value="mood" />心情随笔</p>    
    			<p><input type="checkbox" name="type" value="tech">技术分享</p> 
			  <script type="text/javascript" src="src/ckeditor/ckeditor.js"></script>
        		<h3>内容：</h3><textarea name="context" class="ckeditor"/></textarea>
        		<input type="submit"/>
    		</form>
    </div>
   </div>
</div>
</body>
</html>