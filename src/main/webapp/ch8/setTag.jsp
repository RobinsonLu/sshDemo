<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'setTag.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <!-- 将表达式user.name的值保存在默认范围中，即action范围  -->
    <s:set name="name" value="user.name"/>
    <h3>从Action上下问中去取出name</h3>
    <!-- actionContext -->
    <s:property value="#name"/>
    <br/>
    <h3>从request范围中去取出name</h3>
    <s:property value="#request.name"/>
    
    <!-- 将表达式user.name的值保存session范围中 -->
    <h3>从session范围中去取出name</h3>
    <s:set name="name" value="user.name" scope="session"/>
    <s:property value="#session.name"/>
  </body>
</html>
