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

</head>

	<body>
	<hr />
	<h2>购物类型</h2>
	<form class="form-horizontal" action="sendrequest" method="post">
		
		<div class="control-group">
    		<label class="control-label" for="inputshoppingstore">购物区域</label>
    		<div class="controls">
    			<select name="shoppingstore" id="inputshoppingstore">
					<option value="1">1号店</option>
					<option value="2">天猫超市</option>
					<option value="3">淘宝</option>	
					<option value="4">当当</option>
					<option value="5">卓越/亚马�/option>
					<option value="6">京东</option>
					<option value="7">易迅</option>
				</select>
    		</div>
    	</div>
		
		<div class="control-group">
    		<label class="control-label" for="inputsubshoppingstore">购物商家</label>
    		<div class="controls">
    			<input type="text" name="subshoppingstore" placeholder="购物商家" id="inputsubshoppingstore" />
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputdiscounttype">优惠类型</label>
    		<div class="controls">
    			<select name="inputdiscounttype">
					<option value="1">免邮�/option>
					<option value="2">满就�/option>
					<option value="3">满就�/option>
				</select>
    		</div>
    	</div>
		
		
		<hr />
	
		<h2>订单信息</h2>
		<div class="control-group">
    		<label class="control-label" for="inputprice">已消费金�/label>
    		<div class="controls">
				<input type="text" name="price" id="inputprice" placeholder="已消费金� />�
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputmoneyamountneed">优惠需要金�/label>
    		<div class="controls">
				<input type="text" name="moneyAmountNeed" id="inputmoneyamountneed" placeholder="优惠需要金� />�   		
			</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputamount">购买件数</label>
    		<div class="controls">
				<input type="text" name="amount" id="inputamount" placeholder="购买件数" />�   		
			</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputweight">物品重量</label>
    		<div class="controls">
				<input type="text" name="weight" id="inputweight" placeholder="物品重量" />千克	
			</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputitemstype">物品种类</label>
    		<div class="controls">
				<select name="itemstype" id="inputitemstype">
					<option value="food">食物</option>
					<option value="shoes">�/option>
					<option value="clothes">衣服</option>
				</select>
			</div>
    	</div>

		<hr />
		<h2>其他限定</h2>
		
		<!--  订单开始日�input type="date" name="myrequesttime" step=1 /><br />-->
		<div class="control-group">
    		<label class="control-label" for="inputendday">订单结束日期</label>
    		<div class="controls">
				<input type="date" name="endday" id="inputendday" step=1 />
			</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputmaxpeople">希望拼单人数不超�/label>
    		<div class="controls">
				<input type="number" name="maxpeople" id="inputmaxpeople" max=5 min=2 value=5 step=1 />�
			</div>
    	</div>
    	
		<div class="control-group">
    		<label class="control-label" for="inputdormlimited">宿舍楼限�/label>
    		<div class="controls">
				<label class="radio inline">
    				<input type="radio" name="dormlimited" id="inputdormlimited1" value="0" checked/>�
    			</label>
    			<label class="radio inline">
    				<input type="radio" name="dormlimited" id="inputdormlimited2" value="1"/>�
				</label>
			</div>
    	</div>
		
		<div class="control-group">
			<label class="control-label" for="inputpayer">谁来付款</label>
			<div class="controls">
				<label class="radio ">
					<input type="radio" name="payer" id="inputpayer1" value="0" checked/>都可�
				</label>
				<label class="radio ">
					<input type="radio" name="payer" id="inputpayer2" value="1" />其他�
				</label>
				<label class="radio ">
					<input type="radio" name="payer" id="inputpayer3" value="2" />�
				</label>
			</div>	
		</div>
		
		<div class="control-group">
			<label class="control-label" for="inputothertakelimited">谁来付款</label>
			<div class="controls">
				<label class="radio ">
					<input type="radio" name="othertakelimited" id="inputothertakelimited1" value="0" checked/>都可�
				</label>
				<label class="radio ">
					<input type="radio" name="othertakelimited" id="inputothertakelimited2" value="1" />其他�
				</label>
				<label class="radio ">
					<input type="radio" name="othertakelimited" id="inputothertakelimited3" value="2" />�
				</label>
			</div>	
		</div>
		
		<div class="control-group">
			<label class="control-label" for="inputgoodsfree">谁来付款</label>
			<div class="controls">
				<label class="radio ">
					<input type="radio" name="inputgoodsfree" id="inputgoodsfree1" value="0" checked/>都可�
				</label>
				<label class="radio ">
					<input type="radio" name="inputgoodsfree" id="inputgoodsfree2" value="1" />其他�
				</label>
				<label class="radio ">
					<input type="radio" name="inputgoodsfree" id="inputgoodsfree3" value="2" />�
				</label>
			</div>	
		</div>
		

		<div class="control-group">
    		<label class="control-label" for="inputmanlimited">性别限制</label>
    		<div class="controls">
    			<label class="radio inline">
    				<input type="radio" name="manlimited" id="inputmanlimited1" value="1" checked/>�
    			</label>
    			<label class="radio inline">
    				<input type="radio" name="manlimited" id="inputmanlimited2" value="0"/>�
				</label>
    		</div>
    	</div>
    	
		<div class="control-group">
    		<label class="control-label" for="inputmbuylimited">性别限制</label>
    		<div class="controls">
    			<label class="radio inline">
    				<input type="radio" name="buylimited" id="inputmbuylimited1" value="0" checked/>�
    			</label>
    			<label class="radio inline">
    				<input type="radio" name="buylimited" id="inputmbuylimited2" value="1"/>�
				</label>
    		</div>
    	</div>
    	
			   <input type="radio" name="manlimited" value="2">�
		<hr />
		<div class="control-group">
    		<label class="control-label" for="inputmanlimited">其他说明</label>
    		<div class="controls">
    			<textarea rows="5" cols="30" name="notice"
					placeholder="add some notice here">
    			</textarea>
    		</div>
    	</div>

		<hr />
		<div class="control-group">
    		<div class="controls">
    			<input type="submit" class="btn btn-primary" value="确认" />
    		</div>
    	</div>

	</form>
	
	<script src="http://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
	</body>
</html>
