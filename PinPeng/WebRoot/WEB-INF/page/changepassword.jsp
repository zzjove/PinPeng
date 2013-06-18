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
  
  <body style="font-family:微软雅黑">
<jsp:include page="topmenu.jsp" />
	<div class="container" style="width:1200px;">
	<div style="width:1200px;margin-top:20px;">
		<div class="span1" style="width:10px;"></div> 
		<div class="span2">
			<div style="margin-left:20px;margin-top:50px;position:relative;">
				<jsp:include page="/WEB-INF/page/spacemenu.jsp" />
			</div>
		</div>
		<div class="span1"></div>
		<div class="span7 hero-unit" style="margin-left:20px;margin-top:50px;position:relative;padding-top: 10px;">
		
			<h3>修改密码</h3>
    <s:form action="changepassword" method="post" class="form">
    	<input type="password" name="oldpassword" placeholder="原密码" />${form.errors.oldpassword }<br />
    	<input type="password" name="newpassword1" placeholder="新密码" />${form.errors.newpassword1 }<br />
    	<input type="password" name="newpassword2" placeholder="再次输入新密码" />${form.errors.newpassword2 }<br />
    	
    	<input type="submit" value="确认">
    </s:form>
		</div>
		</div>
	</div>
		

	
  </body>
</html>
