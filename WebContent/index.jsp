<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
 <%
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
	<base href="<%=basePath%>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>欢迎进入软件工程课程网站</title>
     <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="starter-template.css" rel="stylesheet">
    <link href="css/jumbotron.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">软件工程</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">退出</a></li>
          </ul>
        </div>
      </div>
    </nav>
    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
        	<ul class="nav nav-sidebar">&nbsp;</ul>
        	<ul class="nav nav-sidebar">
            	<li><a href="uploadCourseware.jsp">上传课件</a></li>
            	<li><a href="uploadHomework.jsp">上传作业</a></li>
            	<li><a href="resource/getCoursewareAction">下载课件</a></li>
            	<li><a href="resource/getHomeworkAction">下载作业</a></li>
            	<ul>
					<li><span><a href="test/showTest?testnum=1">选择题测试一</a></span></li>
					<li><span><a href="test/showTest?testnum=2">选择题测试二</a></span></li>
					<li><span><a href="test/showTest?testnum=3">选择题测试三</a></span></li>
					<li><span><a href="test/showTest?testnum=4">选择题测试四</a></span></li>
					<li><span><a href="test/showTest?testnum=5">选择题测试五</a></span></li>
				</ul>
				<li><a href="student/findAllNotices">Notices</a></li>
         	</ul>
        </div>


      </div>
    </div>
	
<s:debug></s:debug>
</body>
</html>