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
<script  type="text/javascript">
	function delayedRedirect(){
		window.location.href="${pageContext.request.contextPath}/index.jsp";
	}
</script>
 
</head>
 
<body onLoad="setTimeout('delayedRedirect()',3000)">
	<h2>${systemMsg }</h2>
	<h2>3秒钟后将自动跳转到主页 </h2>
	<a href="${pageContext.request.contextPath}/index.jsp">若没有跳转，请点击此链接</a>
</body>
 
</html>
