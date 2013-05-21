<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="WEB-INF/page/css/bootstrap.css" >
<link rel="stylesheet" type="text/css" href="WEB-INF/page/css/bootstrap-responsive.css" >

<body>
	
	<div class="navbar navbar-static-top">
  		<div class="navbar-inner">
  			<div class="container">
  				<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
       				<span class="icon-bar"> </span>
        			<span class="icon-bar"> </span>
        			<span class="icon-bar"> </span>
     			 </a>
  				<a class="brand" href="#">拼朋</a>
  				<div class="nav-collapse collapse">
        			<ul class="nav">
  						<li><a href="#">首页</a></li>
  						<li class="divider-vertical"> </li>
  						<li><a href="#">个人空间</a></li>
  						<li class="divider-vertical"> </li>
	  					<li><a href="#">我要拼单</a></li>
	  					<li class="divider-vertical"> </li>
  						<li><a href="#">消息提醒</a></li>
  					</ul>
  					<form class="navbar-search pull-right">
  						<input type="text" class="search-query" placeholder="Search">
					</form>
      			</div>
  				
  			</div>
  		</div>
  	</div>	

	<table width="700" border="0" align="center" >
		<tr>
			<td align="left" height="80">
			<div width="490px" align="left" valign="top">
			</div>
			<div width="200px" align="right" valign="top"><jsp:include
					page="/WEB-INF/page/login.jsp" /></div>
			</td>
		</tr>
		<tr>
			<td align="left" valign="top" width="100%">
				<div>商铺专区</div>
				<table width="100%" border="0" >
					<tr>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
					</tr>

					<tr><td valign="top"><br></td><td valign="top"><br></td><td valign="top"><br></td><td valign="top"><br></td><td valign="top"><br></td></tr><tr>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
						<td>
							<table width="100%" >
								<tr>
									<td><img src="1.png">
									</td>
								</tr>
								<tr>
									<td><a hrep="#">1</a>
									</td>
								</tr>
							</table>
						</td>
					</tr>

				</table>
			</td>
		</tr>
	</table>
</body>
</html>
