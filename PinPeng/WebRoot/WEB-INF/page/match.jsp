<%@page import="compute.DataConverter"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="domain.ShoppingType"%>
<%@page import="domain.Myrequest"%>
<%@page import="domain.Restriction"%>
<%@page import="compute.Match"%>
<%@page import="domain.Customer"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'match.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <%
 		//Myrequest myrequest = (Myrequest) ActionContext.getContext().getSession()
 		//		.get("myrequest");
 		//ShoppingType shoppingtype = (ShoppingType) ActionContext.getContext().getSession()
 		//		.get("shoppingtype");
 		//Restriction restriction = (Restriction) ActionContext.getContext().getSession()
 		//		.get("restriction");
 		//String store = DataConverter.convert_shoppingstore(shoppingtype.getShoppingStore());
 		//ActionContext.getContext().getSession()
  %>
  
  <body>
    <h4>这是一个导航栏</h4>
    <hr/>
   <i> 当前要匹配的订单信息：</i>
    <p>
    <font size=2 color="grey">
    	订单号：${myrequest.requestid}<br/>
    	购物区域：${store}<br/>
    	子商家：${shoppingtype.subShoppingStore }<br/>
    	优惠类型：免邮费<br/>
    	已消费金额：${myrequest.price} 元<br/>
    	购买件数：${myrequest.amount} 件<br/>
    	<!--  优惠需要金额：600元<br/>-->
    	物品重量：${myrequest.weight}KG <br/>
    	订单结束日期：${restriction.endDay}<br/>
    	最大拼单人数：${restriction.maxPeople}<br/>
    	宿舍楼限定：${dormlimited}<br/>
    	谁来付款：${payer}<br/>
    	谁取快递：${othertakelimited}<br/>
    	谁要礼物：${goodsfree}<br/>
    	性别限定：${manlimited}<br/>
    	是否有限购物品：${buylimited}<br/>
    	补充说明：${restriction.notice}<br/>
   </font>
    </p>
   <hr/>
   排序：<button >慷慨值</button>
   <button>信用</button>
   <button>金额</button><br/>
 限制：
   性别:<select>
   		<option value="male">男</option>
   		<option value="female">女</option>
   </select>
   寝室楼:<select>
   		<option value="bahaolou">八号楼</option>
   		<option value="jiuhaolou">九号楼</option>
   </select>
  
  <hr/>
  
  
 <table frame="vsides" align="center">
 <caption>匹配结果</caption>
 <tr>
 	<th>订单号</th>
 	<th>姓名</th>
 	<th>性别</th>
 	<th>慷慨度</th>
 	<th>信用值</th>
 	<th>订单金额</th>
 </tr>
<% 

	List match_list=(List)ActionContext.getContext().getSession().get("match_list");
	Iterator it=match_list.iterator();
	while (it.hasNext()) 
	{
		Match match = (Match) it.next();
		Myrequest myrequst = match.getMyrequest();
		//ShoppingType matchshoppingtype = match.getShoppingType();
		//Restriction matchrestriction = match.getRestriction();
		Customer customer = match.getCustomer();
		ActionContext.getContext().getSession().put("myrequst", myrequst);
		ActionContext.getContext().getSession().put("mycustomer", customer);
%>
  <tr>
  	<td>${myrequest.requestid}</td>
 	<td>${mycustomer.name}</td>
 	<td>男</td>
 	<td>${mycustomer.generosity}</td>
 	<td>${mycustomer.credit}</td>
 	<td>${myrequst.price}</td>
 	<td><input type="button" value="匹配"></td>
 	<td><input type="button" value="收藏"></td>
 </tr>
 <% 
 	}
 	ActionContext.getContext().getSession().remove("match_list");
 	ActionContext.getContext().getSession().remove("myrequest");
 	ActionContext.getContext().getSession().remove("mycustomer");
 %>
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
