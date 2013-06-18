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

<body style="font-family:微软雅黑">
	<jsp:include page="/WEB-INF/page/topmenu.jsp" />
	
	<div class="container">
  		<div class="row">
  			 &nbsp;
  		</div>
  		
  		<div class="row">
  			<div class="span3">
  				<div class="hero-unit">
  					<h4>当前订单信息</h4>
		<font size=2 color="grey"> 订单号：${requestid}<br />
			购物区域：${store}
			<c:if test="${form.shoppingstore == 1 }">1号店</c:if>
			<c:if test="${form.shoppingstore == 2 }">天猫超市</c:if>
			<c:if test="${form.shoppingstore == 3 }">淘宝</c:if>
			<c:if test="${form.shoppingstore == 4 }">当当</c:if>
			<c:if test="${form.shoppingstore == 5 }">卓越/亚马</c:if>
			<c:if test="${form.shoppingstore == 6 }">京东</c:if>
			<c:if test="${form.shoppingstore == 7 }">易迅</c:if><br />
			 子商家：${form.subshoppingstore }<br />
			优惠类型：
			<c:if test="${form.discounttype == 1 }">免邮费</c:if>
			<c:if test="${form.discounttype == 2 }">满就减</c:if>
			<c:if test="${form.discounttype == 3 }">满就送</c:if><br />
		              已消费金额：${form.price } 元<br />
			购买件数：${form.amount } 件<br />
			优惠需要金额 ：${form.moneyAmountNeed }元<br/>
			物品重量：${form.weight }KG <br /> 
			物品种类:
			<c:if test="${form.itemstype == 'food' }">食物</c:if>
			<c:if test="${form.itemstype == 'shoes' }">鞋</c:if>
			<c:if test="${form.itemstype == 'clothes' }">衣服</c:if>
			</br>
			订单结束日期: ${form.endday }</br> 希望拼单人数不超过: ${form.maxpeople }</br> 宿舍楼限定:
				<c:if test="${form.dormlimited == 0 }">否</c:if>
				<c:if test="${form.dormlimited == 1 }">是</c:if>
				</br> 谁来付款:
				<c:if test="${form.payer == 0 }">都可</c:if>
				<c:if test="${form.payer == 1 }">其他</c:if>
				<c:if test="${form.payer == 2 }">我</c:if>
				</br> 谁取快递:
				<c:if test="${form.othertakelimited == 0 }">都可</c:if>
				<c:if test="${form.othertakelimited == 1 }">其他</c:if>
				<c:if test="${form.othertakelimited == 2 }">我</c:if>
				</br> 谁要礼物:
				<c:if test="${form.goodsfree == 0 }">都可</c:if>
				<c:if test="${form.goodsfree == 1 }">其他</c:if>
				<c:if test="${form.goodsfree == 2 }">我</c:if>
				</br> 性别限制:
				<c:if test="${form.manlimited == 0 }">女</c:if>
				<c:if test="${form.manlimited == 1 }">男</c:if>
				</br> 是否限购:
				<c:if test="${form.buylimited == 0 }">否</c:if>
				<c:if test="${form.buylimited == 1 }">是</c:if>
				</br> 其他说明: ${form.notice }
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
			<th>操作</th>
		</thead>
		<c:forEach var="item" items="${matchs }">
			<tr>
			<td>${item.orderId}</td>
			<td>${item.date}</td>
			<td>${item.credit}</td>
			<td>${item.value}</td>
			<td>${item.price}</td>
			<td>${item.peopleNum}</td>
			<td>
			<a href="${pageContext.request.contextPath}/checkorder?orderid=${item.orderId}" data-toggle="modal">查看 </a>
			||<a href="#" data-toggle="modal">匹配</a>
			||<a href="#" data-toggle="modal">收藏</a>
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
