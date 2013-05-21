<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML >
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'sendRequest.jsp' starting page</title>

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
	<hr />
	<h2>Shopping Type</h2>
	<form action="sendrequest" method="post">
		购物区域 <select name="shoppingstore">
			<option value="1">1号店</option>
			<option value="2">天猫超市</option>
			<option value="3">淘宝</option>
			<option value="4">当当</option>
			<option value="5">卓越/亚马逊</option>
			<option value="6">京东</option>
			<option value="7">易迅</option>
		</select><br /> 
		<input type="text" name="subshoppingstore" placeholder="购物商家" /><br />
		优惠类型 <select name="discounttype">
			<option value="1">免邮费</option>
			<option value="2">满就减</option>
			<option value="3">满就送</option>
		</select><br />

		<hr />

		<h2>About Your Order</h2>
		<input type="text" name="price" placeholder="已消费金额" />元<br />
		<!--  <input type="text" name="moneyAmountNeed" placeholder="优惠需要金额" />元<br />-->
		<input type="text" name="amount" placeholder="购买件数" />件<br /> 
		<input type="text" name="weight" placeholder="物品重量" />千克<br /> 
		物品种类 <select name="itemstype">
			<option value="food">食物</option>
			<option value="shoes">鞋</option>
			<option value="clothes">衣服</option>
		</select><br />
		<hr />

		<h2>Other Restrictions</h2>
		<!--  订单开始日期<input type="date" name="myrequesttime" step=1 /><br />-->
		订单结束日期<input type="date" name="endday" step=1 /><br /> 
		希望拼单人数不超过<input type="number" name="maxpeople" max=5 min=2 value=5 step=1 />人
		<br />
		
		宿舍楼限定:<input type="radio" name="dormlimited" value="0" />否
			   <input type="radio" name="dormlimited" value="1" />是
		<br />
		谁来付款: <input type="radio" name="payer" value="0" />都可
			   <input type="radio" name="payer" value="1">其他人
			   <input type="radio" name="payer" value="2">我
		<br/> 
		
		谁取快递: <input type="radio" name="othertakelimited" value="0" />都可 
			   <input type="radio" name="othertakelimited" value="1">其他人
			   <input type="radio" name="othertakelimited" value="2">我
		<br />
		 
		谁要礼物: <input type="radio" name="goodsfree" value="0" />都可
			   <input type="radio" name="goodsfree" value="1">其他人
			   <input type="radio" name="goodsfree" value="2">我
		<br />
		 
		性别限制: <input type="radio" name="manlimited" value="0" />都可
			   <input type="radio" name="manlimited" value="1">男
			   <input type="radio" name="manlimited" value="2">女
		<br />
		是否有限购物品:<input type="radio" name="buylimited" value="0" />否
			  	  <input type="radio" name="buylimited" value="1">是
		<br />
		<hr />
		<textarea rows="10" cols="30" name="notice"
			placeholder="add some notice here">
    	</textarea>
		<hr />
		<input type="submit" value="确认" />
	</form>
</body>
</html>
