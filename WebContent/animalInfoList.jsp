<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="nuc.test.Service.*"  %>
     <%@ page import="java.sql.*" %>
      <%@ page import="nuc.test.vo.*"  %>
      <%@ page import="java.io.*" %>
      <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jQuery/jquery-3.2.1.min.js"></script>
<script src="colorChang.js"></script>
<style type="text/css">
body{align:center;background:#E5E5E5;}
.box{text-align:center;border:#ddd 1px solid;width:903px;height:90px;margin-left:250px;background-color:#fff;}
a{text-decoration:none;}
a:hover{color:#003366;}
h4{margin-top:2px;}
</style>
</head>
<body>
<div style="width:903px;height:50px;margin-left:250px;">

<span style="float:right;font-size:12px;">您现在的位置：主页> 寻宠启事>>列表</span>

<div style="backgound-color:#003399;width:60px;height:40px;color:#fff;font-size:15px;">
<a href="animal.jsp">发布招领</a>
</div>
</div>
<% 
    InfoService info =new InfoService();
    ResultSet rs=info.SelectAnimalInfos();//倒序查询
    rs.last();//到达集合的最后一行
    int i=rs.getRow();//获取集合的总长度
    rs.beforeFirst();//跳到集合第一行前
    
    //以上做的原因是为了使对应的图片id也倒序输出
    while(rs.next()){
    	
%>
<div class="box" id="box">

        <span style="color:#AAA;font-size:12px;float:right;"> <%=rs.getString("datetime") %> </span>

          <div style="float:left;">
          <a href="imageAnimal.jsp" >
          <img  src="imageAnimal.jsp?i=<%=i%>" style="width: 80px; height: 80px; border-top-left-radius: 50%; border-top-right-radius: 50%; border-bottom-right-radius: 50%; border-bottom-left-radius: 50%; border: 5px solid rgb(255, 255, 255); display: inline;"></a>
          </div>
          
          <h4>
          <a href="titleFound.jsp?title=<%=rs.getString("title")%>">
          <%=rs.getString("title")%>
          </a>
          </h4> 
                发布者:<%=rs.getString("name")%>
</div>
<%
     i--;
} %>

</body>
</html>