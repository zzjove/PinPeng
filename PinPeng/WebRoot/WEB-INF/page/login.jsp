<%@page import="domain.Customer"%>
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

<title>My JSP 'Login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="all">
<link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="all">
</head>

<body>

	<%
        Customer customer = (Customer)(session.getAttribute("customer"));
        if (customer == null)
        {
    %>
	<s:form class="form-horizontal" action="login" method="post" >
		<div>
				
				<h4> 用户名： </h4>
				
				<p>
					<input type="text" name="customer" autofocus="autofocus"
						required="required" autocomplete="off" placeholder="请输入用户名"
						class="loginInput" /> <br /> <span style="color: red">${form.errors.username
						}<br />
				</p>
				<h4>密码：</h4> 
				
				<p>
					<input type="password" name="password" required="required"
						placeholder="请输入密码" value="" class="loginInput" /> <br /> <span
						style="color: red">${form.errors.password }<br />
				</p>
				<p>
					请输入验证码
					<input type="text" name="checkcode" />
				    <img src="checkcode" style="height: 20px;" />${form.errors.checkcode }					
				</p>
				
				<div class="control-group" style="float:right;margin-right:70px">
    		<div class="controls">
    			<input type="submit" class="btn btn-primary" value="登入" />
    		</div>
    	</div>
			</div>
	</s:form>
	<s:form action="viewregister" method="post">
		
		<div class="control-group" style="float:right;margin-right:70px;margin-bottom:30px">
    		<div class="controls">
    			<input type="submit" class="btn btn-link" value="还没有账号?点击立即注册" />
    		</div>
    	</div>
	</s:form>

	<%
		}
        else
        {
    %>
	<table>
		
		<tr>
			<td><h1>Welcome back!</h1></td>
		</tr>
		<tr><td><h2>${customer.name}</h2></td></tr>
		<tr>
			<td>您有<a href="#">N条未读短消息</a>
			</td>
		</tr>
		<tr>
			<td><a href="#">有新请求</a>
			</td>
		</tr>
	</table>
	<%
    	}
    %>
</body>
</html>
