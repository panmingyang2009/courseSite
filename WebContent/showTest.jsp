<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
    <link href="css/dashboard.css" rel="stylesheet"><title>Insert title here</title>
</head>
<body>
	<% int i=1; %>
	<form action="getScoreTest" method="post">
	<ul class="judge-list">
		<s:iterator value="#request.testList" var="question">
		<li class="judge">
		<%= i+"." %><s:property value="#question.content" /><br/>
		<input type="radio" name="question<%=i %>" value="A"><s:property value="#question.choiceA" /></input><br/>
		<input type="radio" name="question<%=i %>" value="B"><s:property value="#question.choiceB" /></input><br/>
		<input type="radio" name="question<%=i %>" value="C"><s:property value="#question.choiceC" /></input><br/>
		<input type="radio" name="question<%=i++ %>" value="D"><s:property value="#question.choiceD" /></input><br/>
		</li>
		</s:iterator>
	</ul>
	<input type="hidden" name="number" value=<%=i-1 %> />
	<input type="hidden" name="testnum" value=<%=request.getParameter("testnum") %> />
	<input type="submit" name="judge" class="btn btn-lg btn-primary submit-btn" value="提交" />
	</form>
</body>
</html>