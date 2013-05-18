<%@page import="domain.Customer"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'Topmenu.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="css/style.css">


</head>

<body>
<%
        Customer customer = (Customer)(session.getAttribute("customer"));
        if (customer == null)
        {
    %>
	<div id="topNav">
		<ul>
			<li><a href="index.jsp"><img src="logo.png"></a></li>
			<li><a href="index.jsp"  class="hover">home</a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li><a href="#"></a></li>
			<li style="float:right"><a href="#">为什么选择拼朋</a></li>
		</ul>
	</div>
	 <% 
        }
        else
        {
    %>
    <div id="topNav">
		<ul>
			<li><a href="index.jsp"><img src="logo.png"></a></li>
			<li><a href="index.jsp"  class="hover">home</a></li>
			<li><a href="#">我要拼单</a></li>
			<li><a href="#">啥来着</a></li>
			<li><a href="space.jsp">个人空间</a></li>
			<li style="float:right"><a href="logout">登出</a></li>
		</ul>
	</div>
    <%
       }
    %>
</body>
</html>
