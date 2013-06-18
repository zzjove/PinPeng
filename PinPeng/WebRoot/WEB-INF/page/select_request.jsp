<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>手动匹配</title>

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
		<div class="span6 offset3 well">
	<h2>${shopName }</h2>
	</br>
	<h2><c:if test="${size == 0 }">您没有可匹配的订单！</c:if></h2>
	<c:if test="${size != 0 }">
	<table class="table table-hover table-striped">
		<tr>
			<td>订单号</td>
			<td>订单日期</td>
			<td>price</td>
			<td>订单状态</td>
			<td>可执行操作</td>
		</tr>
		<c:forEach var="item" items="${requests}">
			<tr>
				<td>${item.requestid}</td>
				<td>${item.myrequestTime}</td>
				<td>${item.price}</td>
				<c:if test="${item.status == 1 }">
					<td>等待中</td>
				</c:if>
				<c:if test="${item.status == 2 }">
					<td>联系中</td>
				</c:if>
				<td><a
					href="${pageContext.request.contextPath}/checkrequest.action?requestid=${item.requestid}">选择
				</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
	</div>
	</div>
</body>
</html>
