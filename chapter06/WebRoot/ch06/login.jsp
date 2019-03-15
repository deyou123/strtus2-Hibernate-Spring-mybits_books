<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	<form name="form1" method="post" action="login.action">
		用户名<input type="text" name="loginName"><br>
		密&nbsp;&nbsp;码<input type="password" name="loginPwd"><br>
		<input type="submit" value="登录"><br>
		<input type="reset" value="取消"><br>
	</form>
</body>
</html>
