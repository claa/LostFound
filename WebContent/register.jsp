<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@  taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{background-color:#F3F3F3;}
.text{
width:180px; height:20px; line-height:20px; border:#ddd 1px solid;padding:0 5px 0 5px;
}
.but{
border:1px solid;
border-radius:5em;;
margin:5px 5px 0 5px;
}
.box{
   text-align:center;margin-top:100px;border:black 1px solid;width:500px;margin-left:400px;padding-top:20px;background:white;
}
input{
   margin-top:15px;
}
</style>
</head>
<body>
<div class="box">
<font style="color:red;">${requestScope.error}</font>
<form action="registerAction" method="post">
学&emsp;&emsp;号：<input type="text" name="no" class="text"><br><font color="red"><s:fielderror fieldName="no"/></font>

用&nbsp;&nbsp;户&nbsp;&nbsp;名&nbsp;:&nbsp;<input type="text" name="username" class="text"><br><font color="red"><s:fielderror fieldName="username"/></font>
密&emsp;&emsp;码：<input type="password" name="password"  class="text"> <br><font color="red"><s:fielderror fieldName="password"/></font>
确认密码：<input type="password" name="truepw" class="text"> <br><font color="red"><s:fielderror fieldName="truepw"/></font>
<input type="submit" value="注册" class="but">
<input type="reset" value="重置" class="but">
</form>
</div>
</body>
</html>