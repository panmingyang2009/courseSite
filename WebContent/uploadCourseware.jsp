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
	<!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/main.css">
    <link rel="stylesheet" type="text/css" href="css/onlinejudge.css">
    <link rel="stylesheet" type="text/css" href="css/blog.css">

    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">
    <title>Insert title here</title>
</head>
<body>
<s:form action="/resource/uploadCoursewareAction" enctype="multipart/form-data">
<s:file name="upload" label="选择文件1" /><br>
<s:file name="upload" label="选择文件2" /><br>
<s:file name="upload" label="选择文件3" /><br>
<s:file name="upload" label="选择文件4" /><br>
<s:file name="upload" label="选择文件5" /><br>
<s:submit value="上传" class="btn btn-lg btn-primary submit-btn"/>
</s:form>
<s:debug></s:debug>
</body>
</html>