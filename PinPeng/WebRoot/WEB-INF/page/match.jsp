<%@page import="utils.DataConverter"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="domain.ShoppingType"%>
<%@page import="domain.Myrequest"%>
<%@page import="domain.Restriction"%>
<%@page import="utils.Match"%>
<%@page import="domain.Customer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>自动匹配结果</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
</head>

<body>
	<jsp:include page="/WEB-INF/page/topmenu.jsp" />
	
	<div class="container">
  		<div class="row">
  			 &nbsp;
  		</div>
  		
  		<div class="row">
  			<div class="span3">
  				<div class="hero-unit">
  					<h4>当前订单信息</h4>
  					<p>
		<font size=2 color="grey"> 订单号：${myrequest.requestid}<br />
			购物区域：${store}<br /> 子商家：${shoppingtype.subShoppingStore }<br />
			优惠类型：免邮费<br /> 已消费金额：${myrequest.price} 元<br />
			购买件数：${myrequest.amount} 件<br /> <!--  优惠需要金额：600元<br/>-->
			物品重量：${myrequest.weight}KG <br /> 订单结束日期：${restriction.endDay}<br />
			最大拼单人数：${restriction.maxPeople}<br /> 宿舍楼限定：${dormlimited}<br />
			谁来付款：${payer}<br /> 谁取快递：${othertakelimited}<br /> 谁要礼物：${goodsfree}<br />
			性别限定：${manlimited}<br /> 是否有限购物品：${buylimited}<br />
			补充说明：${restriction.notice}<br /> </font>
	</p>
  				</div>
  			</div>
  			<div class="span1">
  				
  			</div>
  			<div class="span8">
  				<h3>匹配结果</h3>
  				<div class="row">
  					<div class="btn-toolbar" style="margin-left:10px;">
 						 <div class="btn-group">
   							<a class="btn active" href="#" >综合</a>
  							<a class="btn" href="register.html" target="_blank">慷慨度</a>
  							<a class="btn" href="#">信用值</a>
  							<a class="btn" href="#">地理位置</a>
  							<a class="btn" href="#">订单金额</a>
  						</div>
  						
  						<div class="btn-group">
  						<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
   							性别
    						<span class="caret"> </span>
  						</a>
					 	<ul class="dropdown-menu">
					    	<li><a class="" href="#">男</a></li>
					    	<li><a class="" href="#">女</a></li>
  						</ul>
					</div>
					<div class="btn-group">
  						<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
   							寝室楼
    						<span class="caret"> </span>
  						</a>
					 	<ul class="dropdown-menu">
					    	<li><a class="" href="#">5号楼</a></li>
					    	<li><a class="" href="#">6号楼</a></li>
					    	<li><a class="" href="#">7号楼</a></li>
					    	<li><a class="" href="#">8号楼</a></li>
					    	<li><a class="" href="#">9号楼</a></li>
					    	<li><a class="" href="#">10号楼</a></li>
  						</ul>
					</div>
					</div>
					
  				</div>
  				<table class="table table-hover">
  					<thead>
			<th>订单</th>
			<th>时间</th>
			<th>信用</th>
			<th>权值</th>
			<th>订单金额</th>
			<th>订单人数</th>
		</thead>
		<c:forEach var="item" items="${matchs }">
			<tr>
			<td>${item.orderId}</td>
			<td>${item.date}</td>
			<td>${item.credit}</td>
			<td>${item.value}</td>
			<td>${item.price}</td>
			<td>${item.peopleNum}</td>
			<td><input type="button" value="查看" onclick="window.location.href='${pageContext.request.contextPath}/checkorder?orderid=${item.orderId}'">
			</td>
			<td><input type="button" value="匹配">
			</td>
			<td><input type="button" value="收藏">
			</td>
			</tr>
		</c:forEach>
				</table>
  			</div>
  		</div>
  	</div>
  	
  	<script src="http://code.jquery.com/jquery.js"></script>
    <script src="bootstrap.js"></script>
	
	


	
</body>
</html>
