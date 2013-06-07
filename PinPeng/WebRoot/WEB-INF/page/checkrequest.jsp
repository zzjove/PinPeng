<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'checkrequest.jsp' starting page</title>
    
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
  <div>
  <jsp:include page="topmenu.jsp" />
  </div>
    <h2>查看请求</h2>
	<p><a href="#">wangwei</a>在2013-06-07 13:00发布的拼单请求</p>
	
		<div>
        <p>购物商家：1号店</p>
        <p>优惠类型：</p>
		<hr />
		<p>已消费金额：</p>
        <p>优惠需要金额：</p>
        <p>购买件数：</p>
        <p>商品重量：</p>
        <p>商品种类：</p>
        <hr />
		<p>订单结束日期:</p>
        <p>希望拼单人数不超：</p>
    	<p>宿舍楼限定:</p>
    	<p>谁来付款:</p>
		<p>谁取快递：</p>
		<p>赠品归属：</p>
        <p>性别限定:</p>
		<p>是否限购：</p>
		<hr />
		<p>补充说明：</p>
		<hr />
		
        <s:form action="#" method="post">
		<p>
			<input type="submit" value="确认拼单"  />
		</p>
		</s:form>
        
        <s:form action="#" method="post">
		<p>
			<input type="submit" value="收藏"  />
		</p>
		</s:form>
       	
        <s:form action="#" method="post">
		<p>
			<input type="submit" value="给他发消息"  />
		</p>
		</s:form>
        
        </div>
  </body>
</html>
