<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>查看request</title>
    
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

  <jsp:include page="topmenu.jsp" />
<div class="row" style="margin-top:60px">
<div class="span6 offset3">
    <h2>查看请求</h2>
	<p><a href="#">${otherName}</a>�{otherRequest.myrequestTime}发布的拼单请�/p>
	<div  class="row" >
	<div class="span1">
	<s:form action="#" method="post">
		<div class="control-group" >
    		<div class="controls">
    			<input type="submit" class="btn btn-primary" value="自动匹配" />
    		</div>
    	</div>
		</s:form>
		</div>
		<div class="span1">
	<s:form action="#" method="post">
		<div class="control-group" >
    		<div class="controls">
    			<input type="submit" class="btn" value="返回订单列表" />
    		</div>
    	</div>
		</s:form>
		</div>
	</div>
		<div style="margin-top:30px">
        <p>购物商家�{otherRequest.shoppingStore}  ${otherRequest.subShoppingStore}</p>
        <p>优惠类型�{otherRequest.discountType}</p>
		<hr />
		<p>已消费金额：${otherRequest.price}</p>
        <p>${otherRequest.discountInfo}</p>
        <p>购买件数�{otherRequest.amount}</p>
        <p>商品重量�{otherRequest.weight}</p>
        <p>商品种类�/p>
        <hr />
		<p>订单结束日期�{otherRequest.endDay}</p>
        <p>希望拼单人数不超�{otherRequest.maxPeople}</p>
    	<p>宿舍楼限定：${otherRequest.dormLimited}</p>
    	<p>谁来付款�{otherRequest.payer}</p>
		<p>谁取快递：${otherRequest.othertakeLimited}</p>
		<p>赠品归属�{otherRequest.goodsFree}</p>
        <p>性别限定�{otherRequest.manLimited}</p>
		<p>是否限购�{otherRequest.buyLimited}</p>
		<hr />
		<p>补充说明�{otherRequest.notice}</p>
		<hr />
		
		
		
		<p>
			<a href="" data-toggle="modal">确认拼单</a>
			<a href="" data-toggle="modal">收藏</a>
			<a href="#${otherName}" data-toggle="modal">发消息给TA</a>
        </p>
        
        </div>
        </div>
        </div>
        <div id="${otherName}" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  		<div class="modal-header">
    		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    		<h3 id="myModalLabel">发送新消息</h3>
 		</div>
  		<div class="modal-body">
    		<form class="form-horizontal" action="sendnotice" method="post">
    			<div class="control-group">
    				<label class="control-label" for="inputreciever">收件�/label>
    				<div class="controls">
    					<input type="text" name="send_to" placeholder="收件� id="inputsend_to" value="${otherName}" />
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
    					<button type="submit" class="btn btn-primary">发�/button>
  					</div>
    			</div>
    			
	<script src="http://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>
