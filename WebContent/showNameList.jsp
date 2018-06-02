<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="nuc.test.Service.*"  %>
     <%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
html{margin:0;padding:0;}
body{background-color:#E5E5E5;margin:0;padding:0;}
#list {float:left;width:300px;margin-right:20px;background-color:#fff;margin-top:20px;}

#list h6 {color:#003366;background:#003366;font-size:13px; padding-left:10px; line-height:35px; height:35px;  }

#list h6 a{ color:#FFF;text-decoration:none;}

#list h6 span{float:right;font-size:12px;color:#cccccc;font-weight:normal;padding-right:20px;}

#list ul{padding-left:8px;}

#list li span{float:right;font-size:10px;}

#list li {float:left;font-size:12px;width:280px;line-height:20px;height:20px;overflow:hidden;}

#list li a:link,#list li a:visited{color:#FFF;text-decoration:none;}

#list li a:hover{color:#003366;}
</style>
</head>
<body>
<div style="margin:0 auto;width:1002px;">
<div id="list">
    <h6> <font color="#fff">失物招领 <span><a href="foundInfoList.jsp">进去看看</a></span></font></h6>
    <ul>
        <%
        try{
        InfoService found = new InfoService();
        ResultSet rst=found.QueryInfo();
        while(rst.next()) {
        
        %>
        <li>
       
        <a href="titleFound.jsp?title=<%=rst.getString("title")%>" target="middle">
        <font color="#000"><%=rst.getString("title") %></font></a>
         <span> <%=rst.getString("datetime") %></span>
        </li>
        <%
           }
        }
         catch(Exception e){
        	  out.println(e);
         }  
      
        %>
    </ul>
</div>
<div id="list">
 	<h6> <font color="#fff">寻物启事 <span><a href="lostInfoList.jsp">进去看看</a></span></font></h6>
 	<ul>
 	     <%
        try{
        InfoService lost = new InfoService();
        ResultSet rst=lost.QueryLostInfo();
        while(rst.next()) {
        
        %>
        <li>
       
        <a href="titleLost.jsp?title=<%=rst.getString("title")%>" target="middle">
        <font color="#000"><%=rst.getString("title") %></font></a>
         <span> <%=rst.getString("datetime") %></span>
        </li>
        <%
           }
        }
         catch(Exception e){
        	  out.println(e);
         }  
      
        %>
 	</ul>
</div>
<div id="list">
 	<h6> <font color="#fff">寻宠启事<span><a href="animalInfoList.jsp">进去看看</a></span></font></h6>
 	<ul>
 	     <%
        try{
        InfoService animal = new InfoService();
        ResultSet rst=animal.QueryAnimalInfo();
        while(rst.next()) {
        
        %>
        <li>
       
        <a href="titleAnimal.jsp?title=<%=rst.getString("title")%>" target="middle">
        <font color="#000"><%=rst.getString("title") %></font></a>
         <span> <%=rst.getString("datetime") %></span>
        </li>
        <%
           }
        }
         catch(Exception e){
        	  out.println(e);
         }  
      
        %>
 	</ul>
</div>
</div>
</body>
</html>