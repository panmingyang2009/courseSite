<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath(); // /openfund
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
	<title>下载课件</title>
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/blog.css">
    <link rel="stylesheet" type="text/css" href="css/resourcemanage.css">

    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>
</head>
<body>
	<h1>课件列表</h1>
	<%
		int i = 0;
	%>
	 <table class="table table-striped">
		<tr>
			<th>序号</th>
			<th>文件名</th>
			<th>下载次数</th>
			<th>上传时间</th>
			<!-- 删除操作，只有老师可见 -->
			<th>删除课件</th>
		</tr>
		<s:iterator value="#request.CoursewareList" id="courseware">
			<tr>
				<td><%=++i%></td>
				<td><a
					href="downloadAction?fileName=<s:property value="#courseware.name"/>"><s:property
							value="#courseware.name" /></a></td>
				<td><s:property value="#courseware.downloadTimes" /></td>
				<td><s:property value="#courseware.uploadDate" /></td>
				<!-- 删除课件的操作，只有老师可见 ,暂时先全部显示出来，之后用session判断用户角色是什么-->
				<td><a href="deleteCoursewareAction?coursewareId=<s:property value="#courseware.Rid"/>">删除</a></td>
			</tr>
		</s:iterator>
	</table>
	<s:debug></s:debug>
</body>
</html>