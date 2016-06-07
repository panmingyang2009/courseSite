
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">

<title>请登录</title>
</head>
<body>
	<form action="teacher/login" method="post">
		账号<s:textfield name="tno" label="账号"></s:textfield><br>
		密码<s:password name="pwd" label="密码"></s:password><br>
	<s:submit label="登陆"></s:submit>
	</form>
	<a href="/login.jsp">学生登录</a>
</body>
</HTML>
