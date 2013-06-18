<%@page import="domain.Customer"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="domain.Customer"%>
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

<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css">


</head>

<body>
<%
	Customer customer = (Customer) (session.getAttribute("customer"));
        if (customer == null)
        {
 %>
 <div class="navbar navbar-static-top">
  		<div class="navbar-inner">
  			<div class="container">
  				<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
       				<span class="icon-bar"> </span>
        			<span class="icon-bar"> </span>
        			<span class="icon-bar"> </span>
     			 </a>
     			 
  				<a class="brand" href="#"><img src="images/logo.png"></a>
  				<div class="nav-collapse collapse" style="margin-top:20px;font-size:16px;font-family:微软雅黑">
        			<ul class="nav">
  						<li><a href="index.jsp">首页</a></li>
  						<li class="divider-vertical"> </li>
  					</ul>
  					<form class="navbar-search pull-right">
  						<input type="text" class="search-query" placeholder="Search">
  						<input type="submit" value="go"/>
					</form>
      			</div>
  				
  			</div>
  		</div>
  	</div>
 <%
 		}
 		else
 		{
  %>
<div class="navbar navbar-static-top">
  		<div class="navbar-inner">
  			<div class="container">
  				<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
       				<span class="icon-bar"> </span>
        			<span class="icon-bar"> </span>
        			<span class="icon-bar"> </span>
     			 </a>
  				<a class="brand" href="#"><img src="images/logo.png"></a>
  				<div class="nav-collapse collapse" style="margin-top:20px;font-size:16px;font-family:微软雅黑">
        			<ul class="nav">
  						<li><a href="index.jsp">首页</a></li>
  						<li class="divider-vertical"> </li>
  						<li><a href="viewspace">个人空间</a></li>
  						<li class="divider-vertical"> </li>
	  					<li><a href="viewsendrequest">我要拼单</a></li>
	  					<li class="divider-vertical"> </li>
  						<li><a href="viewnoticecenter">消息提醒</a></li>
	  					<li class="divider-vertical"> </li>
  						<li><a href="logout">登出</a></li>
  					</ul>
  					<form class="navbar-search pull-right" action="search" method="post">
  						<input name="keyword" type="text" class="search-query" placeholder="Search">
  						<input type="submit" value="go"/>
					</form>
      			</div>
  				
  			</div>
  		</div>
  	</div>
    
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
    
    <% 
    	}
    %>
</body>
</html>
