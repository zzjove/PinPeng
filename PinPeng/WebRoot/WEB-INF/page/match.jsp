<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  
  <body>
    <h4>这是一个导航栏</h4>
    <hr/>
   <i> 当前要匹配的订单信息：</i>
    <p>
    <font size=2 color="grey">
    	购物区域：天猫<br/>
    	优惠类型：满就送<br/>
    	已消费金额：500元<br/>
    	优惠需要金额：600元<br/>
    	物品重量：2KG <br/>
    	.<br/>
    	.<br/>
    	.<br/>
    	谁来付款：我
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
  
  <%
  		//dao.
   %>
  
 <table frame="vsides" align="center">
 <caption>匹配结果</caption>
 <tr>
 	<th>姓名</th>
 	<th>性别</th>
 	<th>慷慨度</th>
 	<th>信用值</th>
 	<th>订单金额</th>
 </tr>
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

 </table>
  </body>
</html>
