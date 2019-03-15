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
	<table id="newsinfoDg" class="easyui-datagrid"></table>
	<script type="text/javascript">
		$(function() {
			$('#newsinfoDg').datagrid({
				fit : true,
				fitColumn : true,
				rownumbers : true,
				singleSelect : false,
				url : 'datagrid_data.txt',				
				columns : [ [ {
					title : '',
					field : 'productid',
					align : 'center',
					checkbox : true
				}, {
					field : 'unitcost',
					title : 'unitcost',
					width : 50
				}, {
					field : 'status',
					title : 'status',
					width : 60
				}, {
					field : 'listprice',
					title : 'listprice',
					width : 50
				} , {
					field : 'attr1',
					title : 'attr1',
					width : 200
				} , {
					field : 'itemid',
					title : 'itemid',
					width : 100
				} ] ]
			});
		});
	</script>
</body>
</html>
