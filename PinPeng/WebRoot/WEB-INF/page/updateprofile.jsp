<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>UpdateProfile</title>
    
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
    <h2>编辑个人资料</h2>
    <form action="updateprofile" method="post">
    <p>学号：${customer.studentid}</p>
    <p>姓名：${customer.name}</p>
	<c:if test="${customer.sex=='true'}">
		<p>性别：男</p>
	</c:if>
	<c:if test="${customer.sex=='false'}">
		<p>性别：女</p>
	</c:if>
    <p>邮箱：<input type="text" value="${customer.email}"/></p>
    <p>QQ： <input type="text" value="${customer.qqNumber}"/></p>
    <p>手机：<input type="text" value="${customer.telNumber}"/></p>
    <p>寝室楼号：<input type="text" value="${customer.dormitory}"/></p>
    <p><input type="submit" value="修改"/></p>
    </form>
    </div>
    
    </div>
  </body>
</html>
