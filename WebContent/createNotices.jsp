<%--
  Created by IntelliJ IDEA.
  User: Punmy
  Date: 16/6/5
  Time: 下午6:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="edu.fzu.softwareengineer.courseSite.domain.Notice,java.text.DecimalFormat"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Notice</title>
</head>
<body>
<form action="/teacher/createNotice.action" method="post" id="form" class="form-horizontal">

    <div>
        <label class="control-label" for="fundName">
            基金产品名称:
        </label>
        <div class="controls">
            <!--  input type="text" name="fundName" id="fundName" /> -->
            <s:textfield name="fund.fundName" id="fundName"/>
            <span style="color: red; font-size: 17;">&nbsp;*</span>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="fundPrice">
            基金产品价格:
        </label>
        <div class="controls">
            <!--  <input type="text" name="fund.fundPrice" id="fundPrice" />  -->
            <s:textfield name="fund.fundPrice" id="fundPrice"/>
            <span style="color: red; font-size: 17;">&nbsp;*</span>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="fundDes">
            基金产品描述:
        </label>
        <div class="controls">
            <!--  <input type="text" name="fundDes" id="fundDes" /> -->
            <s:textfield name="fund.fundDes"  id="fundDes"/>
        </div>
    </div>
    <div class="control-group">
        <label class="control-label" for="fundStatus">
            基金产品状态:
        </label>
        <div class="controls">
            <!--
                <select name="fundStatus" id="fundStatus" class="input-medium">
                    <option value="">
                        ==请选择==
                    </option>
                    <option value="Y">
                        可交易
                    </option>
                    <option value="N">
                        未上市交易
                    </option>
                </select>
                 -->
            <s:select class="input-medium"  id="fundStatus" name="fund.fundStatus"
                      list="#{'Y':'可交易','N':'未上市交易'}">
            </s:select>
            <span style="color: red; font-size: 17;">&nbsp;*</span>
        </div>
    </div>
    <div class="control-group controls">
        <button type="submit" class="btn btn-primary">
            添加
        </button>
    </div>
</form>
</body>
</html>
