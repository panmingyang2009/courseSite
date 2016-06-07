<%--
  Created by IntelliJ IDEA.
  User: Punmy
  Date: 16/6/5
  Time: 下午6:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>发布通知</title>
</head>
<body>
<form action="teacher/createNotice" method="post" id="form">

    <div>
        <label for="title">
            标题:
        </label>
        <div>
            <s:textfield name="notice.title" id="title"/>
            <span style="color: red; font-size: 17;">&nbsp;*</span>
        </div>
    </div>
    <div>
        <label for="content">
            内容:
        </label>
        <div>
            <s:textarea name="notice.content" id="content"/>
            <span style="color: red; font-size: 17;">&nbsp;*</span>
        </div>
    </div>

    <div>
        <button type="submit">
            发布
        </button>
    </div>
</form>
</body>
</html>
