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
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="all">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="all">
<style type="text/css">
.page{
	width:700px;
	margin-left:200px;
	border-style:ridge;
	border-width:3px;
	padding:10px;
	margin-top:20px;
}

</style>
<script type="text/javascript">

</script>
</head>

	<body style="font-family:微软雅黑">
	<jsp:include
					page="topmenu.jsp" />
					
	<form class="form-horizontal" action="confirmrequest" method="post" style="margin-top:40px;">
		<div class="hero-unit page">
	<h3>购物类型</h3>
		<div class="control-group" >
    		<label class="control-label" for="inputshoppingstore">购物区域</label>
    		<div class="controls">
    			<select name="shoppingstore" id="inputshoppingstore">
					<option value="1">1号店</option>
					<option value="2">天猫超市</option>
					<option value="3">淘宝</option>	
					<option value="4">当当</option>
					<option value="5">卓越/亚马</option>
					<option value="6">京东</option>
					<option value="7">易迅</option>
				</select>
    		</div>
    	</div>
		
		<div class="control-group">
    		<label class="control-label" for="inputsubshoppingstore">购物商家</label>
    		<div class="controls">
    			<input type="text" name="subshoppingstore" placeholder="购物商家" id="inputsubshoppingstore" value="${form.subshoppingstore}"/>${form.errors.subshoppingstore}
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputdiscounttype">优惠类型</label>
    		<div class="controls">
    			<select name="discounttype">
					<option value="1">免邮费</option>
					<option value="2">满就减</option>
					<option value="3">满就送</option>
				</select>
    		</div>
    	</div>
		
		<div class="control-group">
    		<label class="control-label" for="inputmoneyamountneed">优惠需要金额</label>
    		<div class="controls">
				<input type="text" name="moneyAmountNeed" id="inputmoneyamountneed" placeholder="优惠需要金额" value="${form.moneyAmountNeed}"/>${form.errors.moneyAmountNeed}   		
			</div>
    	</div>
	
	</div>
	<div class="hero-unit page" >
		<h3>订单信息</h3>
		<div class="control-group">
    		<label class="control-label" for="inputprice">已消费金额</label>
    		<div class="controls">
				<input type="text" name="price" id="inputprice" placeholder="已消费金额" value="${form.price}"/>${form.errors.price}
    		</div>
    	</div>
    	
    	
    	
    	<div class="control-group">
    		<label class="control-label" for="inputamount">购买件数</label>
    		<div class="controls">
				<input type="text" name="amount" id="inputamount" placeholder="购买件数" value="${form.amount}"/>件 ${form.errors.amount}		
			</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputweight">物品重量</label>
    		<div class="controls">
				<input type="text" name="weight" id="inputweight" placeholder="物品重量" value="${form.weight}"/>千克	${form.errors.weight}
			</div>
    	</div>
    	
    	

		
		</div>
	<div class="hero-unit page" >
		<h3 class="hero">其他限定</h3>
		<!--  订单开始日�input type="date" name="myrequesttime" step=1 /><br />-->
		<div class="control-group">
    		<label class="control-label" for="inputendday">订单结束日期</label>
    		<div class="controls">
				<input type="date" name="endday" id="endday" step=1 value="${form.endday}"/>${form.errors.endday}
			</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputmaxpeople">希望拼单人数不超</label>
    		<div class="controls">
				<input type="number" name="maxpeople" id="inputmaxpeople" max=5 min=2 value=5 step=1 value="${form.maxpeople}"/>${form.errors.maxpeople}
			</div>
    	</div>
    	
		<div class="control-group">
    		<label class="control-label" for="inputdormlimited">宿舍楼限定</label>
    		<div class="controls">
				<label class="radio inline">
    				<input type="radio" name="dormlimited" id="inputdormlimited1" value="0" checked/>否
    			</label>
    			<label class="radio inline">
    				<input type="radio" name="dormlimited" id="inputdormlimited2" value="1"/>是
				</label>
			</div>
    	</div>
		
		<div class="control-group">
			<label class="control-label" for="inputpayer">谁来付款</label>
			<div class="controls">
				<label class="radio ">
					<input type="radio" name="payer" id="inputpayer1" value="0" checked/>都可
				</label>
				<label class="radio ">
					<input type="radio" name="payer" id="inputpayer2" value="1" />其他
				</label>
				<label class="radio ">
					<input type="radio" name="payer" id="inputpayer3" value="2" />我
				</label>
			</div>	
		</div>
		
		<div class="control-group">
			<label class="control-label" for="inputothertakelimited">谁取快递</label>
			<div class="controls">
				<label class="radio ">
					<input type="radio" name="othertakelimited" id="inputothertakelimited1" value="0" checked/>都可
				</label>
				<label class="radio ">
					<input type="radio" name="othertakelimited" id="inputothertakelimited2" value="1" />其他
				</label>
				<label class="radio ">
					<input type="radio" name="othertakelimited" id="inputothertakelimited3" value="2" />我
				</label>
			</div>	
		</div>
		
		<div class="control-group">
			<label class="control-label" for="inputgoodsfree">谁要礼物</label>
			<div class="controls">
				<label class="radio ">
					<input type="radio" name="goodsfree" id="inputgoodsfree1" value="0" checked/>都可
				</label>
				<label class="radio ">
					<input type="radio" name="goodsfree" id="inputgoodsfree2" value="1" />其他
				</label>
				<label class="radio ">
					<input type="radio" name="goodsfree" id="inputgoodsfree3" value="2" />我
				</label>
			</div>	
		</div>
		

		<div class="control-group">
    		<label class="control-label" for="inputmanlimited">性别限制</label>
    		<div class="controls">
    			<label class="radio inline">
    				<input type="radio" name="manlimited" id="inputmanlimited1" value="0" checked/>都可
    			</label></br>
    			<label class="radio inline">
    				<input type="radio" name="manlimited" id="inputmanlimited1" value="1" />男
    			</label></br>
    			<label class="radio inline">
    				<input type="radio" name="manlimited" id="inputmanlimited2" value="2"/>女
				</label></br>
				
    		</div>
    	</div>
    	
		<div class="control-group">
    		<label class="control-label" for="inputmbuylimited">是否限购</label>
    		<div class="controls">
    			<label class="radio inline">
    				<input type="radio" name="buylimited" id="inputmbuylimited1" value="0" checked/>否
    			</label>
    			<label class="radio inline">
    				<input type="radio" name="buylimited" id="inputmbuylimited2" value="1"/>是
				</label>
    		</div>
    	</div>

		<div class="control-group">
    		<label class="control-label" for="inputmanlimited">其他说明</label>
    		<div class="controls">
    			<textarea rows="5" cols="30" name="notice"
					placeholder="add some notice here">${form.notice }
    			</textarea>
    		</div>
    	</div>

		
		</div>
		<div class="control-group" style="padding-left:20px; margin-top:10px;margin-bottom:30px;">
    		<div class="controls">
    			<input type="submit" class="btn btn-info btn-large" value="确认" />
    		</div>
    	</div>

	</form>
	
	
	<script src="http://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
	</body>
</html>
