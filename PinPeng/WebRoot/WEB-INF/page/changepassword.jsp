<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'changepassword.jsp' starting page</title>
    
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
<jsp:include page="/WEB-INF/page/topmenu.jsp" />
<div style="width:800px; height:540px; margin:auto">
    <div><jsp:include page="/WEB-INF/page/spacemenu.jsp" /></div>
    
    <div style=" width:600px; float:left">
    <h2>修改密码</h2>
    <s:form action="#" method="post">
    	<input type="text" name="#" placeholder="原密码" /><br />
    	<input type="text" name="#" placeholder="新密码" /><br />
    	<input type="text" name="#" placeholder="再次输入新密码" /><br />
    	
    	<input type="submit" value="确认">
    	</s:form>
    </div>
    </div>
  </body>
</html>
