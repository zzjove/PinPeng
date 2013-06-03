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

<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css">


</head>

<body>

<div class="navbar navbar-static-top">
  		<div class="navbar-inner">
  			<div class="container">
  				<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
       				<span class="icon-bar"> </span>
        			<span class="icon-bar"> </span>
        			<span class="icon-bar"> </span>
     			 </a>
  				<a class="brand" href="#">拼朋</a>
  				<div class="nav-collapse collapse">
        			<ul class="nav">
  						<li><a href="#">首页</a></li>
  						<li class="divider-vertical"> </li>
  						<li><a href="#">个人空间</a></li>
  						<li class="divider-vertical"> </li>
	  					<li><a href="#">我要拼单</a></li>
	  					<li class="divider-vertical"> </li>
  						<li><a href="#">消息提醒</a></li>
  					</ul>
  					<form class="navbar-search pull-right">
  						<input type="text" class="search-query" placeholder="Search">
					</form>
      			</div>
  				
  			</div>
  		</div>
  	</div>
    
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
</body>
</html>
