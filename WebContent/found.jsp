<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.box{text-align:center;}
</style>
</head>
<body>
<%
    String name=(String)session.getAttribute("loginname");
    if(name!=null){
    	
 %>
<h5 style="text-align:center;">发布失物招领</h5>
<hr style="color:#f00;">
<div class="box">
          <font color="red">${requestScope.error}</font>
          <form action="InfoAction" method="post" enctype="multipart/form-data">
          <p>
            <label>标题：</label>
            <input name="title" type="text" id="title" value="输入拾到的物品"  maxlength="100" style='margin-right:35px;' class="intxt" onfocus="inputAutoClear(this)"/>
          </p>
          <div style="text-align:center;padding-left: 47px;color: #f00;"> 在田园食堂拾到一把钥匙<span style=" font-weight:bold; color:#03F;">(示范标题)</span></div>
          <p class="cellBg">
            <label>发布者：</label>
            <input name="name" type="text" id="writer"  maxlength="100" class="intxt" style="width:210px;margin-left:12px;" value="${sessionScope.loginname}"/>
          </p>
      
         <p>
				<label>物品种类：</label><select  style='width:210px' name="kind"><option value='书籍' >书籍</option>
				<option value='钱包'>钱包</option>
				<option value='书包'>书包</option>
				<option value='银行卡'>银行卡</option>
				<option value='饭卡'>饭卡</option>
				<option value='钥匙'>钥匙</option>
				<option value='衣物'>衣物</option>
				<option value='手机'>手机</option>
				<option value='电脑'>电脑</option>
				<option value='自行车'>自行车</option>
				<option value='其他'>其他</option>
				</select>	
        </p>
		<p>
		<label>拾物地点：</label><input type="text" name="place" style="width:210px" />
		</p>
		
		<p>
		  <label>联系人：</label><input type='text' name='user' id='lxr' style='width:210px;margin-left:12px;'  class='intxt' value='' />
		</p>
		<p>
		  <label>联系电话：</label><input type='text' name='phone' id='lianxidianhua' style='width:210px'  class='intxt' value='' />
		
		</p>
		<p>
		  <label>拾物时间：</label><input type='text' name='time' id='dssj' style='width:210px'  class='intxt' value='' />
		</p>
		<p>
		   <label>上传照片:</label><input type="file" name="photo" style='width:210px; margin-left:12px;' value=""/>
		</p>
		<input type="submit" value="提交"> <input type="reset" value="取消">
       </form>
</div>
<% }else{%>

    	<script type="text/javascript">
    	alert("抱歉，你还没有登录。");
    	window.history.back();
    	</script>
<%} %>
</body>
</html>