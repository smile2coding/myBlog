<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="DAO.articleDao,Util.jdbcUtil,Vo.article" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="src/includes/link.jsp" %>
</head>
<body>
  <div class="table-responsive">
 <table class="table table-striped" align="center" width="1000px" cellpadding="0px" cellspacing="0px" border="1px" style="border:1px solid gray; border-collapse:collapse">
        <tr>
            <td colspan="7">
                
                
            </td>
        </tr>
        <thead>
        <tr >
   
            <th>文章ID</th>
            <th>题目</th>
        
            <th>时间</th>
            <th>类型</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <% 	   request.setCharacterEncoding("utf-8");
		       List<article> list=null;
		       articleDao art=new articleDao();
		       list=art.queryAll();
		       if(list!=null){
		       for(int i=0;i<list.size();i++){
           %>
        <tr>
            <td><%=list.get(i).getTextId() %></td>
            <td><%=list.get(i).getTitle() %></td>

            <td><%=list.get(i).getTime() %></td>
            <td><%=list.get(i).getType() %></td>
            <td><a href="blog.jsp?textId=<%=list.get(i).getTextId()%>" target="view_window" >查看</a>|<a href="edit.jsp?textId=<%=list.get(i).getTextId() %>" >编辑</a>|<a href="delete?textId=<%=list.get(i).getTextId() %>" >删除</a></td>
        </tr>
         <%}}
		    
        %>
        </tbody>
       
        </table>    
        </div>
</body>
</html>