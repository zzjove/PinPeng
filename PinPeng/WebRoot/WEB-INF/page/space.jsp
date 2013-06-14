<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="domain.Customer"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>查看当前订单</title>

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
					<td>订单号</td>
					<td>订单日期</td>
					<td>price</td>
					<td>订单状态</td>
					<td>可执行操作</td>
				</tr>
				<c:forEach var="item" items="${orders}">
					<tr>
						<td>${item.orderid}</td>
						<td>${item.beginTime}</td>
						<td>${item.price}</td>
						<c:if test="${item.status == 1 }">
							<td>等待中</td>
						</c:if>
						<c:if test="${item.status == 2 }">
							<td>联系中</td>
						</c:if>
						<td><a href="#">查看</a><a href="#">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>

	</div>
</body>
</html>
