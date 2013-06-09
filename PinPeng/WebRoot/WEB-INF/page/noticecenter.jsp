<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'noticecenter.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css" media="all">
    <link rel="stylesheet" type="text/css" href="css/bootstrap-responsive.css" media="all">

  </head>
  
  <body>
  	<jsp:include page="topmenu.jsp" />
  	
    <div class="container-fluid">
  		<div class="row">
  			 &nbsp;<br/>
  			 &nbsp;<br/>
  			 &nbsp;<br/>
  			 &nbsp;<br/>
  		</div>
  		
  		<div class="row">
  			<div class="span3">
  				<div class="hero-unit">
  					<h4><a href="#sendNotice" data-toggle="modal">发送消息</a></h4>
  					<h4>我的站内信</h4>
  					
  					<ul>
  						<li><a href="${pageContext.request.contextPath}/viewnoticecenter.action?type=in">收到的消息</a></li>
  						<li><a href="${pageContext.request.contextPath}/viewnoticecenter.action?type=out">发送的消息</a></li>
  					</ul>
  						
  			
  				</div>
  			</div>
  			<div class="span9">
  				<div class="container-fluid">
  					<div class="hero-unit">
  						<ul>
  							<c:forEach var="item" items="${messageBox }">
 								<li>${item.content }</li>
							 </c:forEach>
  						</ul>
  						
  					</div>
  					
  				</div>
  			</div>
  		</div>
  	</div>
  	
  	<div id="sendNotice" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  		<div class="modal-header">
    		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
    		<h3 id="myModalLabel">发送新消息</h3>
 		</div>
  		<div class="modal-body">
    		<form class="form-horizontal" action="sendnotice" method="post">
    			<div class="control-group">
    				<label class="control-label" for="inputreciever">收件人</label>
    				<div class="controls">
    					<input type="text" name="send_to" placeholder="收件人" id="inputsend_to" />
    				</div>
    			</div>
    			<div class="control-group">
    				<label class="control-label" for="inputcontent">内容</label>
    				<div class="controls">
    					<input type="textarea" rows="3" cols="20" name="content" placeholder="内容" id="inputcontent" />
    				</div>
    			</div>
    			<div class="control-group">
    				<!--  <div class="controls">
    					<input type="submit" class="btn btn-primary" value="确认">
    				</div>-->
  					<div class="modal-footer">
    					<button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
    					<button type="submit" class="btn btn-primary">发送</button>
  					</div>
    			</div>
    		</form>
  		</div>
  	</div>
	<script src="http://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>
