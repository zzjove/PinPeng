<%@page import="domain.Customer"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>查看个人资料</title>
    
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
		
			<h3>个人资料</h3>
    			
			    <p>学号：${customer.studentid}</p>
    			<p>姓名：${customer.name}</p>
				<c:if test="${customer.sex=='true'}">
				<p>性别：男</p>
				</c:if>
				<c:if test="${customer.sex=='false'}">
				<p>性别：女</p>
				</c:if>
 			   <p>邮箱：${customer.email}</p>
    			<p>QQ： ${customer.qqNumber}</p>
			    <p>手机：${customer.telNumber}</p>
    			<p>寝室楼号：${customer.dormitory}</p>
    			<a class="btn btn-primary" href="${pageContext.request.contextPath}/viewprofile?type=edit">编辑资料</a>
		</div>
		</div>
	</div>
		

		

  </body>
</html>
