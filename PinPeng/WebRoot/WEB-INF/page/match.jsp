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
	<h4>这是一个导航栏</h4>
	<hr />
	<i> 当前要匹配的订单信息：</i>
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
	<hr />
	排序：
	<button>慷慨值</button>
	<button>信用</button>
	<button>金额</button>
	<br /> 限制： 性别:
	<select>
		<option value="male">男</option>
		<option value="female">女</option>
	</select> 寝室楼:
	<select>
		<option value="bahaolou">八号楼</option>
		<option value="jiuhaolou">九号楼</option>
	</select>

	<hr />


	<table frame="vsides" align="center">
		<caption>匹配结果</caption>
		<tr>
			<th>订单号</th>
			<th>时间</th>
			<th>信用值</th>
			<th>权值</th>
			<th>订单金额</th>
			<th>订单人数</th>
		</tr>
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
		

		<!--  
 <tr>
 	<td>周壮</td>
 	<td>男</td>
 	<td>100</td>
 	<td>100</td>
 	<td>100</td>
 	<td><input type="button" value="匹配"></td>
 	<td><input type="button" value="收藏"></td>
 </tr>
 <tr>
 	<td>王炜</td>
 	<td>男</td>
 	<td>99</td>
 	<td>99</td>
 	<td>101</td>
 	<td><input type="button" value="匹配"></td>
 	<td><input type="button" value="收藏"></td>
 </tr>
 <tr>
 	<td>万毓琨</td>
 	<td>女</td>
 	<td>98</td>
 	<td>98</td>
 	<td>102</td>
 	<td><input type="button" value="匹配"></td>
 	<td><input type="button" value="收藏"></td>
 </tr>
 <tr>
 	<td>卓徐杰</td>
 	<td>男</td>
 	<td>97</td>
 	<td>97</td>
 	<td>103</td>
 	<td><input type="button" value="匹配"></td>
 	<td><input type="button" value="收藏"></td>
 </tr>
-->
	</table>
</body>
</html>
