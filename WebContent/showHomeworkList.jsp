<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
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
	<title>作业列表</title>
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
<h1>作业列表</h1>
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
			<th>删除作业</th>
		</tr>
		<s:iterator value="#request.HomeworkList" id="homework">
			<tr>
				<td><%=++i%></td>
				<td><a
					href="downloadAction?fileName=<s:property value="#homework.name"/>"><s:property
							value="#homework.name" /></a></td>
				<td><s:property value="#homework.downloadTimes" /></td>
				<td><s:property value="#homework.uploadDate" /></td>
				<!-- 删除作业的操作，只有老师可见 ,暂时先全部显示出来，之后用session判断用户角色是什么-->
				<td><a href="deletehomeworkAction?homeworkId=<s:property value="#homework.Rid"/>">删除</a></td>
			</tr>
		</s:iterator>
	</table>
	<s:debug></s:debug>
</body>
</html>