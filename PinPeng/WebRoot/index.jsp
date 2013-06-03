<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<import="org.apache.struts2.ServletActionContext">


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

<link rel="stylesheet" type="text/css" href="../css/bootstrap.css" >
<link rel="stylesheet" type="text/css" href="../css/bootstrap-responsive.css" >

<body>

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
