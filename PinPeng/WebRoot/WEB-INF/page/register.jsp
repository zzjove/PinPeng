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
	
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	

  </head>
  
  <body>
    <div class="container">
    <h3 class="text-info offset2">欢迎来到拼朋</h3>
    <form class="form-horizontal" action="register" method="post">
    	
    	<div class="control-group">
    		<label class="control-label" for="inputstudentid">学号</label>
    		<div class="controls">
    			<input type="text" name="studentid" id="inputstudentid" placeholder="学号" />
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputname">姓名</label>
    		<div class="controls">
    			<input type="text" name="name" id="inputname" placeholder="姓名" />
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputpassword">密码</label>
    		<div class="controls">
    			<input type="password" name="password" id="inputpassword" placeholder="密码" />
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputrepassword">密码确认</label>
    		<div class="controls">
    			<input type="password" name="repassword" id="inputrepassword" placeholder="再次输入密码" />
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputemail">邮箱</label>
    		<div class="controls">
    			<input type="email" name="email" id="inputemail" placeholder="邮箱" />
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputqqnumber">qq号码</label>
    		<div class="controls">
    			<input type="text" name="qqnumber" id="inputqqnumber" placeholder="qq号" />
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputtelnumber">手机号码</label>
    		<div class="controls">
    			<input type="text" name="telnumber" id="inputtelnumber" placeholder="手机号码" />
    		</div>
    	</div>

    	<div class="control-group">
    		<label class="control-label" for="inputsex">性别</label>
    		<div class="controls">
    			<label class="radio inline">
    				<input type="radio" name="sex" id="inputsex1" value="male" checked/>男
    			</label>
    			<label class="radio inline">
    				<input type="radio" name="sex" id="inputsex2" value="female"/>女
				</label>
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<label class="control-label" for="inputdormitory">寝室楼</label>
    		<div class="controls">
    			<select name="dormitory" id="inputdormitory">
    				<option value="5haolou">5号楼</option>
    				<option value="6haolou">6号楼</option>
    				<option value="7haolou">7号楼</option>
    				<option value="8haolou">8号楼</option>
    				<option value="9haolou">9号楼</option>
    				<option value="10haolou">10号楼</option>
    			</select>
    		</div>
    	</div>
    	
    	<div class="control-group">
    		<div class="controls">
    			<input type="submit" class="btn btn-primary" value="确认">
    		</div>
    	</div>
    </form>
    </div>
    
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
  </body>
</html>
