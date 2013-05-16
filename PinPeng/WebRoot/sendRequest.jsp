<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
  	<hr/>
    <h2>Shopping Type</h2>
    <form action="" method="post">
  	 购物区域
  	 	<select name="shoppingArea">
  	 		<option value="yihaodian">1号店</option>
  	 		<option value="tianmaochaoshi">天猫超市</option>
  	 		<option value="taobao">淘宝</option>
  	 		<option value="dangdang">当当</option>
  	 		<option value="yamaxun">卓越/亚马逊</option>
  	 		<option value="jingdong">京东</option>
  	 		<option value="yixun">易迅</option>
  	 	</select><br/>
  	<input type="text" name="subShoppingArea" placeholder="购物商家"/><br/>
   	 优惠类型
    	<select name="discountType">
  	 		<option value="mianyoufei">免邮费</option>
  	 		<option value="manjiujian">满就减</option>
  	 		<option value="manjiusong">满就送</option>
  	 	</select><br/>
    </form>
    <hr/>
    <h2>About Your Order</h2>
    <input type="text" name="moneyAmountSpent" placeholder="已消费金额"/>元<br/>
    <input type="text" name="moneyAmountNeed" placeholder="优惠需要金额"/>元<br/>
    <input type="text" name="itemsAmount" placeholder="购买件数"/>件<br/>
    <input type="text" name="itemsWeight" placeholder="物品重量"/>千克<br/>
    物品种类
    	<select name="itemsType">
    		<option value="food">食物</option>
    		<option value="shoes">鞋</option>
    		<option value="clothes">衣服</option>  		
    	</select><br />
  	<hr/>
    <h2>Other Restrictions</h2>
   	订单开始日期<input type="date" name="startDate" step=1 /><br />
 	订单结束日期<input type="date" name="endDate" step=1 /><br/>
 	希望拼单人数不超过<input type="number" name="mostNumberOfPeople" max=5 min=2 value=5 step=1/>人<br/>
    <input type="text" name="dormRestriction" placeholder="拼朋寝室限定"/><br/>
     谁来付款:
    <input type="radio" name="payer" value="me"/>我
    <input type="radio" name="payer" value="others">其他人<br/>
    谁取快递:
    <input type="radio" name="itemsTaker" value="me"/>我
    <input type="radio" name="itemsTaker" value="others">其他人<br/>
     
   谁要礼物:
   <input type="radio" name="giftSharer" value="me"/>我
    <input type="radio" name="giftSharer" value="others">其他人<br/>
    性别限制:
    <input type="radio" name="sexRestriction" value="male"/>男
    <input type="radio" name="sexRestriction" value="female">女<br/>
    <hr/>
    <textarea rows="10" cols="30" name="notice"  placeholder="add some notice here">
    
    </textarea>
    <hr/>
    <input type="submit" value="确认" />
    
  </body>
</html>
