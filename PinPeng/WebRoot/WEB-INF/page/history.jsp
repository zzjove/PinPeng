<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'history.jsp' starting page</title>
    
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
  <div class="container" style="width:1200px;">
	<div style="width:1200px;margin-top:20px;">
		<div class="span1" style="width:10px;"></div>
		<div class="span2">
			<div style="margin-left:20px;margin-top:50px;position:relative;">
				<jsp:include page="/WEB-INF/page/spacemenu.jsp" />
			</div>
		</div>
		<div class="span1"></div>
		<div class="span7 hero-unit" style="margin-left:20px;margin-top:50px;position:relative;padding-top: 10px;">
			<div style=" width:600px; float:left">
			<h4 >历史订单</h4>
			<table class="table table-hover table-striped">
			
	<tr>
	<td>订单号</td><td>订单日期</td><td>订单描述</td><td>订单状态</td><td>可执行操作</td>
	</tr>
	<tr>
	<td>001</td><td>2013.5.18</td><td>好吃的</td><td>完成</td><td><a hrep="#">查看</a><a hrep="#">删除</a></td>
	</tr>
	<tr>
	<td>002</td><td>2013.5.18</td><td>好吃的</td><td>完成</td><td><a hrep="#">查看</a><a hrep="#">删除</a></td>
	</tr>	
	<tr>
	<td>003</td><td>2013.5.18</td><td>好吃的</td><td>取消</td><td><a hrep="#">查看</a><a hrep="#">删除</a></td>
	</tr>
	<tr>
	<td>004</td><td>2013.5.18</td><td>好吃的</td><td>取消</td><td><a hrep="#">查看</a><a hrep="#">删除</a></td>
	</tr>
			</table>
		</div>
		</div>
	</div>
		

		

	</div>

  </body>
</html>
