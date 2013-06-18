<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'spaceother.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body style="font-family:微软雅黑">
  <jsp:include page="topmenu.jsp" />
<div class="row" style="margin-top:60px">
<div class="span4 offset4 well">
    <h2>${other.name }的个人空间</h2>
    <hr />
    <p>学号：${other.studentid }</p>
    <p>姓名：${other.name }</p>
    <p>信用等级：${other.credit }</p>
    <p>邮箱：${other.email }</p>
    <p>QQ号：${other.qqNumber }</p>
    <p>手机号：${other.telNumber }</p>

    </div>
    </div>
  </body>
</html>
