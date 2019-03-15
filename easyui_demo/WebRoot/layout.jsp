<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link href="EasyUI/themes/default/easyui.css" rel="stylesheet"
	type="text/css" />
<link href="EasyUI/themes/icon.css" rel="stylesheet" type="text/css" />
<link href="EasyUI/demo.css" rel="stylesheet" type="text/css" />
<script src="EasyUI/jquery.min.js" type="text/javascript"></script>
<script src="EasyUI/jquery.easyui.min.js" type="text/javascript"></script>
<script src="EasyUI/easyui-lang-zh_CN.js" type="text/javascript"></script>
</head>

<body>
	<div class="easyui-layout" style="width:700px;height:350px;">
		<div data-options="region:'north'" style="height:50px">这是北区north</div>
		<div data-options="region:'south',split:true" style="height:50px;">这是南区south</div>
		<div data-options="region:'east',split:true" title="East"
			style="width:100px;">这是东区east</div>
		<div data-options="region:'west',split:true" title="West"
			style="width:100px;">这是西区west</div>
		<div
			data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
			这是中区center</div>
	</div>
</body>
</html>
