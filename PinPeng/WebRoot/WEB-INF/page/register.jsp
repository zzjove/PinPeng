<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
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
    <h2>这是一个不能再简单的注册页面</h2>
    <s:form action="register" method="post">
    	<input type="text" name="studentid" placeholder="学号" /><br />
    	<input type="text" name="name" placeholder="姓名" /><br />
    	<input type="password" name="password" placeholder="密码" /><br />
    	<input type="password" name="repassword" placeholder="再次输入密码" /><br />
    	<input type="email" name="email" placeholder="邮箱" /><br />
    	<input type="text" name="qqnumber" placeholder="qq号" /><br />
    	<input type="text" name="telnumber" placeholder="手机号码" /><br />
    	<input type="radio" name="sex" value="male" />男
    	<input type="radio" name="sex" value="female"/>女<br />
    	<input type="text" name="dormitory" placeholder="寝室楼号" /><br />
    	<input type="submit" value="确认">
    	
    </s:form>
  </body>
</html>
