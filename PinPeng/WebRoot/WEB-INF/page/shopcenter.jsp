<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'shopcenter.jsp' starting page</title>
    
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
  
  <div>
  <jsp:include page="topmenu.jsp" />
  </div>
  <h2>一号店专区</h2>
<div>
  <div>
  <p>2013-06-07 13:00 <a href="#">王炜</a> 在这里发布拼单请求</p>
  <p>类别：***   需要金额：***  结束日期：***  上限人数：***</p>
  <p><a href="#">MORE</a></p>
  </div>

	<div>
  <p>2013-06-07 13:00 <a href="#">王炜</a> 在这里发布拼单请求</p>
  <p>类别：***   需要金额：***  结束日期：***  上限人数：***</p>
  <p><a href="#">MORE</a></p>
  </div>

<div>
  <p>2013-06-07 13:00 <a href="#">王炜</a> 在这里发布拼单请求</p>
  <p>类别：***   需要金额：***  结束日期：***  上限人数：***</p>
  <p><a href="#">MORE</a></p>
  </div>
  
  <div>
  <p>2013-06-07 13:00 <a href="#">王炜</a> 在这里发布拼单请求</p>
  <p>类别：***   需要金额：***  结束日期：***  上限人数：***</p>
  <p><a href="#">MORE</a></p>
  </div>
  
  <div>
  <p>2013-06-07 13:00 <a href="#">王炜</a> 在这里发布拼单请求</p>
  <p>类别：***   需要金额：***  结束日期：***  上限人数：***</p>
  <p><a href="#">MORE</a></p>
  </div>

</div>
  
  
  </body>
</html>
