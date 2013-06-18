<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>系统消息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/system_message.css">
<script  type="text/javascript">
	function delayedRedirect(){
		window.location.href="${pageContext.request.contextPath}/index.jsp";
	}
</script>
 
</head>

<body onLoad="setTimeout('delayedRedirect()',3000)">
	<div class="container">
		<div id="box">
		<h2>${systemMsg }</h2>
		<h2>3秒钟后将自动跳转到主页.</h2>
		<a href="${pageContext.request.contextPath}/index.jsp">若没有跳转，请点击此链接</a>
		</div>
	</div>
</body>
 
</html>
 <style>
.container {
	margin: 0 auto;
	position: relative;
	width: 1000px;
	font-size:.8125em;
}
#box{
	padding-top:100px;
	padding-left:400px;
	width:600px;
	height:350px;
	margin-left:0px;
	margin-top:20px;
	background-color:#ddd;
	border:2px solid;
	border-color:#bbbbbb;
	box-shadow: 10px 10px 10px #aaa;
	border-radius:25px;
	-moz-border-radius:25px;
	
}
</style>
