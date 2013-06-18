<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>查看订单</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="all">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="all">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>

  <body>
  
   	--订单信息--</br>
   	订单编号：${order.orderid }</br>
   	用户名：${order.customer.name }</br>
   	时间：${order.beginTime }</br>
   	价格：${order.price }</br>
   	拼单人数：${order.numberPeople }</br>
   	商品数量：${order.amount }</br>
              商品重量${order.weight }</br>
   
   --request信息--</br>
		<table frame="vsides" align="left">
		<tr>
			<th>request编号</th>
			<th>用户</th>
			<th>价钱</th>
			<th>数量</th>
			<th>重量</th>
			<th>备注</th>
		</tr>
		<c:forEach var="item" items="${requests }">
		<tr>
			<td>${item.requestid}</td>
			<td>${item.customer.name}</td>
			<td>${item.price}</td>
			<td>${item.amount}</td>
			<td>${item.weight}</td>
			<td>${item.content}</td>
			<!--  <td>
			</td>
			<td>
			</td>
			<td>
			</td>-->
			<a href="" data-toggle="modal">确认拼单</a>
			<a href="" data-toggle="modal">收藏</a>
			<a href="#${item.customer.name }" data-toggle="modal">发消息给TA</a>
		</tr>
		
		<div id="${item.customer.name }" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  		<div class="modal-header">
    		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    		<h3 id="myModalLabel">发送新消息</h3>
 		</div>
  		<div class="modal-body">
    		<form class="form-horizontal" action="sendnotice" method="post">
    			<div class="control-group">
    				<label class="control-label" for="inputreciever">收件人</label>
    				<div class="controls">
    					<input type="text" name="send_to" placeholder="收件人" id="inputsend_to" value="${item.customer.name }" />
    				</div>
    			</div>
    			<div class="control-group">
    				<label class="control-label" for="inputcontent">内容</label>
    				<div class="controls">
    					<input type="textarea" rows="3" cols="20" name="content" placeholder="内容" id="inputcontent" />
    				</div>
    			</div>
    			<div class="control-group">
    				<!--  <div class="controls">
    					<input type="submit" class="btn btn-primary" value="确认">
    				</div>-->
  					<div class="modal-footer">
    					<button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
    					<button type="submit" class="btn btn-primary">发送</button>
  					</div>
    			</div>
    		</form>
  		</div>
  	</div>
	</c:forEach>
	</table>
		  	
  	
	<script src="http://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>
