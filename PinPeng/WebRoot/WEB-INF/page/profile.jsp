<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'profile.jsp' starting page</title>
    
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
<jsp:include page="/WEB-INF/page/topmenu.jsp" />
<div style="width:800px; height:540px; margin:auto">
    <div><jsp:include page="/WEB-INF/page/spacemenu.jsp" /></div>
    
    <div style=" width:600px; float:left">
    <h2>查看个人资料</h2>
    <h3><a hrep="#">编辑</a></h3>
    <p>学号：</p>
    <p>姓名：</p>
    <p>性别：</p>
    <p>邮箱：</p>
    <p>QQ：</p>
    <p>手机：</p>
    <p>寝室楼号</p>
    </div>
    
    </div>
  </body>
</html>
