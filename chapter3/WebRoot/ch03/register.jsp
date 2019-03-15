<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="servlet/RegisterServlet" method="post" name="form1">
	 	用户名：<input type="text" name="username"> <br>
  	        密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"> <br>
  	   业余爱好：
  	   <input type="checkbox" name="habit" value="看书">看书
  	   <input type="checkbox" name="habit" value="玩游戏">玩游戏
  	   <input type="checkbox" name="habit" value="旅游">旅游
  	   <input type="checkbox" name="habit" value="看电视">看电视<br> 
  	   <input type="submit" value="提交">
  	   <input type="reset" value="取消">

	</form>
</body>
</html>