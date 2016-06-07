
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1">


<meta content="MSHTML 6.00.6000.16809" name="GENERATOR">

<title>请登录</title>
</head>
<body>
	<form action="student/login" method="post">
		账号：<s:textfield name="sno" label="账号"></s:textfield><br>
		密码：<s:password name="pwd" label="密码"></s:password><br>
	<s:submit value="登陆"></s:submit>
	</form>
	<a href="teacherLogin.jsp">老师登录</a>
</body>
</HTML>
