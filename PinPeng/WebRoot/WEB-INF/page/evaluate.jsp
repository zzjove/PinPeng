<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'evaluate.jsp' starting page</title>
    
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
    <h2>用户评价</h2>
    <s:form action="evaluate" method="post" >
   		<div>
    		<p>请对本次拼单中wangwei的表现作出评价:</p>
    		<div>
    			<select name="assess">
					<option value="5">非常满意</option>
					<option value="4">满意</option>
					<option value="3">一般</option>
					<option value="1">不满意</option>
					<option value="0">非常不满意</option>
				</select>
    		</div>
    		<div>
    		<p>
					<input type="submit" value="确定"/>
			</p>
    	</div>
    </s:form>
  </body>
</html>
