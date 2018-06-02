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
<style type="text/css">
body{background:#E5E5E5;}
.box{text-align:center;}
.tata{    
    border-bottom: 1px dotted #CCC;
    padding: 4px;
    font-size: 12px;
    background: #F3F3F3;
	border-right: 1px dotted #CCC;}
</style>

</head>
<body>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/";  
%>
<% 
      Info info=new Info();
      info.setTitle(request.getParameter("title"));
      InfoService animal=new InfoService();
      ResultSet rst=animal.SelectAnimalInfo(info); 
      while(rst.next()){
%>
<div style="align:left;margin-left:100px;;">
<span>您现在的位置：主页> 寻宠启事>>详细内容</span>
</div>
<h3 style="text-align:center;"><%=rst.getString("title") %></h3>
<h4  style="width:100%; text-align:center; color:#888888; line-height:170%;">发布时间：<%=rst.getString("datetime")%> &#160;&#160;&#160;  查阅次数：<span id="count"><script src="count.js" ></script></span></h4>
<hr style="color:#f00;width:500px;">
<div class="box">
          <table border="0" cellspacing="0" cellpadding="0"  width="500"  style="box-shadow: 1px 3px 3px rgba(150,152,153,0.3); background-color:#FFF" align="center">
            <tr>
            <td class="tata" width="110">发布者：</td>
            <td class="tata" ><%=rst.getString("name")%></td>
            </tr>
            
            <tr>
				<td class="tata" width="110">宠物种类：</td>
				<td class="tata"><%=rst.getString("kind") %></td>
			</tr>
				
			<tr>	
				<td class="tata" width="110">丢失地点：</td>
				<td class="tata"><%=rst.getString("place") %></td>	
		    </tr>
		    
		   <tr>
		        <td class="tata" width="110">联系人：</td>
		        <td class="tata"><%=rst.getString("user") %></td>
		   </tr>
		   
		   <tr>
		        <td class="tata" width="110">联系电话：</td>
		         <td class="tata"><%=rst.getString("phone") %></td>
		   </tr>
		   
		   <tr>
		  		<td class="tata" width="110">丢失时间：</td>
		  		<td class="tata"><%=rst.getString("time") %></td>
		  </tr>
		 <tr>
		        <%   
				InputStream is=rst.getBinaryStream("photo");
		        session.setAttribute("rst",is);
		        %>
		   		<td class="tata">物品照片:</td>
		   		<td class="tata" width="350"><img width="300" height="300" src="images.jsp"></td>
		</tr>
		<%} %>
      </table>
</div>

</body>
</html>