<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'space.jsp' starting page</title>
    
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
    <h2>当前订单状态</h2>
	<table>
	<tr>
	<td>订单号</td><td>订单日期</td><td>订单描述</td><td>订单状态</td><td>可执行操作</td>
	</tr>
	<tr>
	<td>001</td><td>2013.5.18</td><td>好吃的</td><td>完成</td><td><a hrep="#">查看</a><a hrep="#">评价</a></td>
	</tr>
	<tr>
	<td>002</td><td>2013.5.18</td><td>好吃的</td><td>完成</td><td><a hrep="#">查看</a><a hrep="#">评价</a></td>
	</tr>	
	<tr>
	<td>003</td><td>2013.5.18</td><td>好吃的</td><td>完成</td><td><a hrep="#">查看</a><a hrep="#">评价</a></td>
	</tr>
	<tr>
	<td>004</td><td>2013.5.18</td><td>好吃的</td><td>完成</td><td><a hrep="#">查看</a><a hrep="#">评价</a></td>
	</tr>
	</table>
    </div>
    
    </div>
  </body>
</html>
