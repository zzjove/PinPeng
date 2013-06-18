<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>确认拼单信息</title>

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
			<h2>确认发布拼单请求</h2>
			<h4>一旦发布将无法修改哟</h4>
			<div style="margin-top:30px;margin-bottom:30px">
				<h3>购物类型</h3>
				购物区域:
				<c:if test="${form.shoppingstore == 1 }">1号店</c:if>
				<c:if test="${form.shoppingstore == 2 }">天猫超市</c:if>
				<c:if test="${form.shoppingstore == 3 }">淘宝</c:if>
				<c:if test="${form.shoppingstore == 4 }">当当</c:if>
				<c:if test="${form.shoppingstore == 5 }">卓越/亚马</c:if>
				<c:if test="${form.shoppingstore == 6 }">京东</c:if>
				<c:if test="${form.shoppingstore == 7 }">易迅</c:if>
				</br> 购物商家: ${form.subshoppingstore }</br> 优惠类型:
				<c:if test="${form.discounttype == 1 }">免邮费</c:if>
				<c:if test="${form.discounttype == 2 }">满就减</c:if>
				<c:if test="${form.discounttype == 3 }">满就送</c:if>
				</br>
				优惠需要金额: ${form.moneyAmountNeed }</br>
				<hr />
				<h3>订单信息</h3>
				已消费金额: ${form.price }</br>  购买件数:
				${form.amount }</br> 物品重量: ${form.weight }</br> 
				<hr />
				<h3>其他限定</h3>
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
				<c:set value="${form }" var="form" scope="session"></c:set>
				</br> 
				<hr />
				<div  class="row" >
	<div class="span1">
				<input type=button value="返回修改" class="btn"
					onclick="window.location.href='${pageContext.request.contextPath}/viewsendrequest?type=change'"></div>
					<div class="span1">
				<input type=button value="确认发布并自动匹配" class="btn btn-primary"
					onclick="window.location.href='${pageContext.request.contextPath}/matchrequest'"></div>
			</div>
		</div>
		</div>
		</div>
</body>
</html>
