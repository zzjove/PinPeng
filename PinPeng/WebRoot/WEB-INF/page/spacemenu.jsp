<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'spacemenu.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<div style="width:200px; height:auto; float:left">
		<div>
			<p>个人信息</p>
			<p>
				<a href="viewprofile">查看个人资料</a>
			</p>
			<p>
				<a href="viewchangepassword">安全设置</a>
			</p>
		</div>
		<div>
			<p>订单信息</p>
			<p>
				<a href="viewspace">当前订单</a>
			</p>
			<p>
				<a href="viewhistory">历史订单</a>
			</p>
			<p>
				<a href="#">收藏夹</a>
			</p>
		</div>
		<div>
			<p>好友管理</p>
			<p>
				<a href="#">好友列表</a>
			</p>
			<p>
				<a href="#">消息中心</a>
			</p>
		</div>
	</div>
</body>
</html>