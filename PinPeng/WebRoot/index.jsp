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
    
    <title>My JSP 'index.jsp' starting page</title>
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
    This is my JSP page. <br>
	系统自带的index

	<s:form action="login" method="post" style="height: 393px;">
								<div class="loginBox">
									<div class="loginBoxCenter">

										<p>
											<label>
												用户名：
											</label>
										</p>
										<p>
											<input type="text" name="studentid" autofocus="autofocus"
												required="required" autocomplete="off" placeholder="请输入用户名"
												class="loginInput" />
											<br />
											<span style="color: red">${form.errors.username }<br />
										</p>
										<p>
											<label>
												密码：
											</label>
										</p>
										<p>
											<input type="password" name="password" required="required"
												placeholder="请输入密码" value="" class="loginInput" />
											<br />
											<span style="color: red">${form.errors.password }<br />
										</p>
										<p>
											<input type="submit" value="登入" style="float: right" />
										</p>
									</div>
								</div>
	</s:form>
	<s:form action="viewregister" method="post">
		<p>
			<input type="submit" value="注册" style="float: right" />
		</p>
	</s:form>
  </body>
</html>
