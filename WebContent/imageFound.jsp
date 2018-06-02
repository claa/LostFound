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
</head>
<body>
<% 
       int i=Integer.parseInt(request.getParameter("i"));
       InfoService info=new InfoService();
       ResultSet rs=info.SelectIds(i);
       while(rs.next()){
	   InputStream  is =rs.getBinaryStream("photo");
	     OutputStream os=null;
	     response.setContentType("text/html");
	     os = response.getOutputStream();
     
	     byte[] buffer=new byte[1024];//一次传的文件量
			int len=0;
			try {
			while((len=is.read(buffer))>0){//读
				os.write(buffer, 0, len);//写 （，起始位置，长度）
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
       }
		out.clear();
		out=pageContext.pushBody();
   
    
%>
</body>
</html>