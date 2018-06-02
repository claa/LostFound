<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css2.css" type="text/css" rel="stylesheet">
 <script type="text/javascript" src="date.js"></script>

</head>
<body>
<div class="topall">
<div id="webhead">

<table  border="0" cellspacing="0" cellpadding="0" id="topBar">
	<tbody>
	    <tr>
			
			<td style="height:37px;marign-left:10px;" id="time"></td></td>		
			
			 <td height="37" align="right">
			       <div id="userlogin"><span><form  action="loginAction" method="post">
			 
						<table width="660" border="0" cellspacing="0" cellpadding="0" class="login_style"><tr>
				
						<td width=40>学号：<input name="no"  type="text" size="15" style="width:80px; height:20px; line-height:17px; border:#ddd 1px solid"></td>
				
						<td width=40>密码：<input name="password" class="input_st" type="password" maxlength="16" size="15" style="width:80px; height:20px; line-height:17px; border:#ddd 1px solid"></td>
				
						<td width=10><input id="loginBtn" type="submit" value="登录" ></td>
				
						<td width=10><input id="loginBtn" type="button" value="注册" onClick=" window.parent.middle.location.href='register.jsp'"></td></table>
				
						</form></span>
					</div>
     	   </td>
		</tr>
	
       </tbody>
</table>

<table width="100%" border="0" cellspacing="0" cellpadding="0"><tbody><tr>

			<td width="100" valign="middle" class="tlogo"><a href="http://www.nuc.edu.cn/"><img src="image/logo.png" alt="中北大学图标"></a></td>
			
			<td width="100" valign="middle" class="t-txt1" align="center">
			  <br><strong>全校></strong>  
                       <select>
                            <option>太原校区</option>
                            <option>朔州校区</option>
                       </select><br>
			</td>
			
			
			<td width="425" valign="middle" height="90">
			
			<div class="search_s">
			
					<form id="form1" name="form1" method="post" action="queryAction" target="middle">
					
					 <input type="hidden" name="kwtype" value="0" />
					
					<input name="title" type="text" id="KeyWord" value="" class="inputtop" maxlength="40">
					
					<input type="submit" name="Submit" value="搜索" class="btn-s">
					
					</form>
           </div>

          <div style="width:100%; text-align:left;padding-left:35px;">热搜词：手机、钱包、钥匙、身份证、ipad、杯子</div>

          </td>
</tr></tbody></table>

</div>

	<div id="clear"></div>
</div>

	

	

<div class="nav">
				<div class="mainnav_box">
				
				<ul id="mainnav_box_ul">
				
								<li><a href="showNameList.jsp" target="middle"class="hover">首页</a></li>
								
								<li> <a href="found.jsp" target="middle">失物招领</a></li>
								
								<li> <a href="lost.jsp" target="middle">寻物启事</a></li>	
								
					            <li> <a href="animal.jsp" target="middle">寻宠启事</a></li>
								
								<li> <a href="http://www.shiwurenling.com/about/" target="middle">关于我们</a></li>
								
								<li> <a href="http://www.shiwurenling.com/forum-130-1.html" target="middle">感谢信</a></li>
				</ul>
				</div>
</div>

</body>
<script type="text/javascript">
	 var name="${sessionScope.loginname}";
	 console.log(name);
	 if(name!=""){
	 window.document.getElementById('userlogin').innerHTML = '欢迎'+name+'登录';
	 }
 </script>
</html>