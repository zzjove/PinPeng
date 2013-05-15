<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
    <form action="" method="post">
    	<input type="text" name="studentId" placeholder="学号" /><br />
    	<input type="text" name="userName" placeholder="姓名" /><br />
    	<input type="text" name="userPassword" placeholder="密码" /><br />
    	<input type="text" name="userPasswordConfirmation" placeholder="再次输入密码" /><br />
    	<input type="email" name="userEmail" placeholder="邮箱" /><br />
    	<input type="text" name="userQQ" placeholder="qq号" /><br />
    	<input type="text" name="userTel" placeholder="手机号码" /><br />
    	<input type="radio" name="sex" value="male" />男
    	<input type="radio" name="sex" value="female"/>女<br />
    	<input type="text" name="userDorm" placeholder="寝室楼号" /><br />
    	<input type="submit" value="确认">
    	
    </form>
  </body>
</html>
