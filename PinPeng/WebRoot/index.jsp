<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<import="org.apache.struts2.ServletActionContext"> <%@ taglib
	prefix="s" uri="/struts-tags"%> <!DOCTYPE html">
<html>
<head>


<title>主页</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="../css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="../css/bootstrap-responsive.css">
	
<body style="font-family:微软雅黑" background="images/bg.png">
	<jsp:include page="WEB-INF/page/topmenu.jsp"></jsp:include>
	<div class="row" style="margin-top:40px;height:300px;">
		<div class="span7 offset2 ">
			<div id="myCarousel" class="carousel slide" >
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
				</ol>
				<!-- Carousel items -->
				<div class="carousel-inner">
					<div class="active item">
						<img src="images/11.jpg" style="margin:0 auto">
						<div class="carousel-caption">
							<h4>yihaodian</h4>
							<p>lalalalalalalalala</p>
						</div>
					</div>
					<div class="item">
						<img src="images/22.jpg" style="margin:0 auto">
						<div class="carousel-caption">
							<h4>京东商城</h4>
							<p>lalalalalalalallalalala</p>
						</div>
					</div>
					<div class="item">
						<img src="images/33.jpg" style="margin:0 auto">
						<div class="carousel-caption">
							<h4>yihaodian</h4>
							<p>lalalalalalalalala</p>
						</div>
					</div>
				</div>
				<!-- Carousel nav -->
				<a class="carousel-control left" href="#myCarousel"
					data-slide="prev">&lsaquo;</a> <a class="carousel-control right"
					href="#myCarousel" data-slide="next">&rsaquo;</a>
			</div>
			<div class="row" style="margin-top:30px">
			<ul class="thumbnails" style="padding-left:120px">
		<li class="span2 offset1"><a href="${pageContext.request.contextPath}/viewselectrequest.action?shop=1" class="thumbnail"> <img
				data-src="holder.js/300x200" alt="" src="images/1.jpg"> </a></li>
		<li class="span2"><a href="${pageContext.request.contextPath}/viewselectrequest.action?shop=4" class="thumbnail"> <img
				data-src="holder.js/300x200" alt="" src="images/2.jpg"> </a></li>
		<li class="span2"><a href="${pageContext.request.contextPath}/viewselectrequest.action?shop=3" class="thumbnail"> <img
				data-src="holder.js/300x200" alt="" src="images/4.jpg"> </a></li>
		</ul>
		<ul class="thumbnails" style="padding-left:120px">
		<li class="span2"><a href="${pageContext.request.contextPath}/viewselectrequest.action?shop=2" class="thumbnail"> <img
				data-src="holder.js/300x200" alt="" src="images/5.jpg"> </a></li>
		<li class="span2"><a href="${pageContext.request.contextPath}/viewselectrequest.action?shop=7" class="thumbnail"> <img
				data-src="holder.js/300x200" alt="" src="images/6.jpg"> </a></li>
		<li class="span2"><a href="${pageContext.request.contextPath}/viewselectrequest.action?shop=5" class="thumbnail"> <img
				data-src="holder.js/300x200" alt="" src="images/7.jpg"> </a></li>
	</ul>
	</div>
		</div>
		<div class="span3 well pull-right" style="margin-right:100px">
			<div>
				<jsp:include page="/WEB-INF/page/login.jsp" />
			</div>
		</div>
	</div>
	

</body>
</html>