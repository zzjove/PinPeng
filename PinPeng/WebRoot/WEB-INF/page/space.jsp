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
</head>

<body style="font-family:微软雅黑">
	<jsp:include page="/WEB-INF/page/topmenu.jsp" />
	
	<div class="container" style="width:1200px;">
	<div style="width:1200px;margin-top:20px;">
		<div class="span1" style="width:10px;"></div>
		<div class="span2">
			<div style="margin-left:20px;margin-top:50px;position:fix;">
				<jsp:include page="/WEB-INF/page/spacemenu.jsp" />
			</div>
		</div>
		<div class="span1"></div>
		<div class="span7 hero-unit" style="margin-left:20px;margin-top:50px;position:relative;padding-top: 10px;position:fix;">
			<h4 >当前订单状态</h4>
			
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
						<td><a href="${pageContext.request.contextPath}/checkrequest.action?requestid=${item.requestid}">查看
						</a><a href="${pageContext.request.contextPath}/deleteorder.action?requestid=${item.requestid}">删除</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		</div>
	</div>
		

		

</body>
</html>
